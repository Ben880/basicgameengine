package basicgameengine;

/*
    BenjaminWilcox
    Oct 18, 2018
    BasicGameEngine
 */
public class Time
{

    private static long time = System.currentTimeMillis();
    private static long previous = System.currentTimeMillis();
    private static long deltaTime = 0;

    public Time()
    {
        System.out.println(System.currentTimeMillis());
    }

    public void startUpdate()
    {
        previous = time;
        time = System.currentTimeMillis();
        deltaTime = time - previous;
        //System.out.println(deltaTime);
    }

    public long deltaTime()
    {
        return deltaTime;
    }

}
