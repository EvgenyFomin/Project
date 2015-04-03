package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveRPrime implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();

        char[] j = {fill.a[0][2], fill.a[1][2], fill.a[2][2], fill.b[2][6], fill.b[1][6]};
        for (int i = 0; i < 3; i++) {
            fill.a[i][2] = fill.b[2 - i][9];
            fill.b[2 - i][9] = fill.c[i][2];
            fill.c[i][2] = fill.b[i][5];
        }
        fill.b[0][5] = j[0];
        fill.b[1][5] = j[1];
        fill.b[2][5] = j[2];

        fill.b[2][6] = fill.b[0][6];
        fill.b[0][6] = fill.b[0][8];
        fill.b[0][8] = fill.b[2][8];
        fill.b[2][8] = j[3];

        fill.b[1][6] = fill.b[0][7];
        fill.b[0][7] = fill.b[1][8];
        fill.b[1][8] = fill.b[2][7];
        fill.b[2][7] = j[4];
    }
}
