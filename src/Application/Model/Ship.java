package Application.Model;
import Application.view.GraphicPanel;
public class Ship {

    public Ship(){}
    private int x = 0;
    private int y = 670;



    public void moveRight(){
        x+=15;
    }
    public void moveLeft(){
        x-=15;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
