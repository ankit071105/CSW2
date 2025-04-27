class NullifiedReference {
    private String name;

    public NullifiedReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected object: " + name);
        super.finalize();
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        NullifiedReference obj = new NullifiedReference("MyObject");
        obj = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method ends.");
    }
}
