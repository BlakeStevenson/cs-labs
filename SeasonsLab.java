import java.util.Scanner;
public class SeasonsLab {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // problem 1
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if(num1 > num2) System.out.println(num1); else if(num2 > num1) System.out.println(num2); else System.out.println("Same");
        // problem 2
        System.out.println("Enter total Bill");
        double totalBill = scan.nextDouble();
        if(totalBill > 1000.0 && totalBill < 2000.0) System.out.println("Total: $" + 0.9 * totalBill); else if(totalBill > 2000.0) System.out.println("Total: $" + 0.85 * totalBill);
        // problem 3
        System.out.println("Enter a boolean");
        boolean hasCoupon = scan.nextBoolean();
        if(hasCoupon) System.out.println("With Coupon: " + totalBill * 0.95);
        // problem 4
        System.out.println("What can you catch but not throw? A cold.");
        // problem 5
        System.out.println("Enter a year");
        int year = scan.nextInt();
        boolean leap = false;
        if(year % 4 == 0)  {
            if( year % 100 == 0) {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0) leap = true; else leap = false;
            } else leap = true;
        } else leap = false;
        if(leap) System.out.println(year + " is a leap year."); else System.out.println(year + " is not a leap year.");
        // seasons app
        System.out.print("Month: ");
        int month = scan.nextInt();
        System.out.println("Day:");
        int day = scan.nextInt();
        if ((month == 1) || (month == 2)) System.out.println("The season is Winter");
        else if ((month == 4) || (month == 5)) System.out.println("The season is Spring");
        else if ((month == 7) || (month == 8)) System.out.println("The season is Summer");
        else if ((month == 10)|| (month == 11)) System.out.println("The season is Fall");
        else if ((month == 3) && (day <= 15)) System.out.println("The season is Winter");
        else if ((month == 3) && (day >= 20)) System.out.println("The season is Spring");
        else if ((month == 6) && (day <= 20)) System.out.println("The season is Spring");
        else if (month == 6) System.out.println("The season is Summer");
        else if ((month == 9) && (day <= 20)) System.out.println("The season is Summer");
        else if (month == 9) System.out.println("The season is Autumn");
        else if ((month == 12) && (day <= 21)) System.out.println("The season is Autumn");
        else if (month == 12) System.out.println("The season is Winter");
        else System.out.println("Invalid input.");
    }
}
