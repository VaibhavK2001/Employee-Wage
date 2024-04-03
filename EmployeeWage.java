import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        
        final int wagePerHour = 20;
        final int fullDayHour = 8;
        final int partTimeHour = 4;

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        
        int totalWage = 0;
        int totalDays = 0;
        int totalHours = 0;
        int full = 0;
        int part = 0;

        Random random = new Random();
        
        while (totalDays < 20 && totalHours < 100) {
            totalDays++;
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    totalWage += 0;
                    break;
                
                case 1:             // for full time
                    totalWage += fullDayHour * wagePerHour;
                    totalHours += fullDayHour;
                    full++;
                    break;
    
                case 2:             // for part time
                    totalWage += partTimeHour * wagePerHour;
                    totalHours += partTimeHour;
                    part++;
                    break;
            }
        }
        
        System.out.println("Total Monthly Wage : $"+totalWage);
        System.out.println("Total Full Time Days : "+full);
        System.out.println("Total Part Time Days : "+part);
        System.out.println("Total Absent Days : "+(20-(full+part)));
        System.out.println("Total Working Days : "+totalDays);
        System.out.println("Total Working Hours : "+totalHours);
        System.out.println();
    }
    
}