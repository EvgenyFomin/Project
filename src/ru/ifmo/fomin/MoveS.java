package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveS implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();

        char[] j = {fill.b[0][1], fill.b[1][1], fill.b[2][1]};
        for (int i = 0; i < 3; i++) {
            fill.b[i][1] = fill.c[1][i];
            fill.c[1][i] = fill.b[2 - i][7];
            fill.b[2 - i][7] = fill.a[1][2 - i];
            fill.a[1][2 - i] = j[i];
        }
    }
}
