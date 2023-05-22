package Application.view;


import javax.swing.*;
import java.awt.*;

import Application.Model.Game;

public class GraphicPanel extends JPanel {

    boolean drawShot=false;
    ShotView shot= new ShotView();
    public GraphicPanel(){
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
            ShipView ship=new ShipView();
            g.drawImage(ShipView.getImage(), Game.getInstance().getShip().getX(), Game.getInstance().getShip().getY(), ship.width, ship.height, null);
            if(drawShot==true){

                g.drawImage(shot.getImage(), Game.getInstance().getShot().getX(), Game.getInstance().getShot().getY(), shot.width, shot.height, null);
                System.out.println(Game.getInstance().getShot().getY());
            }
    }

    public void update(boolean drawShot) {
        if (drawShot==true) {
            this.drawShot = true;
            //Game.getInstance().update();
        }
        else
            this.drawShot=false;

        repaint();
    }
}
