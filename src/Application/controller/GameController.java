package Application.controller;

import Application.view.GraphicPanel;
import Application.Model.Game;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameController implements KeyListener {

    private GraphicPanel panel;
    private boolean drawShot=false;

    public GameController(GraphicPanel panel) {

        this.panel=panel;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                Game.getInstance().MoveRight();
                System.out.println("destra");
                break;
            case KeyEvent.VK_LEFT:
                Game.getInstance().MoveLeft();
                System.out.println("sinistra");
                break;
            case KeyEvent.VK_SPACE:
                Game.getInstance().shoot();
                drawShot=true;
                break;
        }
        update();


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }


    public void update() {
        Game.getInstance().update(drawShot);
        panel.update(drawShot);


    }
}
