package basicgameengine;

import javafx.scene.canvas.GraphicsContext;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class GameObject
{

    private int xpos = 0;
    private int ypos = 0;
    private static GraphicsContext gc;
    private int moveToX = 0;
    private int moveToY = 0;

    public GameObject(int xpos, int ypos)
    {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public GameObject()
    {
        this.xpos = 0;
        this.ypos = 0;
    }

    public void setCanvas(GraphicsContext gc)
    {
        this.gc = gc;
    }

    public void setYpos(int ypos)
    {
        this.ypos = ypos;
    }

    public void setXpos(int xpos)
    {
        this.xpos = xpos;
    }

    public void updateYpos(int ypos)
    {
        this.ypos = +ypos;
    }

    public void updateXpos(int xpos)
    {
        this.xpos += xpos;
    }

    public void updateGC()
    {
        //update graphics context here
    }

    public void update()
    {
        //do logic to incriment game objects location to desired locaion
    }

}
