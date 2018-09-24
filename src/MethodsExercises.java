import java.util.Scanner;

public class MethodsExercises {
   static Scanner scan = new Scanner(System.in).useDelimiter("\n");
        public static void main(String[] args) {

            int userInteger = getInt(1, 100);

            System.out.println(add(3,3));
            System.out.println(subtract(3,3));
            System.out.println(multiply(3,3));
            System.out.println(divide(3,3));
            System.out.println(modulus(4,2));
            System.out.println(multiplyWithoutOperator(3,3));
            System.out.println(factorial(3));

        }

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(int numerator, int denominator) {
            return numerator / denominator;
        }

        public static int modulus(int a, int b) {
            return a % b;
        }

        //instructor solution
        public static int multiplyWithoutOperator(int a, int numberOfTimes) {
            if (a == 0 || numberOfTimes == 0) {
                return 0;
            }

            int product = 0;
            while(numberOfTimes > 0) {
                product += a;
                numberOfTimes--;
            }
            return product;
        }

        public static int getInt() {

            int number = scan.nextInt();
            return number;
        }
        public static int getInt(int min, int max) {
            System.out.println("Please input a number between " + min + " and " + max + ": ");
            int number = getInt();
            //if the numebr is in the range of the min and max, then return it
            if(number >= min && number <= max) {
                return number;
            } else {
                //otherwise, inform the user that their input was outside the range
                System.out.println(number + " is outside of the range of " + min + " and " + max);
                return getInt(min, max);
            }
        }

        //factorial
        public static long factorial(int f) {
            long factorial = 1;

            while(f > 1) {
                factorial *= f;
                f--;
            }
            return factorial;
        }

    }


