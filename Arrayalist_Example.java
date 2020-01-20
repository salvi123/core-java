package arraylist;
import java.util.*;
import java.util.ArrayList;
class Contacts 
{
	private String name;
	private String phone_number;
	public Contacts(String  name, String phone_number )
	{
		 this.name= name;
		 this.phone_number=phone_number;
	}
	public String getName() 
	{
		
		return name;
	}
	public String getphone_number() 
	{
		
		return phone_number;
	}
	
}

public class Arrayalist_Example 
{
	public static void main(String args[])
	{
	
	ArrayList<Contacts> contacts=new ArrayList<Contacts>();
	Contacts firstContact = new Contacts("tim","1818884224");
	Contacts secondContact = new Contacts("john","1818884225");
	contacts.add(firstContact);
	contacts.add(secondContact);
	for(int i=0;i< contacts.size();i++)
	 {
		System.out.println(contacts.get(i).getName());
		System.out.println(contacts.get(i).getphone_number());
	 }
    }
}
	



