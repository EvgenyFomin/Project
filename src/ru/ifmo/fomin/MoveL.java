package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveL implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();


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
}
