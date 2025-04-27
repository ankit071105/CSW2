class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected object: " + name);
        super.finalize();
    }
}

public class AnonymousObjectDemo {
    public static void main(String[] args) {
        new AnonymousObject("AnonymousObject");
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method ends.");
    }
}
