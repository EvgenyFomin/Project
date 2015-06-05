package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveUw implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveU();
        instructions.moveE();
        instructions.moveE();
        instructions.moveE();

    }

    @Override
    public void undo() {

        final MoveUwPrime uwPrime = new MoveUwPrime();
        uwPrime.execute();

    }
}
