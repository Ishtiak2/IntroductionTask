package Practice5;
class Car{
    private String owner;
    private String brand;
    private String serialNumber;
    private boolean isRunning;
    private double fuelLevel;

    public Car(String owner, String brand, String serialNumber, double fuelLevel){
        this.owner  = owner;
        this.brand  = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;

    }

    public void start(){
        if(fuelLevel > 0){
            isRunning = true;
            System.out.println("Car started.");
        }
        else {
            System.out.println("Cannot start. Fuel is empty. ");
        }
    }

    public void stop(){
        if(isRunning){
            isRunning = false;
            System.out.println("Car stopped.");
        }
        else{
            System.out.println("Car is already stopped. ");
        }
    }

    public void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + " liters. ");
    }

    public void refuel(double amount){
        if(amount > 0){
            fuelLevel += amount;
            System.out.println("Car refueled. Current fuel level: " + fuelLevel + " liters.");

        }
        else{
            System.out.println("Invalid fuel amount.");
        }
    }

    public String getOwner() {
        return owner;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public boolean isRunning(){
        return isRunning;
    }
}

public class Main {
    public static void main(String[] args){
        Car myCar = new Car("Ishtiak Rahman", "Toyota", "12345XYZ", 10.0);
        myCar.checkFuel();
        myCar.start();
        myCar.refuel(5.0);
        myCar.checkFuel();
    }
}
