package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample2 
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> hashmap=new LinkedHashMap<Integer,String>();
		hashmap.put(1,"Amith");
		hashmap.put(2,"Jai");
		hashmap.put(3,"Rahul");
		hashmap.put(6,"Amith");
		hashmap.put(6,"Amith");
		for(Map.Entry m:hashmap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
