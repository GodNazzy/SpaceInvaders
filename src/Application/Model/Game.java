package Application.Model;

public class Game {

    private final Ship ship = new Ship();
    private Shot shot= new Shot(ship.getX(), ship.getY());
    private static final Game instance = new Game();
    private Game() {
    }
    public static Game getInstance() {
        return instance;
    }

    public void MoveRight() {
        ship.moveRight();
    }
    public void MoveLeft(){
        ship.moveLeft();
    }

    public void stopMovement() {
    }

    public void shoot(){

        shot=new Shot(ship.getX(), ship.getY());

    }

    public void update(boolean drawshot) {
        if (drawshot==true){
            shot.shoot();
        }

    }

    public Ship getShip() {
        return ship;
    }
    public Shot getShot(){return shot;}


}
