import java.util.*;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Flight> flight=new ArrayList();
		int key;
		
		AirplaneType AT;
		
		while (true){
			System.out.println("******Welcome to Flight Reservation System******" + "\n");
			System.out.println("1. Search Flights ( One Way ):  "+"\n");
			System.out.println("2. Search Flights ( Round Trip ):  "+"\n");
			
			System.out.println("Enter your choice: ");
			Scanner input=new Scanner(System.in);
			key=input.nextInt();
			
			switch(key)
			{
			case 1:
				Scanner scan=new Scanner(System.in);
				System.out.println("Flying From?");
				String ff=scan.next();
				System.out.println("Flying To?");
				String ft=scan.next();
				System.out.println("Departing Date: ");
				String dd=scan.next();
				System.out.println("Travellers: ");
				String adult=scan.next();
				System.out.println("Select Airplane Class: ");
				System.out.println("Economy");
				System.out.println("Premium Economy");
				System.out.println("Business ");
				System.out.println("First ");
				String airplane_type=scan.next();
				AT=new AirplaneType(airplane_type);
				//flight.add(AT);			
			}
		}
		
	}

}
