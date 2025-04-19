class Animal {
    String name;
    String color;
    String type; 

    Animal(String n, String c, String t) {
        name = n;
        color = c;
        type = t;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + color.hashCode() + type.hashCode();
    }
}

public class Q6 {
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog", "Brown", "pet");
        Animal a2 = new Animal("Lion", "Yellow", "wild");
        Animal a3 = new Animal("Cat", "White", "pet");

        System.out.println("HashCode for " + a1.name + ": " + a1.hashCode());
        System.out.println("HashCode for " + a2.name + ": " + a2.hashCode());
        System.out.println("HashCode for " + a3.name + ": " + a3.hashCode());
    }
}