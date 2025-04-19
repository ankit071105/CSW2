package Assignment4;

class Q1 {
    String name;

    Q1(String name) {
        this.name = name;
    }

    void display() {
        new Q1("Display Object");
    }

    void show() {
        Q1 obj = new Q1("Show Object");
        obj.display();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " successfully garbage collected");
    }

    public static void main(String[] args) {
        new Q1("Main Object").show();
        System.gc();
    }
}
