import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        int [][] matriks= new int[3][4];
        matriks[0] = new int[]{1, 2, 3 ,4};
        matriks[1] = new int[]{5, 6, 7, 8};
        matriks[2] = new int[]{9, 10, 11, 12};

        System.out.println("Isi Matriks:");
        displayMatrix(matriks);

        // Latihan 2: Array 2D papan catur
        String[][] board = {
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };
        board[0][0] ="X"; board[1][1] ="X"; board[2][2] ="X";
        board[0][2] ="O"; board[1][0] ="O"; board[2][1] ="O";

        System.out.println("\nPapan Catur: ");
        for(int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // ===== ARRAY JAGGED =====
        System.out.println("\n=== ARRAY JAGGED (IRREGULAR) ===");
        int [][] jaggedArray = new int [4][];
        jaggedArray[0] = new int [2];
        jaggedArray[1] = new int [4];
        jaggedArray[2] = new int [3];
        jaggedArray[3] = new int [5];

        int value = 1;
        for (int i=0; i<jaggedArray.length; i++){
            for (int j=0; j<jaggedArray[i].length; j++){
                jaggedArray[i][j] = value++;
            }
        }

        System.out.println("Isi Array Jagged:");
        for (int i=0; i<jaggedArray.length; i++){
            System.out.print("Baris " + i + " (panjang " + jaggedArray[i].length + "): ");
            for (int j=0; j<jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\n=== OPERASI LANJUTAN PADA ARRAY ===");

        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrixB = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] sum = addMatrices(matrixA, matrixB);
        int[][] scalarA = multiplyByScalar(matrixA, 2);
        int[][] scalarB = multiplyByScalar(matrixB, 2);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        System.out.println("Hasil Penjumlahan (A + B):");
        displayMatrix(sum);
        System.out.println("Matrix A * 2:");
        displayMatrix(scalarA);
        System.out.println("Matrix B * 2:");
        displayMatrix(scalarB);

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array asli: " + Arrays.toString(numbers));

        int[] sorted = sortArray(numbers.clone());
        System.out.println("Setelah sorting: " + Arrays.toString(sorted));

        int[] reversed = reverseArray(sorted);
        System.out.println("Setelah dibalik: " + Arrays.toString(reversed));

        int[] minMax = findMinMax(numbers);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        int[] data = {5, 2, 8, 1, 9, 3};
        System.out.println("Array awal: " + Arrays.toString(data));

        Arrays.sort(data);
        System.out.println("Sorted: " + Arrays.toString(data));

        int pos = Arrays.binarySearch(data, 8);
        System.out.println("Index dari 8: " + pos);

        Arrays.fill(data, 7);
        System.out.println("Setelah fill: " + Arrays.toString(data));

        int[] copy = Arrays.copyOf(data, 10);
        System.out.println("Copy dengan panjang 10: " + Arrays.toString(copy));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\n=== ARRAY 3D DAN KOMPLEKS ===");

        int[][][] array3D = new int[2][3][4];
        int counter = 1;
        for (int i=0; i<array3D.length; i++){
            for (int j=0; j<array3D[i].length; j++){
                for (int k=0; k<array3D[i][j].length; k++){
                    array3D[i][j][k] = counter++;
                }
            }
        }

        for (int i=0; i<array3D.length; i++){
            System.out.println("Matriks ke-" + (i+1));
            displayMatrix(array3D[i]);
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int[][] nilai = new int[namaMahasiswa.length][mataKuliah.length];
        fillRandomGrades(nilai, 60, 100);

        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%10s", mk);
        }
        System.out.printf("%10s%n", "Rata-rata");

        double highestAvg = 0;
        String topStudent = "";

        for (int i=0; i<nilai.length; i++){
            System.out.printf("%-10s", namaMahasiswa[i]);
            double avg = calculateAverage(nilai[i]);
            for (int j=0; j<nilai[i].length; j++){
                System.out.printf("%10d", nilai[i][j]);
            }
            System.out.printf("%10.2f%n", avg);
            if (avg > highestAvg){
                highestAvg = avg;
                topStudent = namaMahasiswa[i];
            }
        }
        System.out.println("\nMahasiswa dengan nilai rata-rata tertinggi: " + topStudent + " (" + highestAvg + ")");
    }

    // ===== IMPLEMENTASI METHODS =====
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i=0; i<n; i++){
            result[i] = arr[n-1-i];
        }
        return result;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr){
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillRandomGrades(int[][] grades, int min, int max) {
        Random rand = new Random();
        for (int i=0; i<grades.length; i++){
            for (int j=0; j<grades[i].length; j++){
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.length;
    }
}
