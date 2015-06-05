package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveRw implements Execute {


    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveM();
        instructions.moveM();
        instructions.moveM();
        instructions.moveR();

    }

    @Override
    public void undo() {

        final MoveRwPrime rwPrime = new MoveRwPrime();
        rwPrime.execute();

    }
}
