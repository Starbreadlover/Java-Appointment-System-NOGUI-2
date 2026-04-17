
package Group6Functions;



import java.util.Scanner;

public class MakeAppointments {
    
    
    private String [] AppointmentName = new String [100];
    private int[] AppointmentMonth = new int [100];
    private int [] AppointmentDays = new int [100];
    private int [] startHours = new int [100];
    private int [] endHours = new int [100];
    private int count = 0;
    
    public void getInput (Scanner scanner) {
        
        if (count == 100) {
            System.out.println ("Group 6 appointments are full! ");
            return;      
        }
        
        scanner.nextLine();
        System.out.println ("Enter name of Booker (Lastname, Firstname Middle, Initial): ");
        String newName = scanner.nextLine();
        System.out.println ("Enter Month of Appointment (1-12): ");
        int newMonth = scanner.nextInt();
        
        if (newMonth < 1 || newMonth > 12) {
            System.out.println ("Invalid Month!");
            return;
        }
        
        System.out.println ("Enter Day of Appointment (1-31): ");
        int newDay = scanner.nextInt();
        if (newDay < 0 || newDay > 31) {
            System.out.println ("Invalid day");
            return;
        }
        
        System.out.println ("Enter Appointment Start (24 hour format): ");
        int newStart = scanner.nextInt();
        if (newStart < 0 || newStart> 24) {
            System.out.println ("Invalid Start Hour!");
            return;
        }
        
        System.out.println ("Enter Appointment End (24 hour format):  ");
        int newEnd = scanner.nextInt();
        if (newEnd < 0 || newEnd < newStart ) {
            System.out.println ("Invalid Hour End!");
            return;
        }
        
        for (int i = 0; i < count; i++) {
            if (AppointmentMonth [i] == newMonth && AppointmentDays [i] == newDay) {
                if (newStart < endHours[i] && newEnd > startHours [i]) {
                    System.out.println ("Schedule Conflict found! Appointment cannot be added");
                    return;
                }
            }
        }
        
        AppointmentName [count] = newName;
        AppointmentMonth [count] = newMonth;
        AppointmentDays [count] = newDay;
        startHours [count] = newStart;
        endHours [count] = newEnd;
        count++;
        System.out.println ("Appointment Scheduled!");   
    }
    
    
    public String [] getAppointmentNames () {
        return AppointmentName;
    }
    public int [] getAppointmentMonth () {
        return AppointmentMonth;
    }
    public int [] getAppointmentDays () {
        return AppointmentDays;
    }
    public int [] getstartHours () {
        return startHours;
    }   
    public int [] getendHours () {
        return endHours;
    }
    public int getCount() {
        return count;
    }
    public void setCount (int count) { // this line hard carries 
        this.count = count;
    }
    
    
    
    
    
    
}
