public class Image {
    private int width;
    private int height;
    private String color;

    // Default constructor
    public Image() {
        width = 0;
        height = 0;
        color = "#000000";
    }

    // Parameterized constructor
    public Image(int w, int h, String c) {
        width = w;
        height = h;
        color = c;
    }

    // Setters
    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setColor(String c) {
        color = c;
    }

    // Getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Image[%dx%d, Color:%s]", width, height, color);
    }

    public static void main(String[] args) {
        Image img1 = new Image(); // Default
        Image img2 = new Image(1920, 1080, "#FFFFFF"); // Parameterized

        System.out.println("Default: " + img1);
        System.out.println("Custom: " + img2);
    }
}