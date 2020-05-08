import java.util.Scanner;
class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
            System.out.print("SS# ");
            String social = scan.nextLine();
            System.out.println(new socialSecurity(social).toString());
     }
}
