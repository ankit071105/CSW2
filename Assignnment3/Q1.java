package Assignnment3;

public class Q1 {
    public static void extractNumeric(String input) {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException("Input string is null or empty");
        }

        StringBuilder numbers = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        if (numbers.length() > 0) {
            System.out.println("Extracted numbers: " + numbers);
        } else {
            System.out.println("No numeric characters found");
        }
    }

    public static void main(String[] args) {
        String s = "abc123xyz45";
        extractNumeric(s);
    }
}