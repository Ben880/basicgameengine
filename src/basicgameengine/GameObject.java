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
    private GraphicsContext gc;
    private int moveToX = 0;
    private int moveToY = 0;

    public GameObject(GraphicsContext gc, int xpos, int ypos)
    {
        this.gc = gc;
        this.xpos = xpos;
        this.ypos = ypos;
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

    public void updatePos()
    {
        //do logic to incriment game objects location to desired locaion
    }

}
