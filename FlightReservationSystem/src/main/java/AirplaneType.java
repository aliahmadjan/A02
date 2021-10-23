import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class AirplaneType {

		private String airplane_class; // economy, first class, business

		public AirplaneType(String airplane_class)
		{
			this.airplane_class=airplane_class;
		}
		
		public String getAirplane_class() {
			return airplane_class;
		}

		public void setAirplane_class(String airplane_class) {
			this.airplane_class = airplane_class;
		}
		
		
		void AirplaneClass()
		{
				System.out.println("Selected Class is: "+airplane_class);
		}
}
 