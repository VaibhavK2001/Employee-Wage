import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        
        final int wagePerHour = 20;
        final int fullDayHour = 8;

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        
        int dailyWage = 0;
        Random random = new Random();
        boolean isPresent = random.nextBoolean();
        if (isPresent) {
            System.out.println("Employee is Present");
            dailyWage = fullDayHour * wagePerHour;
        }else{
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage : "+dailyWage);
    }
    
}