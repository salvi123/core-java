package linkedlist;

import java.util.*;
import java.util.Scanner;

public class LinkedListExample2 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			list.add(str);
		}
		int m =s.nextInt();
		ArrayList<String> list1=new ArrayList<String>();
		for(int j=0;j<m;j++)
		{
			String str1=s.next();
			list1.add(str1);
		}
		System.out.println("Actual linkedlist: "+list);
		list.addAll(list1);
		System.out.println("After copy: "+list);
	}

}
