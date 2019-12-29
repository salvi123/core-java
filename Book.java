package collection;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
	class Student
	{  	  
		    String name;
			String address;
			int contactno;
			String emailid;
		   Student(String name,String address,int contactno,String emailid){
		   this.name=name;
		   this. address= address;
		   this.contactno=contactno;
		   this.emailid=emailid;
		  }
		}
	public class Book {
		public static void main(String args[]) throws IOException {
			String name;
			String address;
			int contactno;
			String emailid;
			String proof;
			String proofid;
			String a;
			String d;
			ArrayList<Student> al=new ArrayList<Student>();
			do
			{
			Scanner st=new Scanner(System.in);
			System.out.println("            REGISTRATION");
			System.out.print("Enter your name:");
			     name=st.next();
			System.out.print("Enter your address:");
			address=st.next();
			System.out.print("Enter your Contact Number:");
			    contactno=st.nextInt();
			System.out.print("Enter your E-Mail ID:");
			emailid=st.next();
			Student s1=new Student(name,address,contactno,emailid);
			al.add(s1);
			System.out.print("Do you want to Countinue:Y/N?");
			a=st.next();
			}while(a.equals("Y"));
			System.out.println("\t\tDETAILS ");	
			java.util.Iterator<Student> itr=al.iterator();
			while(itr.hasNext()){
			    Student std=(Student)itr.next();
			    System.out.println(std.name+"  "+std.address+"  "+std.contactno+"  "+std.emailid);
			}
	   }  
	}  