package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveXPrime implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveR();
        instructions.moveR();
        instructions.moveR();
        instructions.moveM();
        instructions.moveL();
    }

    @Override
    public void undo() {

        final MoveX moveX = new MoveX();
        moveX.execute();

    }
}
