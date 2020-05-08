import java.util.Scanner;
class RoadTrip {
  public static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    // problem 1
    System.out.println(problemOne() + "\n");
    // problem 2
    System.out.println(problemTwo() + "\n");
    // problem 3
    System.out.println(problemThree() + "\n");
    // problem 4
    System.out.println(problemFour() + "\n");
    // problem 5
    System.out.println(problemFive() + "\n");
    // problem 6
    System.out.println(problemSix() + "\n");
    // problem 7
    System.out.println(problemSeven() + "\n");
    // problem 8
    System.out.println(problemEight() + "\n");
    // road trip calculator
    String[] roadTrip = roadTripCalculator();
    // gallons
    System.out.println(roadTrip[0] + "\n");
    // cost
    System.out.println(roadTrip[1] + "\n");
    // stops
    System.out.println(roadTrip[2] + "\n");
    // duration
    System.out.println(roadTrip[3] + "\n");
  }
  
  public static String problemOne() {
    System.out.println("Enter an integer: ");
    int num1 = scan.nextInt();
    return num1 + " + 10 is: "+ (num1 + 10);
  }
  
  public static String problemTwo() {
    scan.nextLine();
    System.out.println("Enter your name: ");
    String name1 = scan.nextLine();
    return "Hello, " + name1 + "!";
  }
  
  public static String problemThree() {
    System.out.println("Enter a decimal: ");
    double something = scan.nextDouble();
    return something + " squared is: " + Math.pow(something, 2);
  }
  
  public static String problemFour() {
    scan.nextLine();
    System.out.println("What belongs to you, but other people use it more than you do?");
    String riddle = scan.nextLine();
    if(riddle.equals("your name")) {
      return "You got it right! The answer was 'your name'.";
    } else {
      return "You got it wrong... The answer was 'your name'.";
    }
  }
  
  public static String problemFive() {
    System.out.println("Enter your name: ");
    String name2 = scan.nextLine();
    System.out.println("Enter your age: ");
    int age = scan.nextInt();
    return name2 + " is " + age + " years old.";
  }
  
  public static String problemSix() {
    double pi = 3.14159;
    System.out.println("Enter the radius of a circle: ");
    double radius = scan.nextDouble();
    return "The area of your circle is: " + pi * Math.pow(radius, 2);
  }
  
  public static String problemSeven() {
    System.out.println("Enter seconds of free fall: ");
    double time = scan.nextDouble();
    return "Distance traveled: " + 32.174 * Math.pow(time, 2);
  }
  
  public static String problemEight() {
    scan.nextLine();
    System.out.println("Enter your name: ");
    String name1 = scan.nextLine();
    return name1 + name1 + name1;
  }
  
  public static String[] roadTripCalculator() {
    // collect inputs
    System.out.println("Enter vehicle mileage in miles per gallon: ");
    double mpg = scan.nextDouble();
    System.out.println("Enter the driving distance on your trip: ");
    double distance = scan.nextDouble();
    System.out.println("Enter your average speed: ");
    double speed = scan.nextDouble();
    System.out.println("Enter your fuel tank capacity: ");
    double tank = scan.nextDouble();
    System.out.println("Enter the average fuel price: ");
    double gasPrice = scan.nextDouble();
    // calculations
    double gallons = Math.round(distance / mpg * 100.0) / 100.0;
    double gasCost = Math.round(gallons * gasPrice * 100.0) / 100.0;
    double stops = Math.round(gallons / tank);
    double hours = Math.round(distance / speed * 100.0) / 100.0;
    // user friendly outputs
    String gas = "Gallons of gas used: " + gallons;
    String price = "Total cost of gas: " + gasCost;
    String gasStops = "Minimum number of stops: " + stops;
    String duration = "Hours spent driving: " + hours;
    String[] out = {gas, price, gasStops, duration};
    return out;
  }
}
