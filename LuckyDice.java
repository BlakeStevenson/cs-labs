import java.util.Scanner;
import java.util.ArrayList;
public class LuckyDice {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // problem 1
        System.out.print("Enter a number to find its factors: ");
        int num = scan.nextInt();
        for(int factor : findFactors(num)) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // problem 2
        System.out.print("Enter a number to find the amount of cool numbers within it: ");
        num = scan.nextInt();
        System.out.println("There are " + countCoolNumbers(num) + " cool numbers up to " + num + ".\n");

        // problem 3
        System.out.println("There are " + countCoolNumbersWhile(num) + " cool numbers up to " + num + " (using while).\n");

        // problem 4
        System.out.println("Short\n");

        // problem 5
        System.out.print("Enter a number to check if it is a perfect number: ");
        num = scan.nextInt();
        if(isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.\n");
        } else {
            System.out.println(num + " is not a perfect number.\n");
        }

        // problem 6
        if(isPerfectNumberWhile(num)) {
            System.out.println(num + " is a perfect number. (using while)\n");
        } else {
            System.out.println(num + " is not a perfect number. (using while)\n");
        }

        // problem 7
        // riddle
        System.out.println("The truck driver was walking\n");

        // lucky dice app
        System.out.print("How many faces on a dice? ");
        int faces = scan.nextInt();
        System.out.println("How many simulations do you want to run? ");
        int simulations = scan.nextInt();
        System.out.print("What is the total number you would like to roll for? ");
        int max = scan.nextInt();
        System.out.println();
        int totalRolls = 0;
        for(Integer[] result: luckyDice(faces, simulations, max)) {
            totalRolls += result[0];
            System.out.println("Simulation " + result[3] + ": A total of " + result[1] + " was reached in " + result[0] + " rolls for a total of " + result[2] + ".");
        }
        System.out.println("\nThe average number of rolls in all " + simulations + " simulations was " + totalRolls/simulations + ".");
    }

    public static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            // check if remainder of division is 0
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static int countCoolNumbers(int num) {
        int count = 0;
        for(int i = 0; i < num; i++) {
            if (isCoolNumber(i)) {
                count++;
            }
        }
        return count;
    }

    public static int countCoolNumbersWhile(int num) {
        int count = 0;
        int i = 0;
        while(i < num) {
            if (isCoolNumber(i)) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static boolean isCoolNumber(int x) {
        return (x % 3 == 1) && (x % 4 == 1) && (x % 5 == 1);
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1 ; i < num ; i++) {
            if(num % i == 0)  {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean isPerfectNumberWhile(int num) {
        int sum = 0;
        int i = 1;
        do {
            if(num % i == 0)  {
                sum += i;
            }
            i++;
        } while(i < num);
        return sum == num;
    }

    public static ArrayList<Integer[]> luckyDice(int faces, int simulations, int max) {
        ArrayList<Integer[]> out = new ArrayList<Integer[]>();
        for(int i = 1; i <= simulations; i++) {
            int total = 0;
            int tries = 0;
            while(total < max) {
                total += getNumberBetween(1, faces);
                tries += 1;
            }
            out.add(new Integer[]{tries, max, total, i});
        }

        return out;
    }

    public static int getNumberBetween(int min, int max) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
}
