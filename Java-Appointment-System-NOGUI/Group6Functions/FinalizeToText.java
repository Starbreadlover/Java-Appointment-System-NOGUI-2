package Group6Functions;
import java.io.FileWriter;
import java.io.IOException;  
public class FinalizeToText {
	 
	
	 public void Write(String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count) { // I mean it just writes the whole thing on a txt file thats it
		try{
		  FileWriter Flwriter = new FileWriter ("FinalAppointments.txt"); // if this does not work i think the Error would be the pathing of the files
		  
		  
		  System.err.println("");
		  System.out.println ("\nFinalAppointments.txt file has been created!\n");
	        if (count == 0) {
	            System.out.println ("No Appointments found");
	        }
	        
	        for (int i = 0; i < count; i++) {
	        Flwriter.write("Appointment by " + names[i] + "\n");
	        Flwriter.write("Month: " + month [i] + "\n");
	        Flwriter.write("Day: " + days [i] + "\n");
	        Flwriter.write("Time Start (24 Hour Format): " + startHours [i] + ":00" + "\n");
	        Flwriter.write("Time End: (24 Hour Format): " + endHours [i] + ":00" + "\n");
	        Flwriter.write("\n------------------------------\n");
	        }
	        
	        Flwriter.close();
	        
	    }catch (IOException e ) {
	    	System.out.println("An error occurred.");
	        e.printStackTrace();
		}
		 
	 	}
}
	 
	
