import java.util.ArrayList;

class Image {
    private int w, h;
    private String color;

    public Image(int w, int h, String c) {
        this.w = w;
        this.h = h;
        this.color = c;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return w + "x" + h + " " + color;
    }
}

class ImageLibrary {
    private ArrayList<Image> images = new ArrayList<>();

    public void addImage(Image img) {
        images.add(img);
    }

    public Image getImage(int index) {
        return (index >= 0 && index < images.size()) ? images.get(index) : null;
    }

    public Image search(int w, int h, String color) {
        for (Image img : images) {
            if (img.getWidth() == w && img.getHeight() == h && img.getColor().equals(color)) {
                return img;
            }
        }
        return null;
    }
}

public class ImageController {
    public static void main(String[] args) {
        ImageLibrary lib = new ImageLibrary();

        // Add images
        lib.addImage(new Image(1920, 1080, "#FFFFFF"));
        lib.addImage(new Image(800, 600, "#000000"));

        // Search and display
        Image found = lib.search(800, 600, "#000000");
        System.out.println("Found: " + found);

        // Get by index
        System.out.println("First image: " + lib.getImage(0));
    }
}