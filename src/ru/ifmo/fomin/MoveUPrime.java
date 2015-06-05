package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveUPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveU();
        instructions.moveU();
        instructions.moveU();

    }

    @Override
    public void undo() {

        final MoveU moveU = new MoveU();
        moveU.execute();

    }
}
