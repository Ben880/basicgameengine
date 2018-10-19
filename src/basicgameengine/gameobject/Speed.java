package basicgameengine.gameobject;

/*
    BenjaminWilcox
    Oct 18, 2018
    BasicGameEngine
 */
public class Speed
{

    private float speed;
    private float angle;

    public Speed()
    {
        speed = 0;
        angle = 0;
    }

    public void setSpeed(float f)
    {
        speed = f;
    }

    public void setAngle(float f)
    {
        angle = f;
        angle = (angle % 360);
    }

    public void addAngle(float f)
    {
        angle += f;
        angle = (angle % 360);
    }

    public float speed()
    {
        return speed;
    }

    public float angle()
    {
        return angle;
    }
}
