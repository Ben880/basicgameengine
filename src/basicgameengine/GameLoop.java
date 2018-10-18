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

    public final float UPDATETIME = 1000;
    public int drawCounter = 0;
    public long deltaTime = 0;
    Time time = new Time();

    public GameLoop(ArrayList gO)
    {
        gameObjects = gO;
        System.out.println("MyClass running");
        while (gamerunning)
        {
            time.startUpdate();
            for (int i = 0; i < gameObjects.size(); i++)
            {
                gameObjects.get(i).updateGC();
            }
            drawCounter++;
            deltaTime += time.deltaTime();
            if (deltaTime > UPDATETIME)
            {
                System.out.println("FPS: " + drawCounter);
                drawCounter = 0;
                deltaTime = 0;
            }
        }

    }

    @Override
    public void run()
    {

    }

}
