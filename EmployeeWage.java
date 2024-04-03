import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        
        final int wagePerHour = 20;
        final int fullDayHour = 8;
        final int partTimeHour = 4;

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        
        int totalWage = 0;
        int totalDays = 0;
        Random random = new Random();

        while (totalDays < 20) {
            totalDays++;
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    totalWage += 0;
                    break;
                
                case 1:
                    totalWage += fullDayHour * wagePerHour;
                    break;
    
                case 2:
                    totalWage += partTimeHour * wagePerHour;
                    break;
            }
        }
        
        System.out.println("Total Wage for 20 Days: "+totalWage);
    }
    
}