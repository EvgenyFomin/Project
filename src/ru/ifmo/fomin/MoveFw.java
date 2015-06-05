package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveFw implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveF();
        instructions.moveS();

    }

    public void undo() {

        final MoveFwPrime fwPrime = new MoveFwPrime();
        fwPrime.execute();

    }
}
