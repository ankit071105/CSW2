package Assignment2.Part2;

import java.util.*;

class Address {
    String plotNo;
    String at;
    String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return plotNo + ", " + at + ", " + post;
    }
}

public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();
        addressMap.put("John", new Address("123", "Main St", "NYC"));
        addressMap.put("Alice", new Address("456", "Oak Ave", "Boston"));

        Iterator<Map.Entry<String, Address>> it = addressMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Address> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
