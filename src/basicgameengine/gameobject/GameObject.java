package basicgameengine.gameobject;

import javafx.scene.canvas.GraphicsContext;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class GameObject
{

    static boolean init = false;
    Pos pos = new Pos();
    Speed speed = new Speed();

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
        //update graphics context here
    }

    public void update()
    {
//        x = r * cos(a)
//        y = r * sin(a)
        if (init)
        {
            pos.addX((float) (speed.speed() * Math.cos(speed.angle())));
            pos.addY((float) (speed.speed() * Math.sin(speed.angle())));
        }
    }

}
