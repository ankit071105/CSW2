package Assignment4;

class Q4 {
    String name;

    Q4(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println(name + " garbage collected");
    }

    public static void main(String[] args) {
        new Q4("Anonymous"); 
        System.gc();
    }
}
