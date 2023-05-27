package Tut6;

import java.util.Scanner;

public class cardemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to new car!!!");
        System.out.print("Enter the fuel consumption (km/liters): ");
        double a = sc.nextDouble();
        Car myHybrid = new Car(a);
        System.out.print("Enter the gas added (liters): ");
        double b = sc.nextDouble();
        myHybrid.addGas(b);
        System.out.println("Enter the distance (km): ");
        double c = sc.nextDouble();
        myHybrid.drive(c);
        double gasLeft = myHybrid.getGasInTank();

    }
}
