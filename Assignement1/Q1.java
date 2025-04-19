class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Camry");
        Car myCar2 = null;

        System.out.println("Initial details:");
        myCar1.printDetails();
        if (myCar2 == null) {
            System.out.println("myCar2 is null");
        }

        myCar2 = new Car(null, null);
        myCar2.setMake("Honda");
        myCar2.setModel("Accord");

        System.out.println("\nUpdated details:");
        myCar1.printDetails();
        myCar2.printDetails();
    }
}