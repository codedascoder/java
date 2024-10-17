//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Using arithmetic operations
        a = a + b;  // a becomes 15
        b = a - b;  // b becomes 5
        a = a - b;  // a becomes 10
        System.out.println("After swap: a = " + a + ", b = " + b);
        String str = "madam";

        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        // Check for palindrome
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        int n = 5;  // Number of rows
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        int number = 153;
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;  // Get last digit
            sum += digit * digit * digit;  // Cube the digit and add to sum
            number /= 10;  // Remove last digit
        }

        // Check if the sum is equal to the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        int num1 = 29;
        boolean isPrime = true;

        if (num1 <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num1 + " is a prime number.");
        } else {
            System.out.println(num1 + " is not a prime number.");
        }
        int numm = 5;
        long factorial = 1;

        for (int i = 1; i <= numm; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + numm + " is: " + factorial);

       int start =10;
       int end = 50;
       for (int i = start; i<=end; i++){
           if (isPrime(i)){
               System.out.println(i+ " ");
           }
       }
    }
    public static boolean isPrime(int num1){
        if (num1<=1) return false;
        for (int i =2; i<Math.sqrt(num1); i++){
            if (num1% i==0)return false;
        }
        return true;
    }
}
