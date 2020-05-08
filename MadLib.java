import java.util.Scanner;
class MadLib {
 public static Scanner scan = new Scanner(System.in);
 public static String adj1, verb1, adverb1, verb2, noun1, adj2, noun2, verb3, verb4, adverb2, adj3, adj4, adj5, adj6, adj7, noun3, verb5, noun4, adj8, place1, direction1, adverb3, verb6, city, verb7, verb8, verb9, noun5;

 public static void main(String args[]) {
  getInput();
  output();
 }
 public static void getInput() {
  System.out.println("Enter an adjective:");
  adj1 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  verb1 = scan.nextLine();
  System.out.println("Enter an adverb:");
  adverb1 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  verb2 = scan.nextLine();
  System.out.println("Enter a noun:");
  noun1 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  adj2 = scan.nextLine();
  System.out.println("Enter an adjective:");
  noun2 = scan.nextLine();
  System.out.println("Enter a noun:");
  verb3 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ING':");
  verb4 = scan.nextLine();
  System.out.println("Enter an adverb:");
  adverb2 = scan.nextLine();
  System.out.println("Enter an adjective:");
  adj3 = scan.nextLine();
  System.out.println("Enter an adjective:");
  adj4 = scan.nextLine();
  System.out.println("Enter an adjective:");
  adj5 = scan.nextLine();
  System.out.println("Enter an adjective:");
  adj6 = scan.nextLine();
  System.out.println("Enter an adjective:");
  adj7 = scan.nextLine();
  System.out.println("Enter a noun:");
  noun3 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  verb5 = scan.nextLine();
  System.out.println("Enter a noun:");
  noun4 = scan.nextLine();
  System.out.println("Enter an adjective:");
  adj8 = scan.nextLine();
  System.out.println("Enter a place:");
  place1 = scan.nextLine();
  System.out.println("Enter a cardinal direction:");
  direction1 = scan.nextLine();
  System.out.println("Enter an adverb:");
  adverb3 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  verb6 = scan.nextLine();
  System.out.println("Enter a city:");
  city = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  verb7 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  verb8 = scan.nextLine();
  System.out.println("Enter a verb ending in 'ED':");
  verb9 = scan.nextLine();
  System.out.println("Enter a noun:");
  noun5 = scan.nextLine();
 }
 public static void output() {
  System.out.print("My " + adj1 + " day started when I " + verb1 +
   " up late for work. I " + adverb1 + " " + verb2 +
   " out the " + noun1 + ". I into " + adj2 +
   " traffic. The cars were " + noun2 + " to " + noun2 +
   "." + " People were " + verb3 + " and " + verb4 +
   " at each other to go faster. When I " + adverb2 +
   " made it to work, my " + adj3 + ", " + adj4 + ", " +
   adj5 + ", " + adj6 +
   " boss told me if I was late one more time I was fired. If that wasn't bad enough, the " +
   adj7 + " " + noun3 + " " + verb5 + ". After " + noun4 +
   ", I headed towards the " + adj8 + " little " + place1 +
   " in the " + direction1 + "-end of " + city + ". The " +
   direction1 + " was " + adverb3 + " empty. I " + verb6 +
   " on the swings and " + verb7 +
   " high into the air. I " + verb8 +
   " off of the swing and " + verb9 +
   " up. It was all just a " + noun5 + ".");
 }
}
