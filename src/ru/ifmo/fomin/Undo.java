package ru.ifmo.fomin;

import java.util.Hashtable;

/**
 * Created by wolfram on 29.05.15.
 */
public class Undo implements Execute{

    public static String[] moves = new String[10];

    @Override
    public void execute() {

        GraphicsPanel graphicsPanel = new GraphicsPanel();

        //System.out.println(graphicsPanel.hashtable.size());

        if (graphicsPanel.move!=0) {
            if (graphicsPanel.checkMoves) {
                graphicsPanel.move--;
            }
            graphicsPanel.hashtable.get(moves[graphicsPanel.move]).execute();
            graphicsPanel.hashtable.get(moves[graphicsPanel.move]).execute();
            graphicsPanel.hashtable.get(moves[graphicsPanel.move]).execute();
            graphicsPanel.checkMoves = true;
        }

    }

}
