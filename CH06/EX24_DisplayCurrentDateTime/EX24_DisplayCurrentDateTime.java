/**
 * (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
 * current time. Improve this example to display the current date and time. The calendar
 * example in Listing 6.12, PrintCalendar.java, should give you some ideas on
 * how to find the year, month, and day.
 * 
 * Commentary: I will use Listing 2.7, Exercise 2.8, and Exercise 3.30 to get the current
 * time in the EST time zone. I will use Listing 6.12 to get the date. I will need to calculate
 * the total days that have elapsed since Jan 1, 1970. Then determine years, and finally months.
 * Some of the methods shown in Listing 6.12 will be discarded. I will print output as described
 * in the exercise.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/12/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.24
 */



public class EX24_DisplayCurrentDateTime {

    public static void main(String[] args) {
        
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        System.out.println("Current date and time is " + getDate(totalMilliseconds) + " " + getTime(totalMilliseconds));
        
    }
    
    // Use Listing 2.7, Exercise 2.8, and Exercise 3.30 to get current (EST) time
    public static String getTime(long millis) {
        int offset = -4;  // EST time
        long totalSeconds = millis / 1000;  // total seconds
        long currentSecond = totalSeconds % 60; // remaining seconds
        long totalMinutes = totalSeconds / 60; // total minutes
        long currentMinute = totalMinutes % 60; // remaining minutes
        long totalHours = totalMinutes / 60; // total hours
        long currentHour = (totalHours + offset) % 24; // current EST hour time zone
        String amOrPM = "AM";
        
        // AM or PM?
        if (currentHour / 12 > 0) {
            currentHour = currentHour % 12;
            amOrPM = "PM";
        }
        
        return currentHour + ":" + currentMinute + ":" + currentSecond + " " + amOrPM + " EST";
    }

    // method to getDate
    public static String getDate(long millis) {
        long totalSeconds = millis / 1000; // total seconds
        long days = getDays(totalSeconds);  // total days elapsed since 1/1/1970
        int currentYear = getYearOrRemainDays(days, 0);     // decrement days and increment years to find current year
        int remainingDays = getYearOrRemainDays(days, 1);   // return remaining days after getting total years
        int currentMonth = getMonthOrRemainDays(remainingDays, currentYear, 0);     // return current month with remaining days
        remainingDays = getMonthOrRemainDays(remainingDays, currentYear, 1);   // reassign remaining days after getting current month
        String monthName = getMonthName(currentMonth); // get month name
        return monthName + " " + remainingDays + ", " + currentYear;    // return date
    }
    
    // method to getDays that have elapsed since Jan 1, 1970
    public static long getDays(long seconds) {  
        return seconds / 86400;
    }
    
    // method to return current year (0) or the remaining days after determining current year (1)
    public static int getYearOrRemainDays(long days, int yearOrDays) {
        int currentYear = 1970;
        while (days >= 365) {
            if (isLeapYear(currentYear))
                days = days - 366;
            else
                days = days - 365;
            currentYear++;
        }
        
        if (yearOrDays == 0)
            return currentYear;
        else
            return (int)days;
    }
    
    // method to return current month (0) or the remaining days after determining current month (1)
    public static int getMonthOrRemainDays(int remainDays, int curYear, int monthOrRemainDays) {
        int month = 1;
        for (int i = 1; remainDays >= 28; i++) {
            remainDays = remainDays - getNumberOfDaysInMonth(curYear, i);
            month++;
        }
        
        if (monthOrRemainDays == 0)
            return month;
        else
            return remainDays;
    }
    
    /** Get the English name for the month */
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
    
        return monthName;
    }       
        
    /** Get the number of days in a month */
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        
        if (month == 2) 
            return isLeapYear(year) ? 29 : 28;
            
        return 0; // If month is incorrect
    }
        
    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

