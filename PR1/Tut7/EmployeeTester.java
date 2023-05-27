package Tut7;

import java.util.Scanner;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee harry = new Employee("harry",50000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the raising percentage of the salary (%): ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Sorry, the percentage can't be smaller or equal to 0.");
        }
        else{
            harry.raiseSalary(n);
        }
    }
}
