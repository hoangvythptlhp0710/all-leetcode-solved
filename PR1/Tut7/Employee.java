package Tut7;

public class Employee {
    public String name;
    public double salary;
    public Employee(String employeeName, double currentSalary){
        this.name = employeeName;
        this.salary = currentSalary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
            salary = salary + (salary * (byPercent / 100));
            System.out.println("Salary after raising: " + salary);
        }
    }
