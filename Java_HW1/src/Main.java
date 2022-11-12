import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2");
        final int arrayLength = 100;
        double[] array = new double[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            array[i] = Math.random();
        }
        String result1 = String.format("Max value:\t%.3f", Arrays.stream(array).max().getAsDouble());
        String result2 = String.format("Average value:\t%.3f", Arrays.stream(array).average().getAsDouble());
        String result3 = String.format("Min value:\t%.3f", Arrays.stream(array).min().getAsDouble());
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("\nTask 3");
        for (int i = 2; i <= 100; ++i) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}