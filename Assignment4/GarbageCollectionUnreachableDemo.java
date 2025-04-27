class UnreachableObject {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public void show() {
        UnreachableObject obj = new UnreachableObject("InnerObject");
        obj.display();
    }

    public void display() {
        System.out.println(name + " is in display method.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected object: " + name);
        super.finalize();
    }
}

public class GarbageCollectionUnreachableDemo {
    public static void main(String[] args) {
        UnreachableObject outer = new UnreachableObject("OuterObject");
        outer.show();
        outer = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method ends");
    }
}
