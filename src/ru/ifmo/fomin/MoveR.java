package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveR implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveR();

    }

    @Override
    public void undo() {

        final MoveRPrime rPrime = new MoveRPrime();
        rPrime.execute();

    }
}
