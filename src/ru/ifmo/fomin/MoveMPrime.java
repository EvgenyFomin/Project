package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveMPrime implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveM();
        instructions.moveM();
        instructions.moveM();

    }

    @Override
    public void undo() {

        final MoveM moveM = new MoveM();
        moveM.execute();

    }
}
