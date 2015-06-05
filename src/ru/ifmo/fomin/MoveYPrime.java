package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveYPrime implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveU();
        instructions.moveU();
        instructions.moveU();
        instructions.moveE();
        instructions.moveD();
    }

    @Override
    public void undo() {

        final MoveY moveY = new MoveY();
        moveY.execute();

    }
}
