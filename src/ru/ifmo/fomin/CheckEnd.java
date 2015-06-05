package ru.ifmo.fomin;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wolfram on 26.04.15.
 */

public class CheckEnd implements Execute {

    char[][] a = new char[3][3];
    char[][] b = new char[3][12];
    char[][] c = new char[3][3];
    boolean checkEnd = true;

    protected void output() {

        GraphicsPanel graphicsPanel = new GraphicsPanel();

        JFrame jFrame = new JFrame("Congratulations!!!");
        JLabel label = new JLabel("Мои поздравления, человек!!");
        jFrame.setSize(new Dimension(300, 300));
        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        label.setVisible(true);


        jFrame.add(label);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(checkEnd);
        graphicsPanel.check = false;


    }

    @Override
    public void execute() {

        int i, k;

        Fill fill = new Fill();

        for (i = 0; i < 2; i++) {
            for (k = 0; k < 2; k++) {

                if ((fill.a[i][k] != fill.a[i][k + 1]) || (fill.c[i][k] != fill.c[i][k + 1]) || (fill.c[i + 1][k] != fill.c[i][k]) || (fill.a[i][k] != fill.a[i + 1][k])) {

                    checkEnd = false;
                    break;

                }
            }
            for (k = 0; k < 11; k++) {

                if ((k == 2) || (k == 5) || (k == 8)) continue;
                if ((fill.b[i][k] != fill.b[i][k + 1]) || (fill.b[i][k] != fill.b[i + 1][k])) {

                    checkEnd = false;
                    break;

                }
            }
        }


        if (checkEnd) output();

    }

    @Override
    public void undo() {

    }
}
