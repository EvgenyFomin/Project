package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveFPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveF();
        instructions.moveF();
        instructions.moveF();

    }

    public void undo() {

        final MoveF moveF = new MoveF();
        moveF.execute();

    }
}
