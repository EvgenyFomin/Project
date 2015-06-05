package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveBw implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveB();
        instructions.moveS();
        instructions.moveS();
        instructions.moveS();

    }

    public void undo() {

        final MoveBwPrime bwPrime = new MoveBwPrime();
        bwPrime.execute();

    }

}
