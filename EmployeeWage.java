import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        
        final int wagePerHour = 20;
        final int fullDayHour = 8;

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        
        Random rand = new Random();
        boolean isPresent = rand.nextBoolean();
        if (isPresent) {
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }

    }
    
}