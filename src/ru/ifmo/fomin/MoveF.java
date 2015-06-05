package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveF implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveF();

    }

    public void undo() {

        final MoveFPrime fPrime = new MoveFPrime();
        fPrime.execute();

    }
}
