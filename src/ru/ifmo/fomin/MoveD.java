package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveD implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        instructions.moveD();
    }

    public void undo() {

        final MoveDPrime dPrime = new MoveDPrime();
        dPrime.execute();

    }
}
