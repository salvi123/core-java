package treemap1;

import java.util.Scanner;
import java.util.TreeSet;

public class TreesetExample1  
{
		
		public static void main(String args[])
		{
		int n,i;
		String name;
		int age;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		TreeSet<Employee1> hashset=new TreeSet<Employee1>();
		Employee1[] emp=new Employee1[n];
		for(i=0;i<n;i++)
		{
			name=s.next();
			age=s.nextInt();
			emp[i]=new Employee1();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
		}
		for(Employee1 e:hashset)
			System.out.println(e.getName()+" "+e.getAge());
		s.close();
		}

}
