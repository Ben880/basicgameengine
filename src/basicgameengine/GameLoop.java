package basicgameengine;

import java.util.ArrayList;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class GameLoop implements Runnable
{

    public static boolean gamerunning = true;
    public static ArrayList<GameObject> gameObjects;
    public float time;
    public float deltaTime;
    public final float UPDATETIME = 1000;
    public int drawCounter = 0;

    public GameLoop(ArrayList gO)
    {
        gameObjects = gO;
        System.out.println("MyClass running");
        while (gamerunning)
        {
            deltaTime = System.currentTimeMillis() - time;
            time = System.currentTimeMillis();
            for (int i = 0; i < gameObjects.size(); i++)
            {
                gameObjects.get(i).updateGC();
            }
        }
        drawCounter++;
        if (deltaTime > UPDATETIME)
        {
            System.out.println("Draws per second: " + drawCounter);
            deltaTime = 0;
            drawCounter = 0;
        }

    }

    @Override
    public void run()
    {

    }

}
