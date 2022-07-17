package com.jap.dayfinder;

public class DayFinder {
//The current day of week is taken in int (For Sunday 1, Monday 2, Tuesday 3....Saturday 7)
    public String predictDay(int currentDay, int noOfDaysFromToday)
    { 
		

        String nextDayIs=null;

        int daysAfter=(currentDay+noOfDaysFromToday-(noOfDaysFromToday));

        if (daysAfter>7)
        {
            int rem=daysAfter%7;
            daysAfter=rem;
        }


        switch(daysAfter)
        {

            case 1:
                nextDayIs="Sunday";
                break;
            case 2:
                nextDayIs="Monday";
                break;
            case 3:
                nextDayIs="Tuesday";
                break;
            case 4:
                nextDayIs="Wednesday";
                break;
            case 5:
                nextDayIs="Thursday";
                break;
            case 6:
                nextDayIs="Friday";
                break;
            case 7:
                nextDayIs="Saturday";
                break;
        }
            return nextDayIs;
    }


    public static void main(String[] args)
	{
		
        DayFinder dayFinder = new DayFinder();
        // input of medicine taken day and the next dose to be taken in how many days
        int medicineTakenOn =0;
        int daysToNextDose =0;

        // call the method to predict the day the next dose must be taken
        String nextDoseToBeTakenOn =dayFinder.predictDay(medicineTakenOn,daysToNextDose);
        // display the day
        System.out.println("Your next dose should be taken on :  "+nextDoseToBeTakenOn);
    }

}
 