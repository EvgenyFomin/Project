package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveD extends Fill implements Execute {
    @Override
    public void execute() {
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
}
