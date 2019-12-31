package threading;
class MusicPlayer extends Thread

{
    public void run()
    {
    	
    		System.out.println("Music is Playing");
    	
    }
}
class MsWord implements Runnable
{
	public void run()
    {
    
    		System.out.println("Typing Ms Word documents");
    }
}

public class MultiThreadExample3
{
	public static void main(String args[])
	{
		
	MusicPlayer thread1 = new MusicPlayer();
	Runnable ob1 = new MsWord();
	Thread thread2 = new Thread(ob1);
	thread1.start();
	thread2.start();
	}

}
