package basicgameengine;

import java.util.ArrayList;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class UpdateLoop
{

    public static boolean gamerunning = true;
    public static ArrayList<GameObject> gameObjects;
    public float time;
    public float deltaTime;
    public final float UPDATETIME = 10;

    public UpdateLoop(ArrayList gO)
    {
        gameObjects = gO;
        while (gamerunning)
        {
            // delta time = systiem - time
            // time  = systime
            if (deltaTime > UPDATETIME)
            {
                for (int i = 0; i < gameObjects.size(); i++)
                {
                    gameObjects.get(i).updatePos();
                }
                deltaTime = 0;
            }

        }

    }

}
