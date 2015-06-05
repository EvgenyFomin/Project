package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveEPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveE();
        instructions.moveE();
        instructions.moveE();

    }

    public void undo() {

        final MoveE moveE = new MoveE();
        moveE.execute();

    }
}
