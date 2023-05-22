package Application.Model;

import Application.view.GraphicPanel;

import java.awt.*;

public class Shot {

    private int x;
    private int y;
    private int raise;

    public Shot(int shipX, int shipY){

        this.x=shipX+11;
        this.y=shipY-10;
    }
    public void shoot(){


        int fps=1;
        raise++;
        if(raise >= 1 && raise<= 12) {

            y -= fps;
        }
        else {
            raise = 0;
        }


    }

    public int getX() {

        return x;
    }

    public int getY() {

        System.out.println(y+"ss");
        //y=Game.getInstance().getShip().getY()-10;
        return y;
    }
}
