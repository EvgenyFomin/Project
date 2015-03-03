import java.util.*;

/*---------Заполнение-массивов-----------*/
public class Fill {
    char[][] a = new char[3][3];
    char[][] b = new char[3][12];
    char[][] c = new char[3][3];
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

/*----------Сканирование-ходов-и-изменение-положения----------*/
    String s1 = new String();
    String s = new String();
    String s2 = new String();
    int M2 = 1;
    public void Scan() {
        Instructions inst = new Instructions();
        System.out.println("\n Ваши ходы");
        Scanner scn = new Scanner(System.in);
        s1 = scn.nextLine();
        s1 += " ";
        s = "";
        char[] chars = s1.toCharArray();
        for (int ch = 0; ch < s1.length(); ch++) {
            if (chars[ch] != '2')
                s += chars[ch];
            else M2++;
            if (chars[ch] == ' ') {
                s = inst.Instructions(s);
                if (inst.bool) {
                    M2 *= 2;
                    s2 = s.substring(0, s.indexOf(" ") + 1);
                    s = s.substring(s.indexOf(" ") + 1, s.lastIndexOf(" ") + 1);
                }
                for (int z = 0; z < M2; z++) {
                    if (s.equals("U ")) {
                        moveU();
                    } else if (s.equals("U' ")) {
                        moveUprime();
                    } else if (s.equals("R ")) {
                        moveR();
                    } else if (s.equals("R' ")) {
                        moveRprime();
                    } else if (s.equals("L ")) {
                        moveL();
                    } else if (s.equals("L' ")) {
                        moveLprime();
                    } else if (s.equals("F ")) {
                        moveF();
                    } else if (s.equals("F' ")) {
                        moveFprime();
                    } else if (s.equals("D ")) {
                        moveD();
                    } else if (s.equals("D' ")) {
                        moveDprime();
                    } else if (s.equals("B ")) {
                        moveB();
                    } else if (s.equals("B' ")) {
                        moveBprime();
                    } else if (s.equals("M ")) {
                        moveM();
                    } else if (s.equals("M' ")) {
                        moveMprime();
                    } else if (s.equals("S ")) {
                        moveS();
                    } else if (s.equals("S' ")) {
                        moveSprime();
                    } else if (s.equals("E ")) {
                        moveE();
                    } else if (s.equals("E' ")) {
                        moveEprime();
                    } else if (s.equals("x ")) {
                        moveLprime();
                        moveMprime();
                        moveR();
                    } else if (s.equals("x' ")) {
                        moveL();
                        moveM();
                        moveRprime();
                    } else if (s.equals("y ")) {
                        moveU();
                        moveEprime();
                        moveDprime();
                    } else if (s.equals("y' ")) {
                        moveUprime();
                        moveE();
                        moveD();
                    } else if (s.equals("z ")) {
                        moveF();
                        moveS();
                        moveBprime();
                    } else if (s.equals("z' ")) {
                        moveFprime();
                        moveSprime();
                        moveB();
                    }
                    if (inst.bool) s = s2;
                    inst.bool = true;
                }
                s = "";
                M2 = 1;
            }
        }
        System.out.println();
        output();

    }
/*--------------------Инструкции--------------------*/
    private void moveEprime() {
        char[] j = {b[1][0], b[1][1], b[1][2]};
        for (int k = 0; k < 9; k++) b[1][k] = b[1][k + 3];
        b[1][9] = j[0];
        b[1][10] = j[1];
        b[1][11] = j[2];
    }

    private void moveE() {
        char[] j = {b[1][9], b[1][10], b[1][11]};
        for (int k = 11; k > 2; k--) b[1][k] = b[1][k - 3];
        b[1][0] = j[0];
        b[1][1] = j[1];
        b[1][2] = j[2];
    }

    private void moveSprime() {
        char[] j = {b[0][1], b[1][1], b[2][1]};
        for (int i = 0; i < 3; i++) {
            b[i][1] = a[1][2 - i];
            a[1][2 - i] = b[2 - i][7];
            b[2 - i][7] = c[1][i];
            c[1][i] = j[i];
        }
    }

    private void moveS() {
        char[] j = {b[0][1], b[1][1], b[2][1]};
        for (int i = 0; i < 3; i++) {
            b[i][1] = c[1][i];
            c[1][i] = b[2 - i][7];
            b[2 - i][7] = a[1][2 - i];
            a[1][2 - i] = j[i];
        }
    }

