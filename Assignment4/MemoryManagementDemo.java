class MyClass {
    private int intValue;
    private double doubleValue;

    public MyClass(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void updateValues(int newIntValue, double newDoubleValue) {
        this.intValue = newIntValue;
        this.doubleValue = newDoubleValue;
    }
}

public class MemoryManagementDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memory before creating objects:");
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
        MyClass obj1 = new MyClass(10, 20.5);
        MyClass obj2 = new MyClass(30, 40.5);
        obj1.setIntValue(15);
        obj1.setDoubleValue(25.5);

        obj2.updateValues(35, 45.5);
        System.out.println("\nMemory after creating objects:");
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
        obj1 = null;
        obj2 = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nMemory after garbage collection:");
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
    }
}
