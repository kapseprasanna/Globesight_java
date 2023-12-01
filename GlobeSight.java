package globesight;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


class Info 
{
	public void wl() {
		System.out.println("|******************************************|" );
		System.out.println("|                                          |");
		System.out.println("|"+"      Welcome to GlobeSight Application " +"  |");
		System.out.println("|                                          |");
		System.out.println("|******************************************|\n");
	}
	// Declaring variables which are to be used 
	String fname;
	String lname;
	String gender;
	private long contact;
	String email = "admin";
	String password = "admin";

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public void signup() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name :");
		 fname = sc.nextLine();
		
		System.out.print("Enter the last name :");
		lname = sc.nextLine();
		
		System.out.println("Select the gender : \n"
				+ "1 - Female \n"
				+ "2 - Male \n"
				+ "3 - Other");
	
		try
		{
			int user_gender = sc.nextInt();
			switch(user_gender)
			{
				case 1:
					System.out.println("Gender is Female");
					break;
					
				case 2 :
					System.out.println("Gender is Male");
					break;
					
				case 3:
					System.out.println("Gender is Other");
					break;
					
				default:
					System.out.println("Invalid Input!");
					signup();		
			}
		}
			
			catch(Exception e)
			{
				System.out.println("You have Invalid Charcter Select From above Options Only");
				signup();
			}
			
		contact();
		
		System.out.print("Enter the Email :");
		email = sc.next();
		
		System.out.print("Enter the Password :");
		password = sc.next();
		
		System.out.println("------------------------------------------------------ ");
		login();
		
	}

	public void contact() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mobile number :");
		
		try {
		long contact = sc.nextLong();
		
		if (contact > 999999999l && contact < 10000000000L) 
		{
			this.contact = contact;
		} 
		else 
		{
			System.out.println("Enter 10 digit number");
			contact();
		}
		}
		
		catch (InputMismatchException e)
		{
			System.out.println("Enter Only Numeric Charcter and no other special charcter");
		    contact();
		}
	}
	
	public void login() 
	{
		System.out.println("Please enter the credentials to login \n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email :");
		String email = sc.nextLine();
		System.out.print("Enter the password : ");
		String pass = sc.nextLine();
		System.out.println("\n");
		if (email.equals(this.email) && pass.equals(this.password)) {
			System.out.println("Login Successful \n ");
			
		} else {
			System.out.println("You have Enter Wrong Credentails ! Please Check Again \n ");
			login();
		}
	}

	
}