    private void moveMprime() {
        char[] j = {a[0][1], a[1][1], a[2][1]};
        for (int i = 0; i < 3; i++) {
            a[i][1] = b[i][4];
            b[i][4] = c[i][1];
            c[i][1] = b[2 - i][10];
        }
        b[0][10] = j[2];
        b[1][10] = j[1];
        b[2][10] = j[0];
    }

    private void moveM() {
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

    private void moveBprime() {
        char[] j = {b[0][0], b[1][0], b[2][0], b[0][9], b[0][10]};
        for (int i = 0; i < 3; i++) {
            b[i][0] = c[2][i];
            c[2][i] = b[2 - i][8];
            b[2 - i][8] = a[0][2 - i];
            a[0][2 - i] = j[i];
        }

        b[0][9] = b[0][11];
        b[0][11] = b[2][11];
        b[2][11] = b[2][9];
        b[2][9] = j[3];

        b[0][10] = b[1][11];
        b[1][11] = b[2][10];
        b[2][10] = b[1][9];
        b[1][9] = j[4];
    }

    private void moveB() {
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

    private void moveDprime() {
        char[] j = {b[2][0], b[2][1], b[2][2], c[2][0], c[1][0]};
        for (int k = 3; k < 12; k++) b[2][k - 3] = b[2][k];
        b[2][9] = j[0];
        b[2][10] = j[1];
        b[2][11] = j[2];

        c[2][0] = c[0][0];
        c[0][0] = c[0][2];
        c[0][2] = c[2][2];
        c[2][2] = j[3];

        c[1][0] = c[0][1];
        c[0][1] = c[1][2];
        c[1][2] = c[2][1];
        c[2][1] = j[4];
    }

    private void moveD() {
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

    private void moveFprime() {
        char[] j = {b[0][2], b[1][2], b[2][2], b[0][3], b[0][4]};
        for (int i = 0; i < 3; i++) {
            b[i][2] = a[2][2 - i];
            a[2][2 - i] = b[2 - i][6];
            b[2 - i][6] = c[0][i];
            c[0][i] = j[i];
        }

        b[0][3] = b[0][5];
        b[0][5] = b[2][5];
        b[2][5] = b[2][3];
        b[2][3] = j[3];

        b[0][4] = b[1][5];
        b[1][5] = b[2][4];
        b[2][4] = b[1][3];
        b[1][3] = j[4];
    }

    private void moveF() {
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

    private void moveU() {
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
    private void moveUprime() {
        char[] j = {b[0][9], b[0][10], b[0][11], a[2][0], a[1][0]};
        for (int k = 11; k > 2; k--) b[0][k] = b[0][k - 3];
        b[0][0] = j[0];
        b[0][1] = j[1];
        b[0][2] = j[2];
        a[2][0] = a[0][0];
        a[0][0] = a[0][2];
        a[0][2] = a[2][2];
        a[2][2] = j[3];
        a[1][0] = a[0][1];
        a[0][1] = a[1][2];
        a[1][2] = a[2][1];
        a[2][1] = j[4];
    }
    private void moveR() {
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
    private void moveRprime() {
        char[] j = {a[0][2], a[1][2], a[2][2], b[2][6], b[1][6]};
        for (int i = 0; i < 3; i++) {
            a[i][2] = b[2 - i][9];
            b[2 - i][9] = c[i][2];
            c[i][2] = b[i][5];
        }
        b[0][5] = j[0];
        b[1][5] = j[1];
        b[2][5] = j[2];

        b[2][6] = b[0][6];
        b[0][6] = b[0][8];
        b[0][8] = b[2][8];
        b[2][8] = j[3];

        b[1][6] = b[0][7];
        b[0][7] = b[1][8];
        b[1][8] = b[2][7];
        b[2][7] = j[4];
    }
    private void moveL() {
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
    private void moveLprime() {
        char[] j = {a[0][0], a[1][0], a[2][0], b[2][2], b[1][2]};
        for (int i = 0; i < 3; i++) {
            a[i][0] = b[i][3];
            b[i][3] = c[i][0];
            c[i][0] = b[2 - i][11];
        }
        b[0][11] = j[2];
        b[1][11] = j[1];
        b[2][11] = j[0];

        b[2][2] = b[2][0];
        b[2][0] = b[0][0];
        b[0][0] = b[0][2];
        b[0][2] = j[3];

        b[1][2] = b[2][1]; 
        b[2][1] = b[1][0];
        b[1][0] = b[0][1];
        b[0][1] = j[4];
    }
}
<<<<<<< HEAD

=======
>>>>>>> b14152b07cd49d55f34468d7ab1cabff3d5e2b4c
