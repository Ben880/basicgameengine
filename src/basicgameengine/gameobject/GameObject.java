package basicgameengine.gameobject;

import basicgameengine.Time;
import javafx.scene.canvas.GraphicsContext;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class GameObject
{

    private static Time time = new Time();
    static public boolean init = false;
    public Pos pos = new Pos();
    public Speed speed = new Speed();
    public SpriteController spriteController = new SpriteController();

    public GameObject(int xpos, int ypos)
    {
        pos.setXpos(xpos);
        pos.setYpos(ypos);
        init = true;
    }

    public GameObject()
    {
        pos.setXpos(0);
        pos.setYpos(0);
        init = true;
    }

    public Speed speed()
    {
        return speed;
    }

    public Pos pos()
    {
        return pos;
    }

    public void updateGC(GraphicsContext gc)
    {
        if (spriteController.isEnabled())
        {
            spriteController.updateGC(gc, (int) pos.getX(), (int) pos.getY());
        }
    }

    public void update()
    {
        if (init)
        {
            pos.addX((float) (speed.speed() * Math.cos(speed.angle())));
            pos.addY((float) (speed.speed() * Math.sin(speed.angle())));
        }
    }

}
