package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveB implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveB();
    }
    public void undo() {
        final MoveBPrime bPrime = new MoveBPrime();
        bPrime.execute();
    }
}
