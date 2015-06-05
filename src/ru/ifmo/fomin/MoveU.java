package ru.ifmo.fomin;

/**
 * Created by wolfram on 02.04.15.
 */
public class MoveU implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveU();

    }

    @Override
    public void undo() {

        final MoveUPrime uPrime = new MoveUPrime();
        uPrime.execute();

    }
}
