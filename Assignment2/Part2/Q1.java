package Assignment2.Part2;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 25);
        Pair<Integer, String> p2 = new Pair<>(1, "One");

        System.out.println(p1.getKey() + ": " + p1.getValue());
        System.out.println(p2.getKey() + ": " + p2.getValue());
    }
}