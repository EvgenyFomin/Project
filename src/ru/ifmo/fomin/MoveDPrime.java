package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveDPrime extends Fill implements Execute {
    @Override
    public void execute() {
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
}
