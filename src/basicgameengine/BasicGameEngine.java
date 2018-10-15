/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicgameengine;

import java.util.ArrayList;

/**
 *
 * @author bmwla
 */
public class BasicGameEngine
{

    public static boolean gamerunning = true;
    public static ArrayList<GameObject> gameObjects = new ArrayList();
    public static GameLoop gl;
    public static GameLoop gu;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application gui here

        // TODO create this in neww thread
        gl = new GameLoop(gameObjects);
        // TODO create this in neww thread
        gu = new UpdateLoop(gameObjects);

    }

    public void addGameObject(GameObject gameObject)
    {
        gameObjects.add(gameObject);
    }

    public void tickLoop()
    {

    }

    public void updateObjects()
    {

    }

}
