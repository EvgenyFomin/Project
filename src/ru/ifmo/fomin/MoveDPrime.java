package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveDPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveD();
        instructions.moveD();
        instructions.moveD();

    }

    public void undo() {

        final MoveD moveD = new MoveD();
        moveD.execute();

    }
}
