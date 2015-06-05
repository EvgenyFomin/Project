package ru.ifmo.fomin;

/**
 * Created by wolfram on 05.06.15.
 */
public class Instructions {

    Fill fill = new Fill();

    protected void moveR() {



        char[] j = {fill.a[0][2], fill.a[1][2], fill.a[2][2], fill.b[2][6], fill.b[1][6]};
        for (int i = 0; i < 3; i++) {
            fill.a[i][2] = fill.b[i][5];
            fill.b[i][5] = fill.c[i][2];
            fill.c[i][2] = fill.b[2 - i][9];
        }
        fill.b[0][9] = j[2];
        fill.b[1][9] = j[1];
        fill.b[2][9] = j[0];

        fill.b[2][6] = fill.b[2][8];
        fill.b[2][8] = fill.b[0][8];
        fill.b[0][8] = fill.b[0][6];
        fill.b[0][6] = j[3];

        fill.b[1][6] = fill.b[2][7];
        fill.b[2][7] = fill.b[1][8];
        fill.b[1][8] = fill.b[0][7];
        fill.b[0][7] = j[4];


    }

    protected void moveU() {

        char[] j = {fill.b[0][0], fill.b[0][1], fill.b[0][2], fill.a[2][0], fill.a[1][0]};
        for (int k = 3; k < 12; k++) fill.b[0][k - 3] = fill.b[0][k];
        fill.b[0][9] = j[0];
        fill.b[0][10] = j[1];
        fill.b[0][11] = j[2];
        fill.a[2][0] = fill.a[2][2];
        fill.a[2][2] = fill.a[0][2];
        fill.a[0][2] = fill.a[0][0];
        fill.a[0][0] = j[3];
        fill.a[1][0] = fill.a[2][1];
        fill.a[2][1] = fill.a[1][2];
        fill.a[1][2] = fill.a[0][1];
        fill.a[0][1] = j[4];

    }

    protected void moveL() {

        char[] j = {fill.a[0][0], fill.a[1][0], fill.a[2][0], fill.b[2][2], fill.b[1][2]};
        for (int i = 0; i < 3; i++) {
            fill.a[i][0] = fill.b[2 - i][11];
            fill.b[2 - i][11] = fill.c[i][0];
            fill.c[i][0] = fill.b[i][3];
        }
        fill.b[0][3] = j[0];
        fill.b[1][3] = j[1];
        fill.b[2][3] = j[2];

        fill.b[2][2] = fill.b[0][2];
        fill.b[0][2] = fill.b[0][0];
        fill.b[0][0] = fill.b[2][0];
        fill.b[2][0] = j[3];

        fill.b[1][2] = fill.b[0][1];
        fill.b[0][1] = fill.b[1][0];
        fill.b[1][0] = fill.b[2][1];
        fill.b[2][1] = j[4];

    }

    protected void moveF() {

        char[] j = {fill.b[0][2], fill.b[1][2], fill.b[2][2], fill.b[0][3], fill.b[0][4]};
        for (int i = 0; i < 3; i++) {
            fill.b[i][2] = fill.c[0][i];
            fill.c[0][i] = fill.b[2 - i][6];
            fill.b[2 - i][6] = fill.a[2][2 - i];
            fill.a[2][2 - i] = j[i];
        }
        fill.b[0][3] = fill.b[2][3];
        fill.b[2][3] = fill.b[2][5];
        fill.b[2][5] = fill.b[0][5];
        fill.b[0][5] = j[3];

        fill.b[0][4] = fill.b[1][3];
        fill.b[1][3] = fill.b[2][4];
        fill.b[2][4] = fill.b[1][5];
        fill.b[1][5] = j[4];

    }

    protected void moveD() {

        char[] j = {fill.b[2][9], fill.b[2][10], fill.b[2][11], fill.c[2][0], fill.c[1][0]};
        for (int k = 11; k > 2; k--) fill.b[2][k] = fill.b[2][k - 3];
        fill.b[2][0] = j[0];
        fill.b[2][1] = j[1];
        fill.b[2][2] = j[2];

        fill.c[2][0] = fill.c[2][2];
        fill.c[2][2] = fill.c[0][2];
        fill.c[0][2] = fill.c[0][0];
        fill.c[0][0] = j[3];

        fill.c[1][0] = fill.c[2][1];
        fill.c[2][1] = fill.c[1][2];
        fill.c[1][2] = fill.c[0][1];
        fill.c[0][1] = j[4];

    }

    protected void moveB() {

        char[] j = {fill.b[0][0], fill.b[1][0], fill.b[2][0], fill.b[0][9], fill.b[0][10]};
        for (int i = 0; i < 3; i++) {
            fill.b[i][0] = fill.a[0][2 - i];
            fill.a[0][2 - i] = fill.b[2 - i][8];
            fill.b[2 - i][8] = fill.c[2][i];
            fill.c[2][i] = j[i];
        }

        fill.b[0][9] = fill.b[2][9];
        fill.b[2][9] = fill.b[2][11];
        fill.b[2][11] = fill.b[0][11];
        fill.b[0][11] = j[3];

        fill.b[0][10] = fill.b[1][9];
        fill.b[1][9] = fill.b[2][10];
        fill.b[2][10] = fill.b[1][11];
        fill.b[1][11] = j[4];

    }

    protected void moveS() {

        char[] j = {fill.b[0][1], fill.b[1][1], fill.b[2][1]};
        for (int i = 0; i < 3; i++) {
            fill.b[i][1] = fill.c[1][i];
            fill.c[1][i] = fill.b[2 - i][7];
            fill.b[2 - i][7] = fill.a[1][2 - i];
            fill.a[1][2 - i] = j[i];
        }

    }

    protected void moveM() {
        char[] j = {fill.a[0][1], fill.a[1][1], fill.a[2][1]};
        for (int i = 0; i < 3; i++) {
            fill.a[i][1] = fill.b[2 - i][10];
            fill.b[2 - i][10] = fill.c[i][1];
            fill.c[i][1] = fill.b[i][4];
        }
        fill.b[0][4] = j[0];
        fill.b[1][4] = j[1];
        fill.b[2][4] = j[2];
    }

    protected void moveE() {

        char[] j = {fill.b[1][9], fill.b[1][10], fill.b[1][11]};
        for (int k = 11; k > 2; k--) fill.b[1][k] = fill.b[1][k - 3];
        fill.b[1][0] = j[0];
        fill.b[1][1] = j[1];
        fill.b[1][2] = j[2];

    }

}
