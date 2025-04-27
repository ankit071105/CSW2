import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class LargeObject {
    private int[] data = new int[10000];
}

public class G1GarbageCollectorTest {
    public static void main(String[] args) {
        ArrayList<LargeObject> list = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        for (int i = 1; i <= 100000; i++) {
            list.add(new LargeObject());
            if (i % 5000 == 0) {
                String timeStamp = sdf.format(new Date());
                long totalMemory = runtime.totalMemory();
                long freeMemory = runtime.freeMemory();
                System.out.println("[" + timeStamp + "] Objects Created: " + i);
                System.out.println("Total Heap Memory: " + totalMemory / (1024 * 1024) + " MB");
                System.out.println("Free Heap Memory: " + freeMemory / (1024 * 1024) + " MB");
                System.out.println("---------------------------------------------");
            }
        }
        System.out.println("\nAll objects created.");
        list = null;
        System.gc();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String timeStamp = sdf.format(new Date());
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("[" + timeStamp + "] After Garbage Collection:");
        System.out.println("Total Heap Memory: " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Heap Memory: " + freeMemory / (1024 * 1024) + " MB");
    }
}
