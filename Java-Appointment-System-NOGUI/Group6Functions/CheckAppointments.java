
package Group6Functions;

public class CheckAppointments {
    
    public void viewAppointments(String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count) {
       
        
        System.out.println ("=== Appointment List ===\n");
        if (count == 0) {
            System.out.println ("No Appointments found");
        }
  
        
        for (int i = 0; i < count; i++) {
        System.out.println ("Appointment by " + names[i]);
        System.out.println ("Month: " + month [i]);
        System.out.println ("Day: " + days [i]);
        System.out.println ("Time Start (24 Hour Format): " + startHours [i] + ":00");
        System.out.println ("Time End: (24 Hour Format): " + endHours [i] + ":00");
        System.out.println ("\n------------------------------\n");
        }
    }
    public void viewAppointments(String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count , int mode , boolean flag) {
    	
    	String[] CN = names.clone();
    	int [] CM = month.clone();
    	int [] CD = days.clone(); // a clone of an array , it does not take memory after the method ends
    	int [] CSH = startHours.clone();
    	int [] CEH = endHours.clone();
    	
        System.out.println ("=== Appointment List ===\n");
        if (count == 0) {
            System.out.println ("No Appointments found");
        }
        switch(mode) {
        case 1:
        	
        	SorterUtils.alphabeticalSort(CN,  CM, CD,  CSH,  CEH, count);
        	
        	for (int i = 0; i < count; i++) {
        		System.out.println ("Appointment by " + CN[i]);
        		System.out.println ("Month: " + CM [i]);
        		System.out.println ("Day: " + CD [i]);
        		System.out.println ("Time Start (24 Hour Format): " + CSH [i] + ":00");
        		System.out.println ("Time End: (24 Hour Format): " + CEH [i] + ":00");
        		System.out.println ("\n------------------------------\n");
        
        }
        	if (flag) {
            	SorterUtils.alphabeticalSort(names, month, days, startHours, endHours, count); // if the flag is true then it swaps the ordering else it just does not run 
            }
        break; 
        
        case 2:
        	SorterUtils.DateSort(CN,  CM, CD,  CSH,  CEH, count);
        	for (int i = 0; i < count; i++) {
        		
               System.out.println ("Appointment by " + CN[i]);
               System.out.println ("Month: " + CM [i]);
               System.out.println ("Day: " + CD [i]);
               System.out.println ("Time Start (24 Hour Format): " + CSH [i] + ":00");
               System.out.println ("Time End: (24 Hour Format): " + CEH [i] + ":00");
               System.out.println ("\n------------------------------\n");
        }    
        if (flag) {
        	SorterUtils.DateSort(names, month, days, startHours, endHours, count); // same comment as line 51
        }
        break;
        case 3: // Does nothing its just meant to exit without sorting
        break;
        }
     
    }
}