package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveRwPrime implements Execute {

    @Override
    public void execute() {

        final Instructions instructions = new Instructions();
        instructions.moveR();
        instructions.moveR();
        instructions.moveR();
        instructions.moveM();

    }

    @Override
    public void undo() {

        final MoveRw moveRw = new MoveRw();
        moveRw.execute();

    }
}
