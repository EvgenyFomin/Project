package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveM implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();

        char[] j = {fill.a[0][1], fill.a[1][1], fill.a[2][1]};
        for (int i = 0; i < 3; i++) {
            fill.a[i][1] = fill.b[2 - i][10];
            fill.b[2 - i][10] = fill.c[i][1];
            fill.c[i][1] = fill.b[i][4];
        }
        fill.b[0][4] = j[0];
        fill.b[1][4] = j[1];
        fill.b[2][4] = j[2];
    }
}
