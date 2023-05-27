package Tut6;

public class Car {
    private double INITIAL_FUEL_LEVEL = 0;
    private double fuel;
    private double fuelEfficiency;

    public Car(double fuelEfficiency){
        this.fuelEfficiency = fuelEfficiency;
        fuel = INITIAL_FUEL_LEVEL;
    }

    public void addGas(double gasAmount) {
        fuel += gasAmount;
    }

    public void drive(double distance) {
        fuel = fuel - (distance/fuelEfficiency);
        if (fuel == 0){
            System.out.println("The car runs out of gas.");
        }
        else if (fuel < 0){
            System.out.println("There is not enough fuel to get to the distance.");
        }
    }
    public double getGasInTank() {
        if (fuel <= 0) {
            return 0;
        } else {
            System.out.println("Gas remaining in tank: ");
            System.out.print(fuel);
            return fuel;
        }
    }

}
