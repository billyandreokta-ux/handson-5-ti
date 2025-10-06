import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * method signature, overloading, pass by value/reference, static vs instance methods.
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");
        System.out.println("\n--- LATIHAN 1 ---");
        System.out.println(calculate(2, 3));
        System.out.println(calculate(2.5, 3.5));
        System.out.println(calculate(1, 2, 3));
        System.out.println(calculate("Hello", "World"));

        // ===== METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");
        System.out.println("\n--- LATIHAN 2 ---");
        print(calculate(4, 5));
        print(calculate(2.1, 3.9));
        print(calculate(7, 8, 9));
        print(calculate("Java", "Rocks"));
        print(42);
        print(3.1415);
        print("Overloading Test");
        print(new int[]{1, 2, 3, 4, 5});

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\n=== STATIC VS INSTANCE METHODS ===");
        System.out.println("\n--- LATIHAN 3 ---");
        System.out.println("Counter awal: " + getCounter());
        incrementCounter();
        System.out.println("Counter setelah increment: " + getCounter());
        MethodsAdvancedPractice obj1 = new MethodsAdvancedPractice("Objek1");
        obj1.displayInfo();
        MethodsAdvancedPractice obj2 = new MethodsAdvancedPractice("Objek2");
        obj2.displayInfo();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\n=== PASS BY VALUE - PRIMITIVES ===");
        System.out.println("\n--- LATIHAN 4 ---");
        int originalNumber = 10;
        System.out.println("Sebelum: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("Sesudah: " + originalNumber);

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");
        System.out.println("\n--- LATIHAN 5 ---");
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Sebelum: " + Arrays.toString(originalArray));
        modifyArray(originalArray);
        System.out.println("Sesudah: " + Arrays.toString(originalArray));

        System.out.println("\n--- LATIHAN 6 ---");
        int[] anotherArray = {10, 20, 30};
        System.out.println("Sebelum: " + Arrays.toString(anotherArray));
        reassignArray(anotherArray);
        System.out.println("Sesudah: " + Arrays.toString(anotherArray));

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");
        System.out.println("\n--- LATIHAN 7 ---");
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedCopy = sortArrayCopy(numbers);
        System.out.println("Sorted copy: " + Arrays.toString(sortedCopy));
        System.out.println("Original tetap: " + Arrays.toString(numbers));
        double[] stats = getArrayStats(numbers);
        System.out.println("Min: " + stats[0] + ", Max: " + stats[1] + ", Avg: " + stats[2]);
        int[] merged = mergeArrays(new int[]{1, 2}, new int[]{3, 4, 5});
        System.out.println("Merged: " + Arrays.toString(merged));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\n=== VARIABLE ARGUMENTS (VARARGS) ===");
        System.out.println("\n--- LATIHAN 8 ---");
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));
        printInfo("Nilai", 10, 20, 30);

        // ===== METHOD CHAINING =====
        System.out.println("\n=== METHOD CHAINING ===");
        System.out.println("\n--- LATIHAN 9 ---");
        Calculator calc = new Calculator(5);
        double result = calc.add(10).multiply(2).subtract(4).getResult();
        System.out.println("Hasil Chaining: " + result);

        // ===== RECURSIVE METHODS =====
        System.out.println("\n=== RECURSIVE METHODS ===");
        System.out.println("\n--- LATIHAN 10 ---");
        System.out.println("Faktorial 5: " + factorial(5));
        System.out.println("Fibonacci 6: " + fibonacci(6));
        int[] arrForSearch = {1, 3, 5, 7, 9, 11};
        System.out.println("Binary search 7: index " + binarySearchRecursive(arrForSearch, 7, 0, arrForSearch.length - 1));

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\n=== UTILITY STATIC METHODS ===");
        System.out.println("\n--- LATIHAN 11 ---");
        System.out.println("Power 2^3: " + MathUtils.power(2, 3));
        System.out.println("isPrime 7: " + MathUtils.isPrime(7));
        System.out.println("GCD 48, 18: " + MathUtils.gcd(48, 18));
        System.out.println("Reverse 'Java': " + StringUtils.reverse("Java"));
        System.out.println("Palindrome 'level': " + StringUtils.isPalindrome("level"));
        System.out.println("Word count: " + StringUtils.countWords("Java is fun"));
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        ArrayUtils.printMatrix(matrix);
        System.out.println("Duplicates: " + Arrays.toString(ArrayUtils.findDuplicates(new int[]{1, 2, 3, 2, 4, 1})));
        System.out.println("Equal arrays: " + ArrayUtils.areEqual(new int[]{1, 2}, new int[]{1, 2}));

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");
        System.out.println("\n--- LATIHAN 12 ---");
        System.out.println("Calculator int: " + CalculatorOverload.calculate(10, 20));
        System.out.println("Calculator double: " + CalculatorOverload.calculate(5.5, 4.5));
        System.out.println("Calculator string concat: " + CalculatorOverload.calculate("Data", "Science"));

        System.out.println("\n--- LATIHAN 13 ---");
        int[] data = {5, 10, 15, 20, 25};
        System.out.println("Data sum: " + DataProcessor.sum(data));
        System.out.println("Data avg: " + DataProcessor.average(data));
        System.out.println("Data max: " + DataProcessor.max(data));

        // ===== FINAL PROJECT =====
        System.out.println("\n=== LATIHAN 14 (FINAL PROJECT) ===");
        System.out.println("Faktorial 6: " + factorial(6));
        Calculator finalCalc = new Calculator(100);
        System.out.println("Chaining calc: " + finalCalc.subtract(20).multiply(2).add(10).getResult());
        System.out.println("Reverse palindrome check: " + StringUtils.isPalindrome("madam"));
        System.out.println("Prime check 29: " + MathUtils.isPrime(29));
    }

    // === METHOD OVERLOADING EXAMPLES ===
    public static int calculate(int a, int b) { return a + b; }
    public static double calculate(double a, double b) { return a + b; }
    public static int calculate(int a, int b, int c) { return a + b + c; }
    public static String calculate(String a, String b) { return a + " " + b; }

    public static void print(int value) { System.out.println("Integer: " + value); }
    public static void print(double value) { System.out.println("Double: " + value); }
    public static void print(String value) { System.out.println("String: " + value); }
    public static void print(int[] array) { System.out.println("Array: " + Arrays.toString(array)); }

    // === STATIC VS INSTANCE METHODS ===
    public static int getCounter() { return counter; }
    public static void incrementCounter() { counter++; }
    public String getInstanceName() { return instanceName; }
    public void setInstanceName(String name) { this.instanceName = name; }
    public void displayInfo() {
        System.out.println("Instance: " + instanceName + ", Counter: " + counter);
    }

    // === PASS BY VALUE DEMONSTRATIONS ===
    public static void modifyPrimitive(int number) {
        number += 10;
        System.out.println("Inside method: " + number);
    }
    public static void modifyArray(int[] array) {
        if (array.length > 0) array[0] = 99;
    }
    public static void reassignArray(int[] array) {
        array = new int[]{100, 200, 300};
        System.out.println("Inside method: " + Arrays.toString(array));
    }

    // === ARRAY METHODS ===
    public static int[] sortArrayCopy(int[] original) {
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy;
    }
    public static double[] getArrayStats(int[] array) {
        int min = Arrays.stream(array).min().orElse(0);
        int max = Arrays.stream(array).max().orElse(0);
        double avg = Arrays.stream(array).average().orElse(0);
        return new double[]{min, max, avg};
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    // === VARIABLE ARGUMENTS (VARARGS) ===
    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) total += n;
        return total;
    }
    public static void printInfo(String title, int... values) {
        System.out.println(title + ": " + Arrays.toString(values));
    }

    // === RECURSIVE METHODS ===
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (array[mid] == target) return mid;
        else if (array[mid] > target) return binarySearchRecursive(array, target, left, mid - 1);
        else return binarySearchRecursive(array, target, mid + 1, right);
    }

    // === UTILITY CLASSES ===
    public static class MathUtils {
        public static double power(double base, int exponent) {
            double result = 1;
            for (int i = 0; i < exponent; i++) result *= base;
            return result;
        }
        public static boolean isPrime(int number) {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        }
        public static int gcd(int a, int b) {
            return (b == 0) ? a : gcd(b, a % b);
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }
        public static boolean isPalindrome(String str) {
            return str.equalsIgnoreCase(reverse(str));
        }
        public static int countWords(String str) {
            if (str == null || str.trim().isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
        public static int[] findDuplicates(int[] array) {
            return Arrays.stream(array)
                    .distinct()
                    .filter(x -> Arrays.stream(array).filter(y -> y == x).count() > 1)
                    .toArray();
        }
        public static boolean areEqual(int[] array1, int[] array2) {
            return Arrays.equals(array1, array2);
        }
    }

    // === METHOD CHAINING EXAMPLE ===
    public static class Calculator {
        private double value;
        public Calculator(double initial) { this.value = initial; }
        public Calculator add(double n) { this.value += n; return this; }
        public Calculator multiply(double n) { this.value *= n; return this; }
        public Calculator subtract(double n) { this.value -= n; return this; }
        public double getResult() { return value; }
    }

    // === OVERLOAD & DATA PROCESSOR FOR LATIHAN 12 & 13 ===
    public static class CalculatorOverload {
        public static int calculate(int a, int b) { return a + b; }
        public static double calculate(double a, double b) { return a + b; }
        public static String calculate(String a, String b) { return a + b; }
    }

    public static class DataProcessor {
        public static int sum(int[] data) { return Arrays.stream(data).sum(); }
        public static double average(int[] data) { return Arrays.stream(data).average().orElse(0); }
        public static int max(int[] data) { return Arrays.stream(data).max().orElse(0); }
    }
}
