package ru.ifmo.fomin;

import javax.swing.*;
import java.awt.*;

public class ForUser implements Execute {

    @Override
    public void execute() {

        JFrame jFrame = new JFrame("Help");
        JLabel label = new JLabel();
        JTextArea textArea = new JTextArea();
        textArea.setColumns(50);
        jFrame.setSize(new Dimension(600, 400));
        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout());
        jFrame.setResizable(false);
        label.setVisible(true);

        label.setText("<html>Привет, человек! Я предлагаю тебе собрать кубик Рубика<br>" +
                "Вот как ты можешь управлять кубиком:<br>" +
                "Каждый твой ход обозначен большой латинской буквой - первая буква названия слоя<br>" +
                "Пример: U - поворот верхнго слоя по часовой стрелке<br>" +
                "Вот полный список обозначений внешних слоев: U, R, D, L, F, B<br>" +
                "Центральные слои обозначаются буквами M, S и E<br>" +
                "Относительно левого, фронтального, и нижнего слоёв соответственно они вращаются по часовой стрелке<br>" +
                "Движение двух соседних слоев задано малой латинской буквой - первая буква названия внешнего слоя<br>" +
                "Пример: u - поворот двух верхних слоев по часовой стрелке<br>" +
                "Вращение всего куба осуществляетя ходами x y z<br>" +
                "Относительно правого, фронтального, и верхнего слоев соответственно он вращается по часовой стрелке<br>" +
                "Движения против часовой стрелки дополнены штрихом в конце<br>" +
                "Пример: U' - поворот верхнего слоя против часовой стрелки<br>" +
                "В общем-то это все. Желаю удачи!<br>");
        jFrame.add(label);
        label.setVisible(true);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }

    public void undo() {    }
}
