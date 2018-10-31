package basicgameengine;

import basicgameengine.gameobject.GameObjects;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class GameLoop implements Runnable
{

    private final long SECOND = 1000;
    private final long UPDATETIME = 1000 / 60;

    private Time time = new Time();
    private Running run = new Running();
    private GameObjects gameObjects = new GameObjects();

    public int loopCounter = 0;
    public long loopDelta = 0;
    public long updateDelta = 0;
    public int updateCounter = 0;

    public GameLoop()
    {
        System.out.println("Initializing GameLoop");

        System.out.println("GameLoop started");
        while (run.isRunning())
        {
            time.startUpdate();
            loopCounter++;
            loopDelta += time.deltaTime();
            // loops per second counter
            if (loopDelta > SECOND)
            {
                time.setUPS(updateCounter);
                loopCounter = 0;
                loopDelta = 0;
                updateCounter = 0;
            }
            updateDelta += time.deltaTime();
            //pudates couter
            if (updateDelta > UPDATETIME)
            {
                updateCounter++;
                for (int i = 0; i < gameObjects.size(); i++)
                {
                    gameObjects.get(i).update();
                }
                updateDelta = 0;
            }
        }

    }

    @Override
    public void run()
    {

    }

}
