package basicgameengine;

/*
    BenjaminWilcox
    Oct 14, 2018
    BasicGameEngine
 */
public class GameLoop implements Runnable
{

    private final long SECOND = 1000;
    private final long UPDATETIME = 100 / 6;

    private Time time = new Time();
    private Running run = new Running();
    private GameObjects gameObjects = new GameObjects();

    public int loopCounter = 0;
    public long loopDelta = 0;
    public long updateDelta = 0;

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
                System.out.println("FPS: " + loopCounter);
                loopCounter = 0;
                loopDelta = 0;
            }
            updateDelta += time.deltaTime();
            //pudates couter
            if (updateDelta > UPDATETIME)
            {
                for (int i = 0; i < gameObjects.size(); i++)
                {
                    gameObjects.get(i).update();
                }
            }
        }

    }

    @Override
    public void run()
    {

    }

}
