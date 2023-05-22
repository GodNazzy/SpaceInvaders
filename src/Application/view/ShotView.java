package Application.view;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class ShotView {

    private static Image img;
    static final int width=25;
    static final int height = 25;

    public ShotView() {
        try {

            img = ImageIO.read(getClass().getResourceAsStream("/Application/resource/shot2.png"));

        }
        catch(
                IOException exception) {
            exception.printStackTrace();
        }
    }
    public Image getImage(){
        return img;
    }
}
