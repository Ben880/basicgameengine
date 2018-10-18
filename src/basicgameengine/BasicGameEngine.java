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
    public static UpdateLoop gu;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application gui here

        // TODO create this in neww thread
        Thread t1 = new Thread(gl = new GameLoop(gameObjects));
        t1.start();
        // TODO create this in neww thread
//        Thread t2 = new Thread(gu = new UpdateLoop(gameObjects));
//        t2.start();

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
