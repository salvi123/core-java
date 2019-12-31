package threading;
class Numbers implements Runnable
{
	public void run()
    {
    	for(int i=0;i<4;i++)
    		System.out.println(i);
    }
}
public class MultiThreadingExample2 
{
	public static void main(String args[])
	{
		Runnable ob1 = new Numbers(); //can be reference of Runnable interface
		Runnable ob2 = new Numbers();
		Thread thread1 = new Thread(ob1);// invoke thread class constructor
		Thread thread2 = new Thread(ob2);
		//Multithreading
		thread1.start();
		thread2.start();
		
	}

}
