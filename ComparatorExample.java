package comparable;
import java.util.*;

import treeset.Employee;
public class ComparatorExample 
{
	public static void main(String args[])
	{
	int n,i;
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	List<Employee> list=new LinkedList<Employee>();
	Employee[] emp=new Employee[n];
	for(i=0;i<n;i++)
	{
		name=s.next();
		age=s.nextInt();
		emp[i]=new Employee();
		emp[i].setAge(age);
		emp[i].setName(name);
		list.add(emp[i]);
	}
	System.out.println("Name wise comparison");
	Collections.sort(list,new NameComparator());
	for(Employee e:list)
		System.out.println(e.getName()+" "+e.getAge());
	System.out.println("Age wise comparison");
	Collections.sort(list,new AgeComparator());
	for(Employee e:list)
		System.out.println(e.getName()+" "+e.getAge());
	s.close();
	}

}
class AgeComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getAge()>e2.getAge())
			return 1;
		else
			return -1;
	}

		
	
}
class NameComparator implements Comparator<Employee>
{
	public int compare(Employee o1, Employee o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.getName().compareTo(e2.getName());
	}
}
