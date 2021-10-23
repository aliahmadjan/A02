import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Passenger {
	
	private String name;
	private String address;
	private String passport_no;
	private int age;
	private int gender;
	private String dob; // date of birth
	private String origin;
	private String destination;
	private String flight_dates;
	private String no_of_passengers;
	private String flight;
	private int seat_no;
	
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFlight_dates() {
		return flight_dates;
	}
	public void setFlight_dates(String flight_dates) {
		this.flight_dates = flight_dates;
	}
	public String getNo_of_passengers() {
		return no_of_passengers;
	}
	public void setNo_of_passengers(String no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}
	
	
	void BookingDetailsDomestic()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Date of Birth: "+dob);
		System.out.println("Origin: "+origin);
		System.out.println("Destination: "+destination);
		System.out.println("Flight Dates: "+flight_dates);
		System.out.println("Seat No: "+seat_no);
	}
	
	void BookingDetailsInternational()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Passport No: "+passport_no);
		System.out.println("Date of Birth: "+dob);
		System.out.println("Origin: "+origin);
		System.out.println("Destination: "+destination);
		System.out.println("Flight Dates: "+flight_dates);
		System.out.println("Seat No: "+seat_no);
	}
	

}
