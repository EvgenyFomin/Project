package ru.ifmo.fomin;

import javax.swing.*;
import java.util.*;

/*---------Заполнение-массивов-----------*/
public class Fill extends JComponent {
    public static char[][] a = new char[3][3];
    public static char[][] b = new char[3][12];
    public static char[][] c = new char[3][3];
    int i, k;
    private Rectangle rectangle;
    private Rectangle rectangle2;
    private Rectangle rectangle3;
    private Rectangle rectangle4;
    private Rectangle rectangle5;
    private Rectangle rectangle6;
    private Rectangle rectangle7;
    private Rectangle rectangle8;
    private Rectangle rectangle9;
    private Rectangle rectangle10;
    private JButton button;
    public int xpoints[] = {80, 90, 110, 100};
    public int ypoints[] = {80, 70, 70, 80};
    public int npoints = 4;

    public void fill() {
        for (i = 0; i < 3; i++)
            for (k = 0; k < 3; k++) {
                a[i][k] = 'W';
                c[i][k] = 'Y';
            }
        for (i = 0; i < 3; i++)
            for (k = 0; k < 12; k++) {
                if (k < 3) b[i][k] = 'O';
                else if ((k >= 3) && (k < 6)) b[i][k] = 'G';
                else if ((k >= 6) && (k < 9)) b[i][k] = 'R';
                else b[i][k] = 'B';
            }
        //System.out.println("Массивы успешно заполнены");
    }

    /*---------Вывод-массива-на-экран----------*/
    public void output() {
        System.out.print("      ");
        for (i = 0; i < 3; i++) {
            for (k = 0; k < 3; k++) {
                System.out.print(a[i][k] + " ");
            }
            if (i == 0) System.out.print("\n    ");
            if (i == 1) System.out.print(b[0][8] + "\n  ");
        }

        System.out.print(b[0][7] + " " + b[1][8] + "\n");
        for (i = 0; i < 3; i++) {
            for (k = 3; k < 7; k++) {
                System.out.print(b[i][k] + " ");
                if ((i == 0) && (k == 6)) System.out.print(b[1][7] + " " + b[2][8]);
                if ((i == 1) && (k == 6)) System.out.print(b[2][7]);
                if (k == 6) System.out.println();

            }



        }

    }
/*----------Изменяющийся-вывод----------*/
    /*public void output2(char[][] a, char[][] b, char[][] c) {
        System.out.print("      ");
        for (i = 0; i < 3; i++)
            for (k = 0; k < 3; k++) {
                System.out.print(a[i][k] + " ");
                if ((k == 2) && (i != 2)) System.out.print("\n      ");
            }
        System.out.println();
        for (i = 0; i < 3; i++)
            for (k = 0; k < 12; k++) {
                System.out.print(b[i][k] + " ");
                if (k == 11) System.out.println();
            }
        System.out.print("      ");
        for (i = 0; i < 3; i++)
            for (k = 0; k < 3; k++) {
                System.out.print(c[i][k] + " ");
                if ((k == 2) && (i != 2)) System.out.print("\n      ");
            }
    }
*/

/*-------------------------HashTable---------------------------*/


    Hashtable<String, Execute> hashtable;

    /*----------Сканирование-ходов-и-изменение-положения----------*/



    public void setHashtable(Hashtable hs) {

        this.hashtable = hs;

    }


    public void Scan() {


        for ( ; ; ) {

            System.out.println("\n Ваши ходы");
            Scanner scn = new Scanner(System.in);
            String moveIn = new String(scn.nextLine());
            if (moveIn.equals("exit")) break;
            if (hashtable.get(moveIn) != null) {

                hashtable.get(moveIn).execute();
                output();

            }
            else System.out.println("Строка введена не верно. Повторите попытку");

        }


    }



/*--------------Инструкции--------------*/



    protected void moveR() {

        char[] j = {a[0][2], a[1][2], a[2][2], b[2][6], b[1][6]};
        for (int i = 0; i < 3; i++) {
            a[i][2] = b[i][5];
            b[i][5] = c[i][2];
            c[i][2] = b[2 - i][9];
        }
        b[0][9] = j[2];
        b[1][9] = j[1];
        b[2][9] = j[0];

        b[2][6] = b[2][8];
        b[2][8] = b[0][8];
        b[0][8] = b[0][6];
        b[0][6] = j[3];

        b[1][6] = b[2][7];
        b[2][7] = b[1][8];
        b[1][8] = b[0][7];
        b[0][7] = j[4];

    }

