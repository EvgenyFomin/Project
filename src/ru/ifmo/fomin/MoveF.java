package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveF implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();

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
}
