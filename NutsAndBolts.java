import java.util.Scanner;
public class nutsAndBolts {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        apples();
        applesTwo();
        votingAge();
        triangleType();
        rockPaperScissors();
        nutsAndBolts();
    }

    public static void apples() {
        System.out.print("Number of Apples: ");
        int apples = scan.nextInt();
        if(apples > -1) System.out.println("\nHello World!");
    }

    public static void applesTwo() {
        System.out.print("Number of apples: ");
        int apples = scan.nextInt();
        if(apples % 2 == 0) System.out.println("Omg it's even!");
        else System.out.println("Hmm... That's odd.");
    }

    public static void votingAge() {
        int votingAge = 18;
        System.out.print("Enter your age: ");
        if(scan.nextInt() >= 18) System.out.println("You can vote.");
        else System.out.println("You can't vote.");
    }

    public static void triangleType() {
        System.out.print("Enter first angle: ");
        double angleOne = scan.nextDouble();
        System.out.print("Enter second angle: ");
        double angleTwo = scan.nextDouble();
        System.out.print("Enter third angle: ");
        double angleThree = scan.nextDouble();
        if(angleOne == angleTwo || angleOne == angleThree || angleTwo == angleThree) {
            System.out.println("Isosceles");
        } else if(angleOne == angleTwo && angleTwo == angleThree) {
            System.out.println("Equilateral");
        } else {
            System.out.println("Scalene");
        }
    }

    public static void rockPaperScissors() {
        System.out.print("Player 1: choose 1 for paper, 2 for rock, or 3 for scissors: ");
        int playerOne = scan.nextInt();
        System.out.print("Player 2: choose 1 for paper, 2 for rock, or 3 for scissors: ");
        int playerTwo = scan.nextInt();
        if(playerOne == 1 && playerTwo == 2) {
            System.out.println("Player 1 wins! Paper covers rock.");
        } else if(playerOne == 2 && playerTwo == 3) {
            System.out.println("Player 1 wins! Rock beats scissors.");
        } else if(playerOne == 3 && playerTwo == 1) {
            System.out.println("Player 1 wins! Scissors cut paper");
        } else if(playerTwo == 1 && playerOne == 2) {
            System.out.println("Player 2 wins! Paper covers rock.");
        } else if(playerTwo == 2 && playerOne == 3) {
            System.out.println("Player 2 wins! Rock beats scissors.");
        } else if(playerTwo == 3 && playerOne == 1) {
            System.out.println("Player 2 wins! Scissors cut paper");
        } else {
            System.out.println("Invalid option.");
        }
    }
//at least as many nuts as bolts
//at least twice as many washers as bolts
    public static void nutsAndBolts() {
        // collect user input
        System.out.print("Nuts: ");
        int nuts = scan.nextInt();
        System.out.print("Bolts: ");
        int bolts = scan.nextInt();
        System.out.print("Washers: ");
        int washers = scan.nextInt();
        // check if there are at least as many nuts as bolts & twice as many washers as bolts
        if(!(nuts >= bolts && 2*washers >= bolts)) System.out.println("\nToo few washers or nuts.");
        // calculate prices
        double nutsPrice = nuts * 0.03;
        double boltsPrice = bolts * 0.05;
        double washersPrice = washers * 0.01;
        // output total price
        System.out.println("\nTotal Price: $" + (nutsPrice + boltsPrice + washersPrice));
    }
}
