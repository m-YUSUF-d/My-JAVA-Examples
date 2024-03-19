public class StopWatch_Class {
    
    private long startTime;
    private long endTime;
    
    
    StopWatch_Class()
    {
        start();
    }


    public void start()
    {
        startTime = System.currentTimeMillis();
    }
    public void stop()
    {
        endTime = System.currentTimeMillis();
    }


    public void getStartTime()
    {
        startTime = System.currentTimeMillis();
    }
    public void getEntTime()
    {
        endTime = System.currentTimeMillis();
    }


    public int getElapsedTime()
    {
        return (int)(endTime - startTime);
    }
}
