package software.ulpgc.katas.aplication.domain;

public class FibonacciSeries {
    public static int[] calculate(int n) {
        int[] result = new int[n];
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            result[i] = a;
            a = b;
            b += result[i];
        }
        return result;

    }

}
