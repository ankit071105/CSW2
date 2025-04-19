package Assignment4;

class Q2 {
    String name;

    Q2(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println(name + " garbage collected");
    }

    public static void main(String[] args) {
        Q2 obj1 = new Q2("Object 1");
        Q2 obj2 = new Q2("Object 2");
        
        obj1 = obj2; // Reassign reference
        System.gc(); // Suggest garbage collection
    }
}