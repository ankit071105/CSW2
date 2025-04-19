package Assignment4;

class Q5 {
    private int num;
    private double val;

    void init(int n, double v) {
        num = n;
        val = v;
    }

    void update(int n, double v) {
        num += n;
        val += v;
    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        
        System.out.println("Initial Memory:");
        printMemory(rt);

        Q5 obj1 = new Q5();
        Q5 obj2 = new Q5();
        obj1.init(10, 5.5);
        obj2.init(20, 10.5);
        obj1.update(5, 1.1);
        obj2.update(10, 2.2);

        System.out.println("\nAfter Object Creation:");
        printMemory(rt);

        obj1 = obj2 = null; // Make objects unreachable
        System.gc(); // Request garbage collection

        System.out.println("\nAfter GC:");
        printMemory(rt);
    }

    static void printMemory(Runtime rt) {
        System.out.println("Total: " + rt.totalMemory() / 1024 + " KB");
        System.out.println("Free: " + rt.freeMemory() / 1024 + " KB");
    }
}
