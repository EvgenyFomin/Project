package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class Scramble implements Execute {
    @Override
    public void execute() {
        final Instructions instructions = new Instructions();
        GraphicsPanel.check = true;
        int[] a = new int[20];
        for (int i = 0; i < 19; i++) {

            a[i] = (int) (Math.random() * 6);

            switch (a[i]) {

                case 0:
                    instructions.moveR();
                    break;
                case 1:
                    instructions.moveD();
                    break;
                case 2:
                    instructions.moveL();
                    break;
                case 3:
                    instructions.moveB();
                    break;
                case 4:
                    instructions.moveF();
                    break;
                case 5:
                    instructions.moveU();
                    break;

            }

        }
    }

    @Override
    public void undo() {

    }
}
