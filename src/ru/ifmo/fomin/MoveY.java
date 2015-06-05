package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveY implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveU();
        instructions.moveE();
        instructions.moveE();
        instructions.moveE();
        instructions.moveD();
        instructions.moveD();
        instructions.moveD();
    }

    @Override
    public void undo() {

        final MoveYPrime yPrime = new MoveYPrime();
        yPrime.execute();

    }
}
