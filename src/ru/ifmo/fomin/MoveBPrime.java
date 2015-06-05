package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveBPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveB();
        instructions.moveB();
        instructions.moveB();

    }

    public void undo() {

        final MoveB moveB = new MoveB();
        moveB.execute();

    }
}
