import java.util.Random;

public class UC {
    
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");

        Random rand = new Random();
        boolean isPresent = rand.nextBoolean();

        if (isPresent) {
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
