package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveLwPrime implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveL();
        instructions.moveL();
        instructions.moveL();
        instructions.moveM();
        instructions.moveM();
        instructions.moveM();

    }

    public void undo() {

        final MoveLw moveLw = new MoveLw();
        moveLw.execute();

    }

}
