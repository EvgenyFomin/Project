package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveB extends Fill implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();

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
}
