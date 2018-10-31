/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicgameengine;

import Demo.DrawFPS;
import Demo.Square;
import basicgameengine.gameobject.GameObjects;

/**
 *
 * @author bmwla
 */
public class BasicGameEngine
{

    public static GameLoop gl;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //game loop thread
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                gl = new GameLoop();
            }
        };
        t1.start();
        // create new window
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                javafx.application.Application.launch(Window.class);
            }
        };
        t2.start();

        new GameObjects().addObject(new Square());
        new GameObjects().addObject(new DrawFPS());
    }
}
