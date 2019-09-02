package intermediate;
import java.util.*;
    // Date getTime(): It is used to return a
// Date object representing this
// Calendar's time value.

public class CalendarDate {
        public static void main(String args[])
        {
            Calendar c = Calendar.getInstance();
            System.out.println("The Current Date is:" + c.getTime());
            // Demonstrate Calendar's get()method
            System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
            System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
            System.out.println("Current HOUR OF DAY: " + c.get(Calendar.HOUR_OF_DAY));
            System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
            System.out.println("Current SECOND: " + c.get(Calendar.SECOND));
            c.add(Calendar.YEAR,4);
            System.out.println("After 4 YEARS: " + c.getTime());

        }

}
