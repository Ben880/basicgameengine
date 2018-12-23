package basicgameengine.gameobject;

import basicgameengine.Time;
import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;

/*
    BenjaminWilcox
    Dec 22, 2018
    BasicGameEngine
 */
public class SpriteController
{

    private static Time time = new Time();
    private float speed = 10;
    private ArrayList<Animation> animations = new ArrayList<Animation>();
    private int currentAnimation = 0;
    private int currentFrame = 0;
    private int timeCounter = 0;
    private boolean resetOnNonExistantAnimation = false;
    private boolean useController = false;

    public SpriteController()
    {
        animations.add(new Animation());
    }

    public void updateGC(GraphicsContext gc, int x, int y)
    {
        timeCounter++;
        if (timeCounter > speed)
        {
            currentFrame++;
            //System.out.println("Frame: " + currentFrame);
            timeCounter = 0;
            if (animations.size() > 0)
                animations.get(currentAnimation).setFrame(currentFrame);
        }
        animations.get(currentAnimation).updateGC(gc, currentFrame, x, y);
    }

    public void addAnimation(Animation a)
    {
        animations.add(a);
    }

    public void setAnimation(int i)
    {
        if (!(i > animations.size()))
        {
            currentAnimation = i;
            currentFrame = 0;
        } else
        {
            System.out.println("animation set to non existant number");
            if (resetOnNonExistantAnimation)
            {
                System.out.println("resetOnNonExistantAnimation = true, animation set to 0");
                currentAnimation = 0;
            } else
            {
                System.out.println("resetOnNonExistantAnimation = false, no change");
            }
        }
    }

    public void setFrame(int i)
    {
        currentFrame = i;
    }

    public void enable()
    {
        useController = true;
    }

    public void disable()
    {
        useController = false;
    }

    public boolean isEnabled()
    {
        return useController;
    }
}
