package basicgameengine;

import java.util.ArrayList;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class UpdateLoop implements Runnable
{

    public static boolean gamerunning = true;
    public static ArrayList<GameObject> gameObjects;
    public float time;
    public float deltaTime;
    public final float UPDATETIME = 100 / 6;

    public UpdateLoop(ArrayList gO)
    {
        gameObjects = gO;
        System.out.println("MyClass running");
        while (gamerunning)
        {
            deltaTime = System.currentTimeMillis() - time;
            time = System.currentTimeMillis();
            if (deltaTime > UPDATETIME)
            {
                System.out.println("game update");
                for (int i = 0; i < gameObjects.size(); i++)
                {
                    gameObjects.get(i).updatePos();
                }
                deltaTime = 0;
            }

        }

    }

    @Override
    public void run()
    {

    }

}
