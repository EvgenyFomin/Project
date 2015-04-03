package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveFPrime extends Fill implements Execute {
    @Override
    public void execute() {
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
}
