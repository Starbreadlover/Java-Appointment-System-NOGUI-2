package Group6Functions;
// this is just so the code overall does not duplicate and over all smaller
public class SorterUtils {
	public static void alphabeticalSort (String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count ) { 
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    int tempMonth = month[j];
                    month[j] = month[j + 1];
                    month[j + 1] = tempMonth;

                    int tempDay = days[j];
                    days[j] = days[j + 1];
                    days[j + 1] = tempDay;

                    int tempStart = startHours[j];
                    startHours[j] = startHours[j + 1];
                    startHours[j + 1] = tempStart;

                    int tempEnd = endHours[j];
                    endHours[j] = endHours[j + 1];
                    endHours[j + 1] = tempEnd;
                }
            }
        }
        
	}
	
	public static void DateSort (String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count) {
		
	for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - 1 - i; j++) {
            boolean swap = false;

            if (month[j] > month[j + 1]) {
                swap = true;
            } else if (month[j] == month[j + 1] && days[j] > days[j + 1]) {
                swap = true;
            } else if (month[j] == month[j + 1] && days[j] == days[j + 1] && startHours[j] > startHours[j + 1]) {
                swap = true;
            }

            if (swap) {
                String tempName = names[j];
                names[j] = names[j + 1];
                names[j + 1] = tempName;

                int tempMonth = month[j];
                month[j] = month[j + 1];
                month[j + 1] = tempMonth;

                int tempDay = days[j];
                days[j] = days[j + 1];
                days[j + 1] = tempDay;

                int tempStart = startHours[j];
                startHours[j] = startHours[j + 1];
                startHours[j + 1] = tempStart;

                int tempEnd = endHours[j];
                endHours[j] = endHours[j + 1];
                endHours[j + 1] = tempEnd;
            	}
        	}
    	}
	
	}
}
