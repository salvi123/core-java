package case7dec;
public class outerclass
{
	private int n=5;	 
	class MethodInner
	{
		public void displayInner()
		{
			System.out.println(n);
		}
	}
	public static void main(String args[])
	{
		outerclass outer=new outerclass();
		outerclass.MethodInner obj=outer.new MethodInner();
		obj.displayInner();
	 }
}