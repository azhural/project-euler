package solutions;
/*
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
*/

public class Problem00019 {
    public static void main(String[] args) {
        int count = 0;
        int daysFromStart = 1; //Jan 1st 1900 ...Monday
        
        for(int year = 1900; year < 2001; year++){
            System.out.println(year + " " + daysFromStart + " " + count);
            //January
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 31;
            //February
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += isLeapYear(year)?29:28;
            //March
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 31;
            //April
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 30;
            //May
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 31;
            //June
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 30;
            //July
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 31;
            //August
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 31;
            //September
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 30;
            //October
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 31;
            //November
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 30;
            //December
            if(year > 1900 && daysFromStart % 7 == 0) count++;
            daysFromStart += 31;
        }
        
        System.out.println(count);
            
    }
    
    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 != 0) return false;
            return true;
        }
        return false;
    }
}
