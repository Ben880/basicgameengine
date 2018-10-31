package Demo;

import basicgameengine.Time;
import basicgameengine.gameobject.GameObject;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

/*
    BenjaminWilcox
    Oct 30, 2018
    BasicGameEngine
 */
public class DrawFPS extends GameObject
{

    private Time time = new Time();

    public DrawFPS()
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
            gc.setLineWidth(1.0);
            gc.setFill(Color.WHITE);
            gc.setFont(new Font(15));
            gc.setTextAlign(TextAlignment.RIGHT);
            gc.strokeText("UPS: " + time.getUPS(), 785, 15, 100);
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
