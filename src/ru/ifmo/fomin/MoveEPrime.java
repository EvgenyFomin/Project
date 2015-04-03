package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveEPrime extends Fill implements Execute {


    @Override
    public void execute() {
        char[] j = {b[1][0], b[1][1], b[1][2]};
        for (int k = 0; k < 9; k++) b[1][k] = b[1][k + 3];
        b[1][9] = j[0];
        b[1][10] = j[1];
        b[1][11] = j[2];
    }
}
