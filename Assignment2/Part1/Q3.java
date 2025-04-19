class Car implements Comparable<Car> {
    String model;
    String color;
    int speed;

    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.speed, other.speed);
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car("Swift", "Red", 120);
        Car c2 = new Car("Verna", "Blue", 150);

        if (c1.compareTo(c2) > 0) {
            System.out.println("Faster car: " + c1);
        } else {
            System.out.println("Faster car: " + c2);
        }
    }
}