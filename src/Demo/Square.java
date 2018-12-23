package Demo;

import basicgameengine.Time;
import basicgameengine.gameobject.GameObject;
import basicgameengine.gameobject.Pos;
import basicgameengine.gameobject.Speed;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
    BenjaminWilcox
    Oct 18, 2018
    BasicGameEngine
 */
public class Square extends GameObject
{

    private static boolean init = false;
    private Pos pos = new Pos();
    private Speed speed = new Speed();
    private static Time time = new Time();

    public Square()
    {
        speed.setAngle(0);
        speed.setSpeed((float) .1);
        pos.setXpos(400);
        pos.setYpos(400);
        init = true;
    }

    @Override
    public void updateGC(GraphicsContext gc)
    {
        if (init)
        {
            gc.setFill(Color.GREEN);
            gc.fillRoundRect(pos.getX(), pos.getY(), 30, 30, 10, 10);
            //System.out.println("Square Pos: " + pos.getX() + ", " + pos.getY());
        }

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
