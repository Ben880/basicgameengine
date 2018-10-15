package basicgameengine;

import java.util.ArrayList;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class GameLoop
{

    public static boolean gamerunning = true;
    public static ArrayList<GameObject> gameObjects;

    public GameLoop(ArrayList gO)
    {
        gameObjects = gO;
        while (gamerunning)
        {
            for (int i = 0; i < gameObjects.size(); i++)
            {
                gameObjects.get(i).updateGC();
            }
        }

    }

}
