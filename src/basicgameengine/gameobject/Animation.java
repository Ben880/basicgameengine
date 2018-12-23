package basicgameengine.gameobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/*
    BenjaminWilcox
    Dec 22, 2018
    BasicGameEngine
 */
public class Animation
{

    private Image spriteSheet = null;
    private int frame = 0;
    private int imageHeight = 0;
    private int numberofFramse = 9;

    public Animation()
    {
        String s = System.getProperty("user.dir") + "\\SpriteTest.png";
        try
        {
            spriteSheet = new Image(new FileInputStream(System.getProperty("user.dir") + "\\SpriteTest.png"));
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
        }
        imageHeight = (int) spriteSheet.getHeight();
    }

    public void updateGC(GraphicsContext gc, int i, int x, int y)
    {
        i = i % numberofFramse;
        gc.drawImage(spriteSheet, i * imageHeight, 0, imageHeight, imageHeight, x, y, imageHeight * 4, imageHeight * 4);

    }

    public void setFrame(int i)
    {

    }

    public void setImage()
    {

    }
}
