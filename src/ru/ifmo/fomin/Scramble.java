package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class Scramble implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();
        GraphicsPanel.check = true;
        int[] a = new int[20];
        for (int i = 0; i < 19; i++) {

            a[i] = (int) (Math.random() * 6);

            switch (a[i]) {

                case 0:
                    fill.moveR();
                    break;
                case 1:
                    fill.moveD();
                    break;
                case 2:
                    fill.moveL();
                    break;
                case 3:
                    fill.moveB();
                    break;
                case 4:
                    fill.moveF();
                    break;
                case 5:
                    fill.moveU();
                    break;

            }

        }
    }
}
