package Assignment4;

import java.util.ArrayList;
import java.util.Date;

class Q6 {
    static class BigObject {
        long[] data = new long[10000]; // ~80KB per object
    }

    public static void main(String[] args) {
        printMemory("Start");
        ArrayList<BigObject> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(new BigObject());
            if (i % 100 == 0) printMemory("Created " + i);
        }

        list = null; // Make objects unreachable
        printMemory("Before GC");
        System.gc();
        printMemory("After GC");
    }

    static void printMemory(String phase) {
        Runtime rt = Runtime.getRuntime();
        System.out.printf("[%tT] %-15s Total: %6d MB, Free: %6d MB%n",
                new Date(), phase,
                rt.totalMemory() / (1024 * 1024),
                rt.freeMemory() / (1024 * 1024));
    }
}
