package encapsulation;

import java.util.Scanner;

public class case6main {

	private static Scanner ob;
   public static void main(String[] args)
		{
	        ob=new Scanner(System.in);
			String name,address,mobno;
			int id=10001;
			Scanner ob = new Scanner(System.in);
			System.out.println("Enter personal details");
			System.out.println("->Enter Name : ");
			name=ob.nextLine();
			System.out.println("->Enter Address : ");
			address=ob.nextLine();
			System.out.println("->Enter Mobile Number : ");
			mobno=ob.nextLine();
			obj.setname(name);
			obj.setid(id);
			obj.setaddress(address);
			obj.setmobno(mobno);
			System.out.println("Thank you for Registering, Your id is :"+id);
			
			System.out.println("Your details are as follows\n.Name:"+obj.getname()
					+"\n.Address: "+obj.getaddress()+"\n.Contact Number: "+obj.getmobno()
					+"\n.your registration no:"+id+"\n--------------------------------------");
		}
	}

}
