package Assignnment3;

public class Q7 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        try {
            // Matrix Addition
            System.out.println("Matrix Addition:");
            int[][] sum = addMatrices(a, b);
            printMatrix(sum);
            
            // Matrix Multiplication
            System.out.println("\nMatrix Multiplication:");
            int[][] product = multiplyMatrices(a, b);
            printMatrix(product);
            
            // Transpose
            System.out.println("\nMatrix Transpose:");
            int[][] transposed = transposeMatrix(a);
            printMatrix(transposed);
            
            // Force exception
            System.out.println("\nAccessing invalid element:");
            System.out.println(a[2][2]); // Will throw exception
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access invalid matrix index - " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    static int[][] addMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have same dimensions for addition");
        }
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    
    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("Number of columns in first matrix must match rows in second");
        }
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
    
    static int[][] transposeMatrix(int[][] a) {
        int[][] result = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }
    
    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}