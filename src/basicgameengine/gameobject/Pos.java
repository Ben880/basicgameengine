package basicgameengine.gameobject;

/*
    BenjaminWilcox
    Oct 18, 2018
    BasicGameEngine
 */
public class Pos
{

    private float xpos;
    private float ypos;

    public Pos()
    {
        xpos = 0;
        ypos = 0;
    }

    public Pos(float x, float y)
    {
        xpos = x;
        ypos = y;
    }

    public void setYpos(float ypos)
    {
        this.ypos = ypos;
    }

    public void setXpos(float xpos)
    {
        this.xpos = xpos;
    }

    public void addY(float ypos)
    {
        this.ypos += ypos;
    }

    public void addX(float xpos)
    {
        this.xpos += xpos;
    }

    public float getX()
    {
        return xpos;
    }

    public float getY()
    {
        return ypos;
    }

}
