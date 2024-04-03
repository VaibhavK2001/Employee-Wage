import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        
        final int wagePerHour = 20;
        final int fullDayHour = 8;
        final int partTimeHour = 4;

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        
        int dailyWage = 0;
        Random random = new Random();
        int attendance = random.nextInt(3);
        
        switch (attendance) {
            case 0:
                System.out.println("Employee is Absent");
                break;
            
            case 1:
                System.out.println("Employee is Present");
                dailyWage = fullDayHour * wagePerHour;
                break;

            case 2:
                System.out.println("Employee is Part time present");
                dailyWage = partTimeHour * wagePerHour;
                break;
        }
        System.out.println("Daily Wage : "+dailyWage);
    }
    
}