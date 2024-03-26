public class RefatoredComplexCalculation {
   
    // Optimized method to calculate the sum of factorials of numbers from 1 to n
    public static int factorials(int n) {
        int sum = 0;
        int factorial = 1; // To hold the factorial result which will be reused

        for (int i = 1; i <= n; i++) {
            factorial *= i; // Calculate the current factorial based on the previous one
            sum += factorial; // Add the current factorial to the sum
        }
        return sum;
    }
}
