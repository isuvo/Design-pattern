public class ComplexCalculation { 
    // Method to calculate the factorial of a number
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } 
            else {
                int result = 1;
                for (int i = 1; i <= n; i++) 
                {
                    result *= i;
                }
                return result;
                }
        }
    // Method to calculate the sum of factorials of numbers from 1 to n
        public static int sumOfFactorials(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
            sum += factorial(i);
            }
            return sum;
        }

        public static void main(String[] args) {
            int n = 5;
            int result = sumOfFactorials(n);
            System.out.println("The sum of factorials up to " + n + " is: " + result);

            //RefatoredComplexCalculation abc = new RefatoredComplexCalculation();
            int refactored_result = RefatoredComplexCalculation.factorials(n);
            System.out.println("The sum of factorials up to " + n + " is: " + refactored_result);
        }
}