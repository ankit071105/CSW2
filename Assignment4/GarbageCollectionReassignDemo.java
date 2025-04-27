class ReassigningReference {
    private String name;

    public ReassigningReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected object: " + name);
        super.finalize();
    }
}

public class GarbageCollectionReassignDemo {
    public static void main(String[] args) {
        ReassigningReference obj1 = new ReassigningReference("Object1");
        ReassigningReference obj2 = new ReassigningReference("Object2");
        obj1 = obj2;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method ends.");
    }
}
