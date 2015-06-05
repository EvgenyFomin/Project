package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveDwPrime implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveD();
        instructions.moveD();
        instructions.moveD();
        instructions.moveE();
        instructions.moveE();
        instructions.moveE();

    }

    public void undo() {

        final MoveDw moveDw = new MoveDw();
        moveDw.execute();

    }

}
