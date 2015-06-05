package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveM implements Execute {
    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveM();

    }

    @Override
    public void undo() {

        final MoveMPrime moveMPrime = new MoveMPrime();
        moveMPrime.execute();

    }
}
