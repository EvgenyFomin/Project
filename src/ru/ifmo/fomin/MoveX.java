package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveX implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveR();
        instructions.moveM();
        instructions.moveM();
        instructions.moveM();
        instructions.moveL();
        instructions.moveL();
        instructions.moveL();
    }

    @Override
    public void undo() {

        final MoveXPrime xPrime = new MoveXPrime();
        xPrime.execute();

    }
}
