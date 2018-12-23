package Demo;

import basicgameengine.Time;
import basicgameengine.gameobject.GameObject;

/*
    BenjaminWilcox
    Dec 23, 2018
    BasicGameEngine
 */
public class SpriteTest extends GameObject
{

    private static Time time = new Time();

    public SpriteTest()
    {
        spriteController.enable();
        //System.out.println(System.getProperty("user.dir"));
        speed.setAngle(0);
        speed.setSpeed((float) .4);
        pos.setXpos(400);
        pos.setYpos(400);
        init = true;

    }

    @Override
    public void update()
    {

        if (init)
        {

            pos.addX((float) (time.deltaTime() * speed.speed() * Math.cos(speed.angle() * Math.PI / 180)));
            pos.addY((float) (time.deltaTime() * speed.speed() * Math.sin(speed.angle() * Math.PI / 180)));
        }
    }

}
