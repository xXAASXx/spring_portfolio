package com.nighthawk.spring_portfolio.mvc.calendar;

public class APCalendar {
        
    public static boolean isLeapYear(int year) {

        if ( (year % 4 == 0) && (year % 100 != 0)){
            return true;
        }
        else if ( year % 400 == 0 ){
            return true;
        }
        else {
            return false;
        }

        }
    
    public static int numberOfLeapYears(int year1, int year2) {
       
        int numOfLeapYears = 0; // initialize final count variable
        for(int i = year1; i <= year2; i++){ // for loop that starts at the year1 number and goes until year 2 including it
            if(isLeapYear(i)){  // if the year is a leap year, add 1 to the count
                numOfLeapYears += 1;
            }
        }
        return numOfLeapYears; // return the count

        }
        
    public static int firstDayOfYear(int year) {

        return year = (int) Math.floor( Math.random() * 7 );

        }


    public static int dayOfYear(int month, int day, int year) {
        
        return (int) (Math.random() * (366 - 1)) + 1;
    
        }

    public static int dayOfWeek(int month, int day, int year) { 
      
        int startDay = firstDayOfYear(year);
        int selectedDay = dayOfYear(month, day, year);
        int returnDay = (startDay + selectedDay - 1) % 7;
        return returnDay;
        
        }

    /** Tester method */
    public static void main(String[] args) {
       
        // Private access modifiers
        System.out.println("\n \n firstDayOfYear: " + APCalendar.firstDayOfYear(2022));

        System.out.println("\n dayOfYear: " + APCalendar.dayOfYear(1, 1, 2022));

        // Public access modifiers
        System.out.println("\n Testing isLeapYear:");

        System.out.println("\n isLeapYear 2022: " + APCalendar.isLeapYear(2022));
        System.out.println("\n isLeapYear 2000: " + APCalendar.isLeapYear(2000));
        System.out.println("\n isLeapYear 3000: " + APCalendar.isLeapYear(3000));


        System.out.println("\n numberOfLeapYears: " + APCalendar.numberOfLeapYears(2000, 2022));

        System.out.println("\n dayOfWeek: " + APCalendar.dayOfWeek(1, 1, 2022));
    }

}

