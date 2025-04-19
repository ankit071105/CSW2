interface Vehicle {
    void accelerate();

    void brake();
}

class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }

    public void accelerate(int speed) {
        System.out.println("Car accelerating to " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car reaching " + speed + " km/h in " + duration + " seconds");
    }

    @Override
    public void brake() {
        System.out.println("Car braking...");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle pedaling faster...");
    }

    public void accelerate(int gear) {
        System.out.println("Bicycle shifting to gear " + gear);
    }

    @Override
    public void brake() {
        System.out.println("Bicycle applying brakes...");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bicycle();

        // Method overriding
        car.accelerate();
        car.brake();
        bike.accelerate();
        bike.brake();

        // Method overloading
        ((Car) car).accelerate(100);
        ((Car) car).accelerate(100, 8);
        ((Bicycle) bike).accelerate(3);
    }
}