import java.util.Random;

class CompanyEmpWage {

    public final String company;
    public final int wagePerHour;
    public final int noOfDays;
    public final int workingHours;
    public int totalWage;

    public CompanyEmpWage(String company, int wagePerHour, int noOfDays, int workingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.noOfDays = noOfDays;
        this.workingHours = workingHours;
    }

    public void setEmpWage(int totalWage){
        this.totalWage = totalWage;
    }

    @Override
    public String toString(){
        return "Total Employee Wage for Company "+company+" is : "+totalWage+"\n";
    }
    
}

public class EmployeeWage {

    int noOfCompany = 0;
    CompanyEmpWage[] companyEmpWageArray;

    
    
    public EmployeeWage() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    public void addCompanyEmpWage(String company, int wagePerHour, int noOfDays, int workingHours){
        companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company, wagePerHour, noOfDays, workingHours);
        noOfCompany++;
    }

    public void computeWage(){
        for (int i = 0; i < noOfCompany; i++) {
            companyEmpWageArray[i].setEmpWage(this.calculateWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }


    public int calculateWage(CompanyEmpWage companyEmpWage){
        
        int totalWage = 0;
        int totalDays = 0;
        int totalHours = 0;
        int full = 0;
        int part = 0;

        Random random = new Random();
        
        while (totalDays < companyEmpWage.noOfDays && totalHours < companyEmpWage.workingHours) {
            totalDays++;
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    totalWage += 0;
                    break;
                
                case 1:             // for full time
                    totalWage += 8 * companyEmpWage.wagePerHour;
                    totalHours += 8;
                    full++;
                    break;
    
                case 2:             // for part time
                    totalWage += 4 * companyEmpWage.wagePerHour;
                    totalHours += 4;
                    part++;
                    break;
            }
        }

        System.out.println("Total Full Time Days : "+full);
        System.out.println("Total Part Time Days : "+part);
        System.out.println("Total Absent Days : "+(companyEmpWage.noOfDays-(full+part)));
        System.out.println("Total Working Days : "+totalDays);
        System.out.println("Total Working Hours : "+totalHours);
        System.out.println();
        return totalWage;
 
    }
    public static void main(String[] args) {

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");
        
        EmployeeWage Obj1 = new EmployeeWage();
        Obj1.addCompanyEmpWage("Samsung", 50, 25, 100);
        Obj1.addCompanyEmpWage("Google", 40, 30, 120);
        Obj1.computeWage();
    }
    
}