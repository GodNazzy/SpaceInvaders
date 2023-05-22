package Application;

import javax.swing.*;
import Application.view.GraphicPanel;
import Application.controller.GameController;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Animation Swing");
        GraphicPanel panel = new GraphicPanel();
        panel.setBackground(Color.black);
        GameController controller=new GameController(panel);
        panel.addKeyListener(controller);
        frame.add(panel);
        panel.setFocusable(true);
        panel.requestFocus();
        GameLoop gameLoop=new GameLoop(controller);
        frame.setResizable(false);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        gameLoop.start();
    }
}