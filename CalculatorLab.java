import java.util.Scanner;
public class CalculatorLab {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        calculator();
    }

    public static void one() {
        System.out.print("1): Enter an integer: ");
        int a = scan.nextInt();
        if(a == 9) System.out.println("#1");
    }

    public static void two() {
        System.out.print("2): Enter an integer: ");
        int b = scan.nextInt();
        if(b == 9 || b  > 20) System.out.println("#2");
    }

    public static void three() {
        System.out.print("3): Enter an integer: ");
        int c = scan.nextInt();
        if(c == 5 || c == 6) System.out.println("#3");
    }

    public static void four() {
        scan.nextLine();
        System.out.print("What is the solution to the riddle 9 = L of a C? ");
        String answer = scan.nextLine();
        if(answer.equals("9 lives of a cat")) System.out.println("#4");
    }

    public static void five() {
        System.out.print("5): Enter an integer: ");
        int d = scan.nextInt();
        if(d != 4) System.out.println("#5");
    }

    public static void six() {
        System.out.print("6): Enter a double: ");
        double e = scan.nextDouble();
        if(e < 10 && e > 2 && e != 7.5) System.out.println("#6");
    }

    public static void seven() {
        System.out.print("7): Enter a double: ");
        double f = scan.nextDouble();
        if(f < 24 && f > 16) System.out.println("#7");
    }

    public static void eight() {
        System.out.println("7): Welcome to Mr. Bunn's Quest, assign stats to your character (max 15 points TOTAL)");
        System.out.print("Enter strength (from 1 to 10): ");
        int strength = scan.nextInt();
        System.out.print("\nEnter health (from 1 to 10): ");
        int health = scan.nextInt();
        System.out.print("\nEnter magic (from 1 to 10): ");
        int magic = scan.nextInt();
        if((strength + health + magic) > 15) {
            strength = 5; health = 5; magic = 5;
            System.out.println("Point limit exceeded! Default values assigned.");
        }
        System.out.println("Strength = " + strength + ", health = " + health + ", magic = " + magic + ". Good luck!");
    }

    public static void nine() {
        scan.nextLine();
        System.out.print("What is the solution to the riddle Tear one off and scratch my head what was red is black instead? ");
        String answer = scan.nextLine();
        if(answer.equals("a match")) System.out.println("#9");
    }

    public static void calculator() {
        System.out.println("Calculator. Please select an option." +
                "\n1): Addition\n2): Subtraction\n3): Multiplication\n4): Division\n5): Modulus");
        switch(scan.nextInt()) {
            case 1:
                double[] addNumbers = prompt();
                System.out.println(addition(addNumbers[0], addNumbers[1]));
                break;
            case 2:
                double[] subNumbers = prompt();
                System.out.println(subtraction(subNumbers[0], subNumbers[1]));
                break;
            case 3:
                double[] mulNumbers = prompt();
                System.out.println(multiplication(mulNumbers[0], mulNumbers[1]));
                break;
            case 4:
                double[] divNumbers = prompt();
                System.out.println(division(divNumbers[0], divNumbers[1]));
                break;
            case 5:
                double[] modNumbers = prompt();
                System.out.println(modulus(modNumbers[0], modNumbers[1]));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public static double[] prompt() {
        System.out.print("Enter first number: ");
        double numOne = scan.nextDouble();
        System.out.print("\nEnter second number: ");
        double numTwo = scan.nextDouble();
        return new double[]{numOne, numTwo};
    }

    public static String addition(double a, double b) {
        return a + " + " + b + " = " + (a + b);
    }

    public static String subtraction(double a, double b) {
        return a + " - " + b + " = " + (a - b);
    }

    public static String multiplication(double a, double b) {
        return a + " * " + b + " = " + (a * b);
    }

    public static String division(double a, double b) {
        return a + " / " + b + " = " + (a / b);
    }

    public static String modulus(double a, double b) {
        return a + " % " + b + " = " + (a % b);
    }
}
