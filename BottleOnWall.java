import java.util.Scanner;
public class BottleOnWall {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // problem 2
        int i = 1;
        while(i < 10) {
            System.out.print(i);
            i++;
        }
        System.out.println();
        // problem 3
        i = 1;
        while(i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // problem 4
        i = 1;
        while(i < 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
        // problem 5
        i = 5;
        while(i <= 50) {
            System.out.print(i + " ");
            i += 5;
        }
        System.out.println();
        // problem 6
        i = 10;
        while(i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        // problem 7
        // riddle
        // problem 8
        i = -4;
        while(i >= -40) {
            System.out.print(i + " ");
            i -= 4;
        }
        System.out.println();
        // problem 9
        i = 1;
        while(i <= 256) {
            System.out.print(i + " ");
            i *= 2;
        }
        System.out.println();
        // problem 10
        i = 1000;
        while(i > 2) {
            System.out.print(i + " ");
            i /= 2;
        }
        System.out.println();
        // problem 11
        i = 1;
        while(i < 9) {
            System.out.print(i + " ");
            System.out.print("-" + i + " ");
            i +=1;
        }
        System.out.println();
        // bottles app
        System.out.print("Age: ");
        int age = scan.nextInt();
        String drink;
        if(age >= 21) {
            drink = "beer";
        } else {
            drink = "coke";
        }
        i = 99;
        while(i > 0) {
            System.out.println(i + " bottles of " + drink + " on the wall.");
            System.out.println(i + " bottles of " + drink + ".");
            System.out.println("Take it down, pass it around, " + (i-1) + "more bottles of " + drink + " on the wall.");
            System.out.println("");
            i--;
        }
    }
}