class Travel
{
	public void travelmeans()
	{
		System.out.println("Press 1: For Train Booking");
		System.out.println("Press 2: For Flight Booking");
		System.out.println("Press 3: For Hotel Booking");
		
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		try {
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("You Selected Train Booking \n ");
				System.out.println("--------------------------------");
				Trainbooking();
				break;
				
			case 2:
				System.out.println("You Selected Flight Booking \n");
				System.out.println("--------------------------------");
				FlightBooking();
				break;
		
			case 3:
				System.out.println("You Selected Hotel Booking \n");
				System.out.println("--------------------------------");
				HotelBooking();
				break;
				
			default :
				System.out.println("Please enter valid input");
				break;
		}
		}
		catch(Exception e)
		{
			System.out.println("You have Entered Ivalid Character from the above given Options ");
		}
	}
	


	public void Trainbooking()
	{
		System.out.println("Welcome to train booking section");
		System.out.println("--------------------------------");
		
		Scanner s = new Scanner(System.in);
		ArrayList<String> train = new ArrayList<>();
		int size = 0;
		System.out.println("Enter the number for how many people you want to book train tickets");
		size=s.nextInt();
		
		System.out.println("Enter the names of people who are going to travel");
		
		for(int i=0;i<size;i++)
		{
			train.add(s.next());
		}
		for(String value:train)
		{
			System.out.println("Name of people going to travel : "+ value);
		}	
		
		System.out.println("select the route from to destination :");
		
		System.out.println("1)Mumbai to Pune \n"
					         +"2)Mumbai to Goa   \n"
					         +"3)Goa To Mumbai   \n"
					         +"4)Pune To Mumbai  \n");
		
		Scanner ftd = new Scanner(System.in);
		int traveller_route=ftd.nextInt();
		
		switch(traveller_route)
		{
			case 1:
				System.out.println("Mumbai to Pune");
				break;
				
			case 2:
				System.out.println("Mumbai to Goa");
				break;
				
			case 3:
				System.out.println("Goa to Mumbai");
				break;
				
			case 4:
				System.out.println("Pune To Mumbai");
				break;
				
			default :
				System.out.println("Invalid input ! Please Select From above routes ");
			    Trainbooking();
			    break;
		}
		
		System.out.println("Per Person Amount for travelling is 125 : \n");
		
		if(size==0)
		{
			System.out.println("Person travelling to the train cannot be zero");
		}
	
		else
		{
			int totalprice = size*125;
			System.out.println("Total Amount" + totalprice +"\n");
		}
		
		System.out.println("1)Press 1 - Go back to main menu \n"
						 + "2)Press 2 - Go to Flight Booking option  ");
		
		Scanner b= new Scanner(System.in);
		int back_options = b.nextInt();
		
		switch(back_options) // add these options below too start from here 
		{
			case 1 :
				travelmeans();
				break;
				
			case 2 :
				FlightBooking();
				break;
				
			default :
					System.out.println("Invalid input ! please enter no mentioned in above option given ");
					travelmeans();
		}
		
}	
	
	public void FlightBooking()
	{
		Scanner s = new Scanner(System.in);
		ArrayList<String> flight= new ArrayList<>();
		int size = 0;
		System.out.println("Enter the number for how many people you want to book Flight tickets");
		size=s.nextInt();
		
		System.out.println("Enter the names of people who are going to travel");
		
		for(int i=0;i<size;i++)
		{
			flight.add(s.next());
		}
		for(String value:flight)
		{
			System.out.println("Name of people going to travel : "+ value);
		}	
		
		System.out.println("Welcome to flight booking section");
		System.out.println("--------------------------------");
		
		System.out.println("select the route You want to fly :\n"
				+ "1)Mumbai To Pune \n"
				+ "2)Pune To Mumbai \n"
				+ "3)Goa To Mumbai \n"
				+ "4)Goa To Pune");
		
		Scanner fb = new Scanner(System.in);
		
		try {
		int fbs = fb.nextInt();
		switch(fbs)
		{
			case 1 :
				System.out.println("You have selected Mumbai To Pune");
			break;
			
			case 2 : 
				System.out.println("You have selected Pune To Mumbai");
				break;
				
			case 3 :
				System.out.println("You have selected Goa To Mumbai");
				break;
				
			case 4 :
				System.out.println("You have selected Goa to Pune");
				break;
				
			default :
				System.out.println("Invalid input ! please select from above options mentioned");
				FlightBooking();
				break;	
			
		}
		}
		catch(Exception e)
		{
			System.out.println("You have selected Wrong option ! Check Again");
			FlightBooking();
		}
		
		System.out.println("Per Person Amount for travelling is 4000 : \n");
		if(size==0)
		{
			System.out.println("Person travelling to the train cannot be zero");
		}
	
		else
		{
			int totalprice = size*4000;
			System.out.println("Total Amount" + totalprice +"\n");
		}
		
		System.out.println("1)Press 1 - Go back to main menu \n"
				 + "2)Press 2 - Go to Hotel Booking option \n");

		Scanner b= new Scanner(System.in);
		int back_options = b.nextInt();

		switch(back_options) // add these options below too start from here 
		{
			case 1 :
				travelmeans();
				break;
		
			case 2 :
				HotelBooking();
				break;
		
			default :
					System.out.println("Invalid input ! please enter no mentioned in above option given ");
					travelmeans();
}
	}
	
	public void HotelBooking()
	{
		System.out.println("Welcome to hotel booking section");
		System.out.println("-------------------------------- \n");
		
		System.out.println("Select the hotel according to rating \n"
				+ "1 - 1 Star Hotels \n"
				+ "2 - 2 Star Hotels \n"
				+ "3 - 3 Star Hotels \n"
				+ "4 - 4 Star Hotels \n"
				+ "5 - 5 Star Hotels \n ");
		
		Scanner hb = new Scanner(System.in);
		
		try {
		int hotel_booking = hb.nextInt();
		switch(hotel_booking)
		{
			case 1:
			System.out.println("You have selected 1 Star Hotel");
			
			try {
			
				System.out.println("Choose the hotels from the below no according to the hotels you want \n"
						+ "1)Sawaan Hotel \n"
						+ "2)Dishant Hotel \n"
						+ "3)Khushi Hotel \n");
				
			Scanner hot1 = new Scanner(System.in);
			int hotel_1 = hot1.nextInt();
			 
			 switch(hotel_1)
			 {
			 	case 1:
			 		System.out.println("You selected " +hotel_1+ "name Sawaan Hotel");
			 		break;
			 		
			 	case 2:
			 		System.out.println("You selected " +hotel_1+ "name Dishant Hotel");
			 		break;
			 		
			 	case 3:
			 		System.out.println("You selected " +hotel_1+ "name khushi Hotel");
			 		break;
			 		
			 }
			 
			 //
			 
			 	Scanner s = new Scanner(System.in);
				ArrayList<String> hotelbooking = new ArrayList<>();
				int size = 0;
				System.out.println("Enter the number for how many people you want to book hotel tickets");
				size=s.nextInt();
				
				System.out.println("Enter the names of people who are going to travel");
				
				for(int i=0;i<size;i++)
				{
					hotelbooking.add(s.next());
				}
				for(String value:hotelbooking)
				{
					System.out.println("Name of people going to travel : "+ value);
				}
				System.out.println("Per Person Booking for hotel is 500 : \n");
				
				if(size==0)
				{
					System.out.println("Person booking cannot be zero");
				}
			
				else
				{
					int totalprice = size*500;
					System.out.println("Total Amount : " + totalprice +"\n");
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid input enter the proper charcter");
				HotelBooking();
			}
			break;
			
			case 2:
			System.out.println("You have selected 2 Star Hotel");
			
			try {
				
				System.out.println("Choose the hotels from the below no according to the hotels you want \n"
						+ "1)Severia Hotel \n"
						+ "2)Severia Hotel \n"
						+ "3)Swadh Hotel \n");
				
			Scanner hot2 = new Scanner(System.in);
			int hotel_2 = hot2.nextInt();
			 
			 switch(hotel_2)
			 {
			 	case 1:
			 		System.out.println("You selected " +hotel_2+ "name Severia Hotel");
			 		break;
			 		
			 	case 2:
			 		System.out.println("You selected " +hotel_2+ "name Severia Hotel");
			 		break;
			 		
			 	case 3:
			 		System.out.println("You selected " +hotel_2+ "name Swadh Hotel");
			 		break;
			 		
			 }
			 
			 //
			 
			 Scanner s = new Scanner(System.in);
				ArrayList<String> hotelbooking = new ArrayList<>();
				int size = 0;
				System.out.println("Enter the number for how many people you want to book hotel tickets");
				size=s.nextInt();
				
				System.out.println("Enter the names of people who are going to travel");
				
				for(int i=0;i<size;i++)
				{
					hotelbooking.add(s.next());
				}
				for(String value:hotelbooking)
				{
					System.out.println("Name of people going to travel : "+ value);
				}
				
			 	System.out.println("Per Person Booking for hotel is 1000 : \n");
				
				if(size==0)
				{
					System.out.println("Person booking cannot be zero");
				}
			
				else
				{
					int totalprice = size*1000;
					System.out.println("Total Amount : " + totalprice +"\n");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Invalid input enter the proper charcter");
				HotelBooking();
			}
			break;
			
			case 3:
			System.out.println("You haav slected 3 Star Hotel");
			
			try {
				
				System.out.println("Choose the hotels from the below no according to the hotels you want \n"
						+ "1)Neeta Hotel \n"
						+ "2)Rubix Hotel \n"
						+ "3)Sons Hotel \n");
				
			Scanner hot3 = new Scanner(System.in);
			int hotel_3 = hot3.nextInt();
			 
			 switch(hotel_3)
			 {
			 	case 1:
			 		System.out.println("You selected " +hotel_3+ "name Neeta Hotel");
			 		break;
			 		
			 	case 2:
			 		System.out.println("You selected " +hotel_3+ "name Rubix Hotel");
			 		break;
			 		
			 	case 3:
			 		System.out.println("You selected " +hotel_3+ "name Sons Hotel");
			 		break;
			 		
			 }
			 
			 //
			 
			 Scanner s = new Scanner(System.in);
				ArrayList<String> hotelbooking = new ArrayList<>();
				int size = 0;
				System.out.println("Enter the number for how many people you want to book hotel tickets");
				size=s.nextInt();
				
				System.out.println("Enter the names of people who are going to travel");
				
				for(int i=0;i<size;i++)
				{
					hotelbooking.add(s.next());
				}
				for(String value:hotelbooking)
				{
					System.out.println("Name of people going to travel : "+ value);
				}
			 
			 System.out.println("Per Person Booking for hotel is 2500 : \n");
				
				if(size==0)
				{
					System.out.println("Person booking cannot be zero");
				}
			
				else
				{
					int totalprice = size*2500;
					System.out.println("Total Amount : " + totalprice +"\n");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Invalid input enter the proper charcter");
				HotelBooking();
			}
			break;
			
			case 4:
			System.out.println("You haav slected 4 Star Hotel");
			
			try {
				
				System.out.println("Choose the hotels from the below no according to the hotels you want \n"
						+ "1)Beru Hotel \n"
						+ "2)Neerja Hotel \n"
						+ "3)RRS Hotel \n");
				
			Scanner hot4 = new Scanner(System.in);
			int hotel_4 = hot4.nextInt();
			 
			 switch(hotel_4)
			 {
			 	case 1:
			 		System.out.println("You selected " +hotel_4+ "name Beru Hotel");
			 		break;
			 		
			 	case 2:
			 		System.out.println("You selected " +hotel_4+ "name Neerja Hotel");
			 		break;
			 		
			 	case 3:
			 		System.out.println("You selected " +hotel_4+ "name RRS Hotel");
			 		break;
			 		
			 }
			 
			 //
			 
			 Scanner s = new Scanner(System.in);
				ArrayList<String> hotelbooking = new ArrayList<>();
				int size = 0;
				System.out.println("Enter the number for how many people you want to book hotel tickets");
				size=s.nextInt();
				
				System.out.println("Enter the names of people who are going to travel");
				
				for(int i=0;i<size;i++)
				{
					hotelbooking.add(s.next());
				}
				for(String value:hotelbooking)
				{
					System.out.println("Name of people going to travel : "+ value);
				}
			 
			    System.out.println("Per Person Booking for hotel is 10000 : \n");
				
				if(size==0)
				{
					System.out.println("Person booking cannot be zero");
				}
			
				else
				{
					int totalprice = size*10000;
					System.out.println("Total Amount : " + totalprice +"\n");
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid input enter the proper charcter");
				HotelBooking();
			}
			
			break;
			
			case 5:
			System.out.println("You haav slected 5 Star Hotel");
			
			try {
				
				System.out.println("Choose the hotels from the below no according to the hotels you want \n"
						+ "1)Taj Hotel \n"
						+ "2)Grand Hayatt Hotel \n"
						+ "3)JW Marriot Hotel \n");
				
			Scanner hot5 = new Scanner(System.in);
			int hotel_5 = hot5.nextInt();
			 
			 switch(hotel_5)
			 {
			 	case 1:
			 		System.out.println("You selected " +hotel_5+ "name Taj Hotel");
			 		break;
			 		
			 	case 2:
			 		System.out.println("You selected " +hotel_5+ "name Grand Hayatt Hotel");
			 		break;
			 		
			 	case 3:
			 		System.out.println("You selected " +hotel_5+ "JW Marriot Hotell");
			 		break;
			 		
			 }
			 
			 //
			 
			 Scanner s = new Scanner(System.in);
				ArrayList<String> hotelbooking = new ArrayList<>();
				int size = 0;
				System.out.println("Enter the number for how many people you want to book hotel tickets");
				size=s.nextInt();
				
				System.out.println("Enter the names of people who are going to travel");
				
				for(int i=0;i<size;i++)
				{
					hotelbooking.add(s.next());
				}
				for(String value:hotelbooking)
				{
					System.out.println("Name of people going to travel : "+ value);
				}
				
				System.out.println("Per Person Booking for hotel is 150000 : \n");
				
				if(size==0)
				{
					System.out.println("Person booking cannot be zero");
				}
			
				else
				{
					int totalprice = size*15000;
					System.out.println("Total Amount : " + totalprice +"\n");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Invalid input enter the proper charcter");
				HotelBooking();
			}
			
			break;
			
			default:
			System.out.println("Invalid Input !Enter from above Given ");
			HotelBooking();
			
		}
		}
		catch(Exception e)
		{
			System.out.println("You have selected Wrong Charcter ! please check the input type again ");
			HotelBooking();
		}
		
		System.out.println("1)Press 1 - Go back to main menu \n"
				 + "2)Press 2 - Go to Flight Booking option \n"
				 + "3)Press 3 - Go to Train Booking option ");

		Scanner b= new Scanner(System.in);
		int back_options = b.nextInt();

		switch(back_options) // add these options below too start from here 
		{
			case 1 :
				travelmeans();
				break;
		
			case 2 :
				FlightBooking();
				break;
				
			case 3 :
				Trainbooking();
				break;
		
			default :
					System.out.println("Invalid input ! please enter no mentioned in above option given ");
					travelmeans();
		}
	    }	
	
}

	public class GlobeSight {

	public static void main(String[] args) {
		
		Info in = new Info();
		in.wl();
	    in.signup();
	   
	    Travel t = new Travel();
	    t.travelmeans();
	    t.Trainbooking();
	    t.FlightBooking();

		

	}

}
