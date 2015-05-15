package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveBw implements Execute {

    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveB();
        fill.moveS();
        fill.moveS();
        fill.moveS();


    }

}
