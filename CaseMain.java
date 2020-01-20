package casestudy;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CaseMain 
{
	    static Scanner ob = new Scanner(System.in);
		public static void main(String [] arg)
		{
			int id;
			String name,address,mob,pt,pno,ac,cot,cable,wifi,laundry;
			String SD,ED,D;
			int op2;
			int r=0,b=0,rid=1001,bid=2001,roomid=201;
			int d1,d2;
			CaseCustomer re[]=new CaseCustomer[20];
			CaseBooking bo[]=new CaseBooking[20];
		
			String op;
			do
			{
				System.out.println("Select your Needs\n1.Booking\n2.View Booking\n3.Exit\n---->");
				op2 = ob.nextInt();
		switch(op2)
		{
		case 1:
			System.out.print("Registration ");
			System.out.println("Enter personal details");
			System.out.println("->Enter Name : ");
			ob.nextLine();
			name=ob.nextLine();
			System.out.println("->Enter Address : ");
			address=ob.nextLine();
			System.out.println("->Enter Mobile Number : ");
			mob=ob.nextLine();
			System.out.println("->Enter ID-Proof Type : ");
			pt=ob.nextLine();
			System.out.println("->Enter ID-Proof Number : ");
			pno=ob.nextLine();
			re[r]=new CaseCustomer();
			int reid=re[r].registration(rid,name,address,mob,pt,pno);
			rid++;
			re[r].display();
			//System.out.println("Thank you for Registering, Your id is :"+reid);
			do
			{
				System.out.println("Please choose the services required\n.AC/non-AC (Enter AC/nAC) :");
				ac=ob.next();
				System.out.println(".Cot(Enter Single/Double) :");
				cot=ob.next();
				System.out.println(".With cable connection/without cable connection(Enter C/nC) :");
				cable=ob.next();
				System.out.println(".Wi-Fi needed or not(Enter W/nW) :");
				wifi=ob.next();
				System.out.println(".Laundry service needed or not(Enter L/nL) :");
				laundry=ob.next();
				System.out.println(".Enter Booking date");
				D=ob.next();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate localdate =LocalDate.parse(D,dtf);
				bo[b]=new CaseBooking();
				int bbid=bo[b].book(ac, cot, cable, wifi, laundry,localdate,roomid,reid);
				b++;
				roomid++;
				//System.out.println("Thank you for Booking Your Room Number is "+(bbid));
				System.out.println("Do you want to Book more Rooms(Yes/No):");
				op=ob.next();
			}while(op.equals("yes")||op.equals("Yes")||op.contentEquals("YES"));
				break;
		case 2:
			System.out.println("Enter Start Date:");
			SD=ob.next();
			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate sdate =LocalDate.parse(SD,dtf1);
			System.out.println("Enter End Date");
			ED=ob.next();
			DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate edate =LocalDate.parse(ED,dtf2);
			System.out.println("            BOOKING DETAILS\n-----------------------------");
			System.out.println("The booking made from "+SD+" to "+ED+" are ");
			System.out.println("Room Number\tBooking Date\tCustomer id");
			for(int j=0;j<b;j++)
			{
			if((bo[j].date.isAfter(sdate))&&(bo[j].date.isBefore(edate)))
			{
				bo[j].view();
			}
			}
			break;
		case 3:
			System.exit(0);
	}
	System.out.println("Do you want to proceed?(yes/no)");
	op=ob.next();
			}while(op.contentEquals("yes")||op.contentEquals("YES")||op.contentEquals("Yes"));
			}
		}



