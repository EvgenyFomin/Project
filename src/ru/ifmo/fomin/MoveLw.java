package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveLw implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveL();
        instructions.moveM();

    }

    public void undo() {

        final MoveLwPrime lwPrime = new MoveLwPrime();
        lwPrime.execute();

    }

}
