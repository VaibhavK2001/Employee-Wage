import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        
        Random random = new Random();
        boolean isPresent = random.nextBoolean();
        if (isPresent) {
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }
    }
    
}