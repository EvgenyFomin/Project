package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveMPrime extends Fill implements Execute {
    @Override
    public void execute() {
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
}
