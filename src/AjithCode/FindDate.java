package AjithCode;

import java.time.LocalDate;

public class FindDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's Date is: "+currentDate);

        // Find the date after 20 days
        LocalDate dateAfter20Days = currentDate.plusDays(24);

        // Print the result
        System.out.println("Today's Date is: " + currentDate);
        System.out.println("Date after 20 days: " + dateAfter20Days);
    }
}
