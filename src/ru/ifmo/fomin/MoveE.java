package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveE implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveE();

    }

    public void undo() {

        final MoveEPrime ePrime = new MoveEPrime();
        ePrime.execute();

    }
}
