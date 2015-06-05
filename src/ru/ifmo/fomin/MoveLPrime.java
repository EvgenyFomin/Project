package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveLPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveL();
        instructions.moveL();
        instructions.moveL();

    }

    public void undo() {

        final MoveL moveL = new MoveL();
        moveL.execute();

    }
}
