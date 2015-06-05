package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveFwPrime implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveF();
        instructions.moveF();
        instructions.moveF();
        instructions.moveS();
        instructions.moveS();
        instructions.moveS();

    }

    public void undo() {

        final MoveFw moveFw = new MoveFw();
        moveFw.execute();

    }

}