    protected void moveU() {

        char[] j = {b[0][0], b[0][1], b[0][2], a[2][0], a[1][0]};
        for (int k = 3; k < 12; k++) b[0][k - 3] = b[0][k];
        b[0][9] = j[0];
        b[0][10] = j[1];
        b[0][11] = j[2];
        a[2][0] = a[2][2];
        a[2][2] = a[0][2];
        a[0][2] = a[0][0];
        a[0][0] = j[3];
        a[1][0] = a[2][1];
        a[2][1] = a[1][2];
        a[1][2] = a[0][1];
        a[0][1] = j[4];

    }

    protected void moveL() {

        char[] j = {a[0][0], a[1][0], a[2][0], b[2][2], b[1][2]};
        for (int i = 0; i < 3; i++) {
            a[i][0] = b[2 - i][11];
            b[2 - i][11] = c[i][0];
            c[i][0] = b[i][3];
        }
        b[0][3] = j[0];
        b[1][3] = j[1];
        b[2][3] = j[2];

        b[2][2] = b[0][2];
        b[0][2] = b[0][0];
        b[0][0] = b[2][0];
        b[2][0] = j[3];

        b[1][2] = b[0][1];
        b[0][1] = b[1][0];
        b[1][0] = b[2][1];
        b[2][1] = j[4];

    }

    protected void moveF() {

        char[] j = {b[0][2], b[1][2], b[2][2], b[0][3], b[0][4]};
        for (int i = 0; i < 3; i++) {
            b[i][2] = c[0][i];
            c[0][i] = b[2 - i][6];
            b[2 - i][6] = a[2][2 - i];
            a[2][2 - i] = j[i];
        }
        b[0][3] = b[2][3];
        b[2][3] = b[2][5];
        b[2][5] = b[0][5];
        b[0][5] = j[3];

        b[0][4] = b[1][3];
        b[1][3] = b[2][4];
        b[2][4] = b[1][5];
        b[1][5] = j[4];

    }

    protected void moveD() {

        char[] j = {b[2][9], b[2][10], b[2][11], c[2][0], c[1][0]};
        for (int k = 11; k > 2; k--) b[2][k] = b[2][k - 3];
        b[2][0] = j[0];
        b[2][1] = j[1];
        b[2][2] = j[2];

        c[2][0] = c[2][2];
        c[2][2] = c[0][2];
        c[0][2] = c[0][0];
        c[0][0] = j[3];

        c[1][0] = c[2][1];
        c[2][1] = c[1][2];
        c[1][2] = c[0][1];
        c[0][1] = j[4];

    }

    protected void moveB() {

        char[] j = {b[0][0], b[1][0], b[2][0], b[0][9], b[0][10]};
        for (int i = 0; i < 3; i++) {
            b[i][0] = a[0][2 - i];
            a[0][2 - i] = b[2 - i][8];
            b[2 - i][8] = c[2][i];
            c[2][i] = j[i];
        }

        b[0][9] = b[2][9];
        b[2][9] = b[2][11];
        b[2][11] = b[0][11];
        b[0][11] = j[3];

        b[0][10] = b[1][9];
        b[1][9] = b[2][10];
        b[2][10] = b[1][11];
        b[1][11] = j[4];

    }

    protected void moveS() {

        char[] j = {b[0][1], b[1][1], b[2][1]};
        for (int i = 0; i < 3; i++) {
            b[i][1] = c[1][i];
            c[1][i] = b[2 - i][7];
            b[2 - i][7] = a[1][2 - i];
            a[1][2 - i] = j[i];
        }

    }

    protected void moveM() {
    char[] j = {a[0][1], a[1][1], a[2][1]};
    for (int i = 0; i < 3; i++) {
        a[i][1] = b[2 - i][10];
        b[2 - i][10] = c[i][1];
        c[i][1] = b[i][4];
        }
    b[0][4] = j[0];
    b[1][4] = j[1];
    b[2][4] = j[2];
    }

    protected void moveE() {

        char[] j = {b[1][9], b[1][10], b[1][11]};
        for (int k = 11; k > 2; k--) b[1][k] = b[1][k - 3];
        b[1][0] = j[0];
        b[1][1] = j[1];
        b[1][2] = j[2];

    }

}
