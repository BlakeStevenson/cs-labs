import java.util.Scanner;
class InputPractice {
  public static Scanner scan = new Scanner(System.in);
  public static int int1, int2;
  public static double double1, double2;
  public static float float1, float2;
  public static short short1, short2;
  public static boolean bool1, bool2;
  public static String sentence1, sentence2, word1, word2;
  public static String[] words;
  public static void main(String[] args) {
    // input integers
    inputInt();
    // input doubles
    inputDouble();
    // input floats
    inputFloat();
    // input shorts
    inputShort();
    // input booleans
    inputBool();
    // input sentence
    inputSentence();
    // input two words
    inputWords();
    // output all
    outputAll();
  }
  public static void inputInt() {
    System.out.println("Enter an integer: ");
    int1 = scan.nextInt();  // Read user input
    System.out.println("Enter another integer: ");
    int2 = scan.nextInt();
  }
  public static void inputDouble() {
    System.out.println("Enter a double: ");
    double1 = scan.nextDouble();  // Read user input
    System.out.println("Enter another double: ");
    double2 = scan.nextDouble();
  }
  public static void inputFloat() {
    System.out.println("Enter a float: ");
    float1 = scan.nextFloat();  // Read user input
    System.out.println("Enter another float: ");
    float2 = scan.nextFloat();
  }
  public static void inputShort() {
    System.out.println("Enter a short: ");
    short1 = scan.nextShort();  // Read user input
    System.out.println("Enter another short: ");
    short2 = scan.nextShort();
  }
  public static void inputBool() {
    System.out.println("Enter a Boolean: ");
    bool1 = scan.nextBoolean();  // Read user input
    System.out.println("Enter another Boolean: ");
    bool2 = scan.nextBoolean();
  }
  public static void inputSentence() {
    scan.nextLine();
    System.out.println("Enter a sentence: ");
    sentence1 = scan.nextLine();
    System.out.println("Enter another sentence: ");
    sentence2 = scan.nextLine();
  }
  public static void inputWords() {
    System.out.println("Enter two words: ");
    words = scan.nextLine().split(" ");
    word1 = words[0];
    word2 = words[1];
  }
  public static void outputAll() {
    System.out.println("\n");
    System.out.println("Integer One: " + int1);
    System.out.println("Integer Two: " + int2 + "\n");
    System.out.println("Double One: " + double1);
    System.out.println("Double Two: " + double2 + "\n");
    System.out.println("Float One: " + float1);
    System.out.println("Float Two: " + float2 + "\n");
    System.out.println("Short One: " + short1);
    System.out.println("Short Two: " + short2 + "\n");
    System.out.println("Boolean One: " + bool1);
    System.out.println("Boolean Two: " + bool2 + "\n");
    System.out.println("Sentence One: " + sentence1);
    System.out.println("Sentence Two: " + sentence2 + "\n");
    System.out.println("Word One: " + word1);
    System.out.println("Word Two: " + word2);
  }
}
