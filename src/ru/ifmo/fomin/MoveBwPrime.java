package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveBwPrime implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveB();
        instructions.moveB();
        instructions.moveB();
        instructions.moveS();

    }

    public void undo() {

        final MoveBw moveBw = new MoveBw();
        moveBw.execute();

    }

}
