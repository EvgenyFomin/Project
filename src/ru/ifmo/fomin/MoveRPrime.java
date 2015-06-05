package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveRPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveR();
        instructions.moveR();
        instructions.moveR();

    }

    @Override
    public void undo() {

        final MoveR moveR = new MoveR();
        moveR.execute();

    }
}
