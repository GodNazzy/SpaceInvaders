package Application.view;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;


public class ShipView {

    static final int width = 50;
    static final int height = 50;

    private static Image img;
    public ShipView() {
        try {

            img = ImageIO.read(getClass().getResourceAsStream("/Application/resource/ship.png"));

        }
        catch(
        IOException exception) {
        exception.printStackTrace();
        }
    }

    public static Image getImage() {
        return img;
    }
}
