package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveUwPrime implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveU();
        instructions.moveU();
        instructions.moveU();
        instructions.moveE();

    }

    @Override
    public void undo() {

        final MoveUw moveUw = new MoveUw();
        moveUw.execute();

    }
}
