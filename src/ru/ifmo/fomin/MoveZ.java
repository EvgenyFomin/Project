package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveZ implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveF();
        instructions.moveS();
        instructions.moveB();
        instructions.moveB();
        instructions.moveB();

    }

    @Override
    public void undo() {

        final MoveZPrime zPrime = new MoveZPrime();
        zPrime.execute();

    }
}
