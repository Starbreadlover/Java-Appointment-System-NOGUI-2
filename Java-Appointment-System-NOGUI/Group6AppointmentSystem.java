import Group6Functions.*;
import java.util.Scanner;

public class Group6AppointmentSystem {
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner (System.in);
        MakeAppointments make = new MakeAppointments();
        CheckAppointments check = new CheckAppointments();
        CancelAppointment cancel = new CancelAppointment();
        FinalizeToText finalize = new FinalizeToText();

        int choice;
        int SortMode;
        boolean SwapFlag = false;
        int SwapChoice;
        int Sentinel = 6;
        int Newcount ;
        do  {
            
            System.out.println ("\n===== Welcome To Group6 Corp Appointment System =====");
            System.out.println ("[1] Book An Appointment");
            System.out.println ("[2] View Booked Appointments");
            System.out.println ("[3] Cancel Appointment");
            System.out.println("[4: Save Appointments");
            System.out.println ("[6] Exit");
     
            System.out.print ("Enter Choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 :
                    make.getInput(scanner);
                    break;
                    
                case 2:
                    check.viewAppointments(make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(),
                    make.getstartHours(), make.getendHours(),make.getCount());
                    
                    
                    System.out.println("[1] Sort Alphabetically");
                    System.out.println("[2] Sort By Date");
                    System.out.println ("[3] Exit View Booked Appointments"); 
                    System.out.print("Choice: ");
                    SortMode = scanner.nextInt();
                    scanner.nextLine();// sometimes there are extra lines here i dont know why
                    if (SortMode != 3) {
                    System.out.println("[1] Keep Your Appointments Ordering?");
                    System.out.println("[Any Number Besides 1] Swap Your Appointments Ordering?"); // I just changed it to where i prompt the user if they want to change the ordering
                    
                    SwapChoice = scanner.nextInt();
                    	if (SwapChoice  == 1) 
                    		SwapFlag = false;
                    	else 
                    		SwapFlag = true;
                    	
                    }
                    check.viewAppointments(make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(),
                            make.getstartHours(), make.getendHours(),make.getCount() , SortMode , SwapFlag);
                    break;
                   
                case 3:
                    Newcount = cancel.cancel(scanner, make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(), make.getstartHours(),
                            make.getendHours(), make.getCount());
                    
                    make.setCount(Newcount);
                    break;
                    
                case 4:
                    finalize.Write(make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(),
                make.getstartHours(), make.getendHours(),make.getCount());

                default :
                    break;
        }
            
            
        } while (choice != Sentinel);
        
    
    }
    
}