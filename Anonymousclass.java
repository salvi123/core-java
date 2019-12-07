package case7dec1;

	abstract class Anonymousclass
	{
	 abstract void fun();
		
	  public static void main(String args[])
	{
		Anonymousclass e=new Anonymousclass()
				{
		         void fun()
		         {
		        	System.out.println("haiiiiii"); 
		         }
				};
	e.fun();

  }
}