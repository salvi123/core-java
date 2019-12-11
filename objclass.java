
public class objclass {
	
	static int last_roll=100;
	int roll_no;
	//constructor
	objclass()
	{
		roll_no=last_roll;
		last_roll++;
	}
	//overriding hashcode()
	public int hashcode()
	{
		return roll_no;
	}
	//driver code
	public static void main(String args[])
	{
		objclass s=new objclass();
		
		//below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String ("FACE");
		Class c=obj.getClass();
		System.out.println("Class of object obj is :"+c.getName());
		s=null;
		System.gc();
		
	}
	protected void finalize()
	{
		System.out.println("finalize method called");
	}
}
