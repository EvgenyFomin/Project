package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveE implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();


        char[] j = {fill.b[1][9], fill.b[1][10], fill.b[1][11]};
        for (int k = 11; k > 2; k--) fill.b[1][k] = fill.b[1][k - 3];
        fill.b[1][0] = j[0];
        fill.b[1][1] = j[1];
        fill.b[1][2] = j[2];
    }
}
