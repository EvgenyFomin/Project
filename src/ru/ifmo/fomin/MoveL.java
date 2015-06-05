package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveL implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveL();

    }

    public void undo() {

        final MoveLPrime lPrime = new MoveLPrime();
        lPrime.execute();

    }
}
