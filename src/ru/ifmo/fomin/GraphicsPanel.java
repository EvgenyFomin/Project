package ru.ifmo.fomin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class GraphicsPanel extends JComponent {

    protected JButton buttonU = new JButton("U");
    protected JButton buttonUPrime = new JButton("U'");
    protected JButton buttonu = new JButton("u");
    protected JButton buttonuPrime = new JButton("u'");
    protected JButton buttonR = new JButton("R");
    protected JButton buttonRPrime = new JButton("R'");
    protected JButton buttonr = new JButton("r");
    protected JButton buttonrPrime = new JButton("r'");
    protected JButton buttonL = new JButton("L");
    protected JButton buttonLPrime = new JButton("L'");
    protected JButton buttonl = new JButton("l");
    protected JButton buttonlPrime = new JButton("l'");
    protected JButton buttonD = new JButton("D");
    protected JButton buttonDPrime = new JButton("D'");
    protected JButton buttond = new JButton("d");
    protected JButton buttondPrime = new JButton("d'");
    protected JButton buttonB = new JButton("B");
    protected JButton buttonBPrime = new JButton("B'");
    protected JButton buttonb = new JButton("b");
    protected JButton buttonbPrime = new JButton("b'");
    protected JButton buttonF = new JButton("F");
    protected JButton buttonFPrime = new JButton("F'");
    protected JButton buttonf = new JButton("f");
    protected JButton buttonfPrime = new JButton("f'");
    protected JButton buttonx = new JButton("x");
    protected JButton buttony = new JButton("y");
    protected JButton buttonz = new JButton("z");
    protected JButton buttonxPrime = new JButton("x'");
    protected JButton buttonyPrime = new JButton("y'");
    protected JButton buttonzPrime = new JButton("z'");
    protected JButton buttonM = new JButton("M");
    protected JButton buttonS = new JButton("S");
    protected JButton buttonE = new JButton("E");
    protected JButton buttonMPrime = new JButton("M'");
    protected JButton buttonSPrime = new JButton("S'");
    protected JButton buttonEPrime = new JButton("E'");
    protected JButton buttonScramble = new JButton("Scramble");
    protected JButton buttonHelp = new JButton("Help");
    protected JButton buttonSolve = new JButton("Solve");
    protected JButton buttonUndo = new JButton("Undo");
    protected static boolean check = false;
    protected static boolean checkMoves = true;
    Fill fill = new Fill();

    private int R = 255;
    private int G = 255;
    private int B = 255;
    protected static int move = 0;
    private RectsPanel panel = new RectsPanel();

    List<Polygon> polygonList = new ArrayList();

    public static Hashtable<String, Execute> hashtable;

    public void setHashtable(Hashtable hs) {

        this.hashtable = hs;

    }

    private class RectsPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Polygon polygon : polygonList) {
                polygon.drawPolygon(g);
            }
        }

    }

    private class Polygon {
        int[] x = {110, 120, 140, 130};
        int[] y = {70, 60, 60, 70};
        int n;
        Color color;

        public Polygon(int[] x, int[] y, int n, Color color) {
            this.x = x;
            this.y = y;
            this.n = n;
            this.color = color;

        }

        public void drawPolygon(Graphics g) {

            g.setColor(color);
            g.fillPolygon(x, y, n);
            g.setColor(Color.BLACK);
            g.drawPolygon(x, y, n);

        }
    }


    protected void frame() {

        JFrame jFrame = new JFrame("Rubik's Cube");
        jFrame.setSize(new Dimension(600, 400));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridBagLayout());
        jFrame.setResizable(false);

        JPanel panel1 = new JPanel();

        buttonU.addActionListener(new ButtonActionListener());
        buttonUPrime.addActionListener(new ButtonActionListener());
        buttonu.addActionListener(new ButtonActionListener());
        buttonuPrime.addActionListener(new ButtonActionListener());
        buttonR.addActionListener(new ButtonActionListener());
        buttonRPrime.addActionListener(new ButtonActionListener());
        buttonr.addActionListener(new ButtonActionListener());
        buttonrPrime.addActionListener(new ButtonActionListener());
        buttonL.addActionListener(new ButtonActionListener());
        buttonLPrime.addActionListener(new ButtonActionListener());
        buttonl.addActionListener(new ButtonActionListener());
        buttonlPrime.addActionListener(new ButtonActionListener());
        buttonD.addActionListener(new ButtonActionListener());
        buttonDPrime.addActionListener(new ButtonActionListener());
        buttond.addActionListener(new ButtonActionListener());
        buttondPrime.addActionListener(new ButtonActionListener());
        buttonB.addActionListener(new ButtonActionListener());
        buttonBPrime.addActionListener(new ButtonActionListener());
        buttonb.addActionListener(new ButtonActionListener());
        buttonbPrime.addActionListener(new ButtonActionListener());
        buttonF.addActionListener(new ButtonActionListener());
        buttonFPrime.addActionListener(new ButtonActionListener());
        buttonf.addActionListener(new ButtonActionListener());
        buttonfPrime.addActionListener(new ButtonActionListener());
        buttonM.addActionListener(new ButtonActionListener());
        buttonS.addActionListener(new ButtonActionListener());
        buttonE.addActionListener(new ButtonActionListener());
        buttonMPrime.addActionListener(new ButtonActionListener());
        buttonSPrime.addActionListener(new ButtonActionListener());
        buttonEPrime.addActionListener(new ButtonActionListener());
        buttonx.addActionListener(new ButtonActionListener());
        buttony.addActionListener(new ButtonActionListener());
        buttonz.addActionListener(new ButtonActionListener());
        buttonxPrime.addActionListener(new ButtonActionListener());
        buttonyPrime.addActionListener(new ButtonActionListener());
        buttonzPrime.addActionListener(new ButtonActionListener());
        buttonScramble.addActionListener(new ButtonActionListener());
        buttonHelp.addActionListener(new ButtonActionListener());
        buttonSolve.addActionListener(new ButtonActionListener());
        buttonUndo.addActionListener(new ButtonActionListener());

        jFrame.add(buttonU, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 350, 0, 0), 0, 0));
        jFrame.add(buttonUPrime, new GridBagConstraints(2, 0, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonu, new GridBagConstraints(3, 0, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonuPrime, new GridBagConstraints(4, 0, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonR, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonRPrime, new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonr, new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 3, 0));
        jFrame.add(buttonrPrime, new GridBagConstraints(4, 1, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 3, 0));
        jFrame.add(buttonL, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 350, 0, 0), 2, 0));
        jFrame.add(buttonLPrime, new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 2, 0));
        jFrame.add(buttonl, new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 5, 0));
        jFrame.add(buttonlPrime, new GridBagConstraints(4, 2, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 5, 0));
        jFrame.add(buttonD, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonDPrime, new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttond, new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttondPrime, new GridBagConstraints(4, 3, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonB, new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonBPrime, new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonb, new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonbPrime, new GridBagConstraints(4, 4, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonF, new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 3, 0));
        jFrame.add(buttonFPrime, new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 3, 0));
        jFrame.add(buttonf, new GridBagConstraints(3, 5, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 4, 0));
        jFrame.add(buttonfPrime, new GridBagConstraints(4, 5, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 4, 0));
        jFrame.add(buttonM, new GridBagConstraints(1, 6, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonMPrime, new GridBagConstraints(2, 6, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 0, 0));
        jFrame.add(buttonS, new GridBagConstraints(1, 7, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 3, 0));
        jFrame.add(buttonSPrime, new GridBagConstraints(2, 7, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 3, 0));
        jFrame.add(buttonE, new GridBagConstraints(1, 8, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 4, 0));
        jFrame.add(buttonEPrime, new GridBagConstraints(2, 8, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 4, 0));
        jFrame.add(buttonx, new GridBagConstraints(3, 6, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 2, 0));
        jFrame.add(buttony, new GridBagConstraints(3, 7, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonz, new GridBagConstraints(3, 8, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonxPrime, new GridBagConstraints(4, 6, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 2, 0));
        jFrame.add(buttonyPrime, new GridBagConstraints(4, 7, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonzPrime, new GridBagConstraints(4, 8, 1, 1, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.EAST,
                new Insets(0, 0, 0, 0), 1, 0));
        jFrame.add(buttonScramble, new GridBagConstraints(1, 8, 1, 1, 1, 1, GridBagConstraints.SOUTH, GridBagConstraints.SOUTH,
                new Insets(0, -300, 0, 0), 0, 0));
        jFrame.add(buttonHelp, new GridBagConstraints(1, 8, 1, 1, 1, 1, GridBagConstraints.SOUTH, GridBagConstraints.EAST,
                new Insets(0, -90, 0, 0), 35, 0));
        jFrame.add(buttonUndo, new GridBagConstraints(1, 8, 1, 1, 1, 1, GridBagConstraints.SOUTH, GridBagConstraints.EAST,
                new Insets(0, 126, 0, 0), 35, 0));
        jFrame.add(panel, new GridBagConstraints(1, 1, 5, 5, 7, 7, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(0, 30, 0, 300), 0, 0));

        Color color;

        color = Color.RED;
        polygonList.add(0, (new Polygon(new int[]{140, 140, 150, 150}, new int[]{100, 80, 70, 90}, 4, color)));
        polygonList.add(1, (new Polygon(new int[]{150, 150, 160, 160}, new int[]{90, 70, 60, 80}, 4, color)));
        polygonList.add(2, (new Polygon(new int[]{160, 160, 170, 170}, new int[]{80, 60, 50, 70}, 4, color)));
        polygonList.add(3, (new Polygon(new int[]{140, 140, 150, 150}, new int[]{120, 100, 90, 110}, 4, color)));
        polygonList.add(4, (new Polygon(new int[]{150, 150, 160, 160}, new int[]{110, 90, 80, 100}, 4, color)));
        polygonList.add(5, (new Polygon(new int[]{160, 160, 170, 170}, new int[]{100, 80, 70, 90}, 4, color)));
        polygonList.add(6, (new Polygon(new int[]{140, 140, 150, 150}, new int[]{140, 120, 110, 130}, 4, color)));
        polygonList.add(7, (new Polygon(new int[]{150, 150, 160, 160}, new int[]{130, 110, 100, 120}, 4, color)));
        polygonList.add(8, (new Polygon(new int[]{160, 160, 170, 170}, new int[]{120, 100, 90, 110}, 4, color)));
        color = Color.WHITE;
        polygonList.add(9, (new Polygon(new int[]{100, 110, 130, 120}, new int[]{60, 50, 50, 60}, 4, color)));
        polygonList.add(10, (new Polygon(new int[]{120, 130, 150, 140}, new int[]{60, 50, 50, 60}, 4, color)));
        polygonList.add(11, (new Polygon(new int[]{140, 150, 170, 160}, new int[]{60, 50, 50, 60}, 4, color)));
        polygonList.add(12, (new Polygon(new int[]{90, 100, 120, 110}, new int[]{70, 60, 60, 70}, 4, color)));
        polygonList.add(13, (new Polygon(new int[]{110, 120, 140, 130}, new int[]{70, 60, 60, 70}, 4, color)));
        polygonList.add(14, (new Polygon(new int[]{130, 140, 160, 150}, new int[]{70, 60, 60, 70}, 4, color)));
        polygonList.add(15, (new Polygon(new int[]{80, 90, 110, 100}, new int[]{80, 70, 70, 80}, 4, color)));
        polygonList.add(16, (new Polygon(new int[]{100, 110, 130, 120}, new int[]{80, 70, 70, 80}, 4, color)));
        polygonList.add(17, (new Polygon(new int[]{120, 130, 150, 140}, new int[]{80, 70, 70, 80}, 4, color)));
        color = Color.GREEN;
        polygonList.add(18, (new Polygon(new int[]{80, 80, 100, 100}, new int[]{100, 80, 80, 100}, 4, color)));
        polygonList.add(19, (new Polygon(new int[]{100, 100, 120, 120}, new int[]{100, 80, 80, 100}, 4, color)));
        polygonList.add(20, (new Polygon(new int[]{120, 120, 140, 140}, new int[]{100, 80, 80, 100}, 4, color)));
        polygonList.add(21, (new Polygon(new int[]{80, 80, 100, 100}, new int[]{120, 100, 100, 120}, 4, color)));
        polygonList.add(22, (new Polygon(new int[]{100, 100, 120, 120}, new int[]{120, 100, 100, 120}, 4, color)));
        polygonList.add(23, (new Polygon(new int[]{120, 120, 140, 140}, new int[]{120, 100, 100, 120}, 4, color)));
        polygonList.add(24, (new Polygon(new int[]{80, 80, 100, 100}, new int[]{140, 120, 120, 140}, 4, color)));
        polygonList.add(25, (new Polygon(new int[]{100, 100, 120, 120}, new int[]{140, 120, 120, 140}, 4, color)));
        polygonList.add(26, (new Polygon(new int[]{120, 120, 140, 140}, new int[]{140, 120, 120, 140}, 4, color)));

        jFrame.setVisible(true);

    }




    private class ButtonActionListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {


            int numberOfPolygon = 0;

            Fill fill = new Fill();
            Undo undo = new Undo();
            CheckEnd checkEnd = new CheckEnd();

            hashtable.get(((JButton) e.getSource()).getText()).execute();
            if (((JButton) e.getSource()).getText() != "Undo" && ((JButton) e.getSource()).getText() != "Help" && ((JButton) e.getSource()).getText() != "Scramble") {
                if (!checkMoves)
                    for (int i = 0; i < 9; i++) undo.moves[i] = undo.moves[i+1];

                undo.moves[move] = ((JButton) e.getSource()).getText();
                move++;
                if (move == 10) {

                    checkMoves = false;
                    move--;

                }

            }

            Color color = new Color(R, G, B);

                        /*--------------------Обновление-положения-куба--------------------*/

            for (int i = 0; i < 3; i++)
                for (int j = 6; j < 9; j++) {


                    switch (fill.b[i][j]) {

                        case 'R':
                            color = new Color(255, 0, 0);
                            break;
                        case 'G':
                            color = new Color(0, 255, 0);
                            break;
                        case 'B':
                            color = new Color(0, 0, 255);
                            break;
                        case 'W':
                            color = new Color(255, 255, 255);
                            break;
                        case 'Y':
                            color = new Color(255, 255, 0);
                            break;
                        case 'O':
                            color = new Color(255, 150, 0);
                            break;

                    }

                    polygonList.set(numberOfPolygon, polygonList.get(numberOfPolygon)).color = color;
                    polygonList.add(polygonList.get(numberOfPolygon));
                    numberOfPolygon++;

                }


            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++) {

                    switch (fill.a[i][j]) {

                        case 'R':
                            color = new Color(255, 0, 0);
                            break;
                        case 'G':
                            color = new Color(0, 255, 0);
                            break;
                        case 'B':
                            color = new Color(0, 0, 255);
                            break;
                        case 'W':
                            color = new Color(255, 255, 255);
                            break;
                        case 'Y':
                            color = new Color(255, 255, 0);
                            break;
                        case 'O':
                            color = new Color(255, 150, 0);
                            break;

                    }

                    polygonList.set(numberOfPolygon, polygonList.get(numberOfPolygon)).color = color;
                    polygonList.add(polygonList.get(numberOfPolygon));
                    numberOfPolygon++;

                }

            for (int i = 0; i < 3; i++)
                for (int j = 3; j < 6; j++) {

                    switch (fill.b[i][j]) {

                        case 'R':
                            color = new Color(255, 0, 0);
                            break;
                        case 'G':
                            color = new Color(0, 255, 0);
                            break;
                        case 'B':
                            color = new Color(0, 0, 255);
                            break;
                        case 'W':
                            color = new Color(255, 255, 255);
                            break;
                        case 'Y':
                            color = new Color(255, 255, 0);
                            break;
                        case 'O':
                            color = new Color(255, 150, 0);
                            break;

                    }

                    polygonList.set(numberOfPolygon, polygonList.get(numberOfPolygon)).color = color;
                    polygonList.add(polygonList.get(numberOfPolygon));
                    numberOfPolygon++;

                }

            panel.repaint();
            if (check) checkEnd.execute();

        }

    }

}