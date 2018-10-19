package basicgameengine.gameobject;

import java.util.ArrayList;

/*
    BenjaminWilcox
    Oct 18, 2018
    BasicGameEngine
 */
public class GameObjects
{

    private static ArrayList<GameObject> gameObjects = new ArrayList();

    public void addObject(GameObject GO)
    {
        gameObjects.add(GO);
    }

    public GameObject get(int i)
    {
        return gameObjects.get(i);
    }

    public int size()
    {
        return gameObjects.size();
    }

}
