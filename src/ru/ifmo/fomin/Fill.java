package ru.ifmo.fomin;

import java.util.*;

/*---------Заполнение-массивов-----------*/
public class Fill {
    public static char[][] a = new char[3][3];
    public static char[][] b = new char[3][12];
    public static char[][] c = new char[3][3];
    int i, k;

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
        /*System.out.print("      ");
        for (i = 0; i < 3; i++)
            for (k = 0; k < 3; k++) {
                System.out.print(c[i][k] + " ");
                if ((k == 2) && (i != 2)) System.out.print("\n      ");
            }*/
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

    String moveIn = new String();
    String moveInEdit1 = new String();
    String moveInEdit2 = new String();
    int checkNumber = 1;

    public void setHashtable(Hashtable hs) {

        this.hashtable = hs;

    }

    public void Scan() {
        Instructions inst = new Instructions();
        System.out.println("\n Ваши ходы");
        Scanner scn = new Scanner(System.in);
        moveInEdit1 = scn.nextLine();
        moveInEdit1 += " ";
        moveIn = "";
        char[] chars = moveInEdit1.toCharArray();
        for (int i = 0; i < moveInEdit1.length(); i++) {
            if (chars[i] != '2')
                moveIn += chars[i];
            else checkNumber++;
            if (chars[i] == ' ') {
                moveIn = inst.Instructions(moveIn);
                if (inst.bool) {
                    checkNumber *= 2;
                    moveInEdit2 = moveIn.substring(0, moveIn.indexOf(" ") + 1);
                    moveIn = moveIn.substring(moveIn.indexOf(" ") + 1, moveIn.lastIndexOf(" ") + 1);
                }
                for (int k = 0; k < checkNumber; k++) {
                    hashtable.get(moveIn).execute();
                    if (inst.bool) moveIn = moveInEdit2;
                    inst.bool = true;
                }
                moveIn = "";
                checkNumber = 1;
            }
        }
        System.out.println();
        output();

    }

}
