import java.util.Random;

public class EmployeeWage {

    static final int fullDayHour = 8;
    static final int partTimeHour = 4;
    
    public static void calculateWage(String company,int wagePerHour, int noOfDays, int workingHours){
        
        int totalWage = 0;
        int totalDays = 0;
        int totalHours = 0;
        int full = 0;
        int part = 0;

        Random random = new Random();
        
        while (totalDays < noOfDays && totalHours < workingHours) {
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
        
        System.out.println("Company : "+company);
        System.out.println("Total Monthly Wage : $"+totalWage);
        System.out.println("Total Full Time Days : "+full);
        System.out.println("Total Part Time Days : "+part);
        System.out.println("Total Absent Days : "+(noOfDays-(full+part)));
        System.out.println("Total Working Days : "+totalDays);
        System.out.println("Total Working Hours : "+totalHours);
        System.out.println();
 
    }
    public static void main(String[] args) {

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        calculateWage("TATA",25,25,125);
        calculateWage("RELIANCE",30,30,140);
        calculateWage("QK",35,25,130);
    }
    
}