public class BigMacWalk {
   public static int apples, oranges, a, b, c, miles, gallons, mpg;
   public static String day;
   public static double pi, length, width, base, height, numBigMacs, calsPerMile, bigMacCal, fryCal, drinkCal, totalCal;

   public static void main(String[] args) {
       // apples & oranges
       applesOranges();
       // pi
       printPi();
       // day of week
       dayOfWeek();
       // subtraction
       subtraction();
       // miles per gallon
       milesPerGallon();
       // area of rectangle
       rectangleArea();
       /* area of triangle */
       triangleArea();
       /* big mac walk app */
       bigMacWalk();
   }

   public static void applesOranges() {
       apples = 12;
       oranges = 24;
       System.out.println("You have this many apples: " + apples);
       System.out.println("You have this many oranges: " + oranges + "\n");
   }

   public static void printPi() {
       pi = 3.14519;
       System.out.println("Pi is equal to: " + pi + "\n");
   }

   public static void dayOfWeek() {
       day = "Tuesday";
       System.out.println("Hello! Today is: " + day + "\n");
   }

   public static void subtraction() {
       a = 10;
       b = 20;
       c = (b-a);
       System.out.println("b minus a equals: " + c + "\n");
   }

   public static void milesPerGallon() {
       miles = 192;
       gallons = 16;
       mpg = (miles/gallons);
       System.out.println(mpg + " miles per gallon" + "\n");
   }

   public static void rectangleArea() {
       length = 12.75;
       width = 8.65;
       System.out.println("Rectangle Area: " + (length * width) + "\n");
   }

   public static void triangleArea() {
       base = 11.89;
       height = 22.4;
       System.out.println("Triangle Area: " + (0.5 * (base * height)) + "\n");
   }

   public static void bigMacWalk() {
       // define variables
       calsPerMile = 94;
       numBigMacs = 4;
       bigMacCal = numBigMacs * 590;
       // output information
       System.out.println("Big Macs eaten >>> " + numBigMacs);
       System.out.println("Total calories consumed >>> " + bigMacCal);
       System.out.println("Miles to walk to burn off all those Big Macs >>> " + Math.round((bigMacCal / calsPerMile) * 100.0) / 100.0);
       // information with fries + drink
       System.out.println("\nWith Fries & Drink:");
       // define variables
       fryCal = 365;
       drinkCal = 250;
       totalCal = bigMacCal + fryCal + drinkCal;
       // output information
       System.out.println("Total calories consumed >>> " + totalCal);
       System.out.println("Miles to walk to burn off all that chow >>> " + Math.round((totalCal / calsPerMile) * 100.0) / 100.0);

   }
}
