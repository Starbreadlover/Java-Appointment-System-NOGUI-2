/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Group6Functions;

/**
 *
 * @author shrod
 */

import java.util.Scanner;

public class CancelAppointment {
    
    public int cancel (Scanner scanner, String [] names, int[] month, int[] days, int [] startHours, int[] endHours, int count) {
        if (count == 0) {
            System.out.println ("No Appointments to Cancel!");
            return count;
        }
        
        System.out.println ("=== Appointment List ===");
        for (int i = 0; i < count; i++) {
        System.out.println ("Appointment No." + (i+1) );
        System.out.println ("Appointment by " + names[i]);
        System.out.println ("Month: " + month [i]);
        System.out.println ("Day: " + days [i]);
        System.out.println ("Time Start (24 Hour Format): " + startHours [i] + ":00");
        System.out.println ("Time End: (24 Hour Format): " + endHours [i] + ":00");
        System.out.println ("\n------------------------------\n");
        
        }
        
        System.out.println ("Select Appointment to Cancel: ");
        int cancel = scanner.nextInt();
        
        if (cancel <  1 || cancel > count) {
            System.out.println ("Invalid Number!");
            return count;
        }
        
        for (int i = cancel - 1; i < count - 1; i++) {
            names[i] = names[i + 1];
            month[i] = month[i + 1];
            days[i] = days[i + 1];
            startHours[i] = startHours[i + 1];
            endHours[i] = endHours[i + 1];
        }
        
        
        count--;
        
        System.out.println ("=== Appointment List ===");
        for (int i = 0; i < count; i++) {
        System.out.println ("Appointment No." + (i+1) );
        System.out.println ("Appointment by " + names[i]);
        System.out.println ("Month: " + month [i]);
        System.out.println ("Day: " + days [i]);
        System.out.println ("Time Start (24 Hour Format): " + startHours [i] + ":00");
        System.out.println ("Time End: (24 Hour Format): " + endHours [i] + ":00");
        System.out.println ("\n------------------------------\n");
        }
        
        System.out.println ("Successfully Canceled the Selected Appointment!");
        
     
        return count;
        
         
    }
    
}

