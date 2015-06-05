package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveZPrime implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveF();
        instructions.moveF();
        instructions.moveF();
        instructions.moveS();
        instructions.moveS();
        instructions.moveS();
        instructions.moveB();

    }

    @Override
    public void undo() {

        final MoveZ moveZ = new MoveZ();
        moveZ.execute();

    }
}
