package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveS implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveS();

    }

    @Override
    public void undo() {

        final MoveSPrime sPrime = new MoveSPrime();
        sPrime.execute();

    }
}
