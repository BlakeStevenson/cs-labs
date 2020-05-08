import java.util.Scanner;
public class PrimeChecker {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //1
        for(int i = 1; i < 10; i++) System.out.print(i);
        System.out.println("");
        //2
        for(int i = 1; i < 10; i++) System.out.print(i + " ");
        System.out.println("");
        //3
        for(int i = 2; i <= 20; i+= 2) System.out.print(i + " ");
        System.out.println("");
        //4
        for(int i = 20; i <= 25; i++) System.out.print(i + " ");
        System.out.println("");
        //5
        for(int i = 10; i < 80; i+= 10) System.out.print(i + " ");
        System.out.println("");
        //6
        // Riddle
        //7
        for(int i = 0; i >= -10; i--) System.out.print(i + " ");
        System.out.println("");
        //8
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) System.out.print("* ");
        System.out.println("");
        //9
        for(int i = 1; i <= 10; i++) System.out.print(i * i + " ");
        System.out.println("");
        //10
        for(int i = 1; i <= 9; i++) {
            if(i == 3 || i == 6 || i == 9) System.out.print("? ");
            else System.out.print(i + " ");
        }
        System.out.println("");
        //11
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
             fact = fact*i;
        }
        System.out.println(fact);
        // prime checker
        boolean prime = true;
        System.out.print("Prime Number Checker:\n1): Check for a prime\n2): Exit\n");
        int option = scan.nextInt();
        if(option == 1) {
            System.out.print("Enter a number to check: ");
            int number = scan.nextInt();
            for(int i = 2; i <= number / 2; ++i) {
                if(number % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime)
                System.out.println(number + " is a prime number");
            else
                System.out.println(number + " is not a prime number");
        } else {
            System.out.println("Exiting...");
        }
    }
}
