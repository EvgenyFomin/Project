package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveUPrime implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();


        char[] j = {fill.b[0][9], fill.b[0][10], fill.b[0][11], fill.a[2][0], fill.a[1][0]};
        for (int k = 11; k > 2; k--) fill.b[0][k] = fill.b[0][k - 3];
        fill.b[0][0] = j[0];
        fill.b[0][1] = j[1];
        fill.b[0][2] = j[2];
        fill.a[2][0] = fill.a[0][0];
        fill.a[0][0] = fill.a[0][2];
        fill.a[0][2] = fill.a[2][2];
        fill.a[2][2] = j[3];
        fill.a[1][0] = fill.a[0][1];
        fill.a[0][1] = fill.a[1][2];
        fill.a[1][2] = fill.a[2][1];
        fill.a[2][1] = j[4];
    }
}