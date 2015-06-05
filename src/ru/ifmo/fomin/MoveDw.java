package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveDw implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveD();
        instructions.moveE();

    }

    public void undo() {

        final MoveDwPrime moveDwPrime = new MoveDwPrime();
        moveDwPrime.execute();

    }

}

