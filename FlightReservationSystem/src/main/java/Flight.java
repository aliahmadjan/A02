import java.io.FileInputStream;
	import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
	import java.io.BufferedReader;
public class Flight {

	

	   public static void main(String args[]) throws FileNotFoundException {
	      //Reading the word to be found from the user
	      Scanner sc1 = new Scanner(System.in);
	      System.out.println("Enter the word to be found");
	      String word = sc1.next();
	      boolean flag = false;
	      int count = 0;
	    //  System.out.println("Word");
	      //Reading the contents of the file
	      BufferedReader reader=new BufferedReader(new FileReader("D:\\\\Flights.txt"));
	      try {
			reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String line1=null;
	      // Scanner sc2 = new Scanner(new FileInputStream("D:\\Flights.txt"));
	      try {
			while((line1=reader.readLine())!=null) {
			    // String line = nextLine();
			     //System.out.println(line);
			   //  if(line.indexOf(word)!=-1) {
				  if(count != 0) { // count == 0 means the first line
				        System.out.println("That's not the first line");
				    }
				    count++; // count increments as you read lines
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	         }
	      
	      

}

