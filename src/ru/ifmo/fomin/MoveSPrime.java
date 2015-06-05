package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveSPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveS();
        instructions.moveS();
        instructions.moveS();

    }

    @Override
    public void undo() {

        final MoveS moveS = new MoveS();
        moveS.execute();

    }
}
