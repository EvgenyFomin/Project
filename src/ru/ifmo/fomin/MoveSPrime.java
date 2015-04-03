package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveSPrime extends Fill implements Execute {
    @Override
    public void execute() {
        char[] j = {b[0][1], b[1][1], b[2][1]};
        for (int i = 0; i < 3; i++) {
            b[i][1] = a[1][2 - i];
            a[1][2 - i] = b[2 - i][7];
            b[2 - i][7] = c[1][i];
            c[1][i] = j[i];
        }
    }
}
