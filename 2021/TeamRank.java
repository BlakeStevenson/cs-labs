/*
Football Rankings
The football season is here, and the standings are out! Unfortunately, the weekend’s games have shuffled all the teams around.

If you run the starter code now, you will get the variables in the original order. Your task is to switch the teams around and get them in the new order. You should do this by switching variable values, not just retyping the names.

Remember, a variable can only hold one value, so you will need to use a temp variable to help make the switch. For example, if we wanted to switch team1 and team2, we would swap values like this:

// Swapping values
team1 = "A";
team2 = "OSU";

String temp = team2; // team1 = "A", team2 = "OSU", temp = "OSU" 
team2 = team1;       // team1 = "A", team2 = "A", temp = "OSU" 
team1 = temp;        // team1 = "OSU", team2 = "A", temp = "OSU"
Original order:
1. Alabama
2. Ohio State
3. Florida State
4. USC
5. Clemson
6. Penn State
7. Oklahoma
8. Maryland
9. Wisconsin
10. Michigan

New Order/Sample Output:

1. Alabama
2. Penn State
3. Maryland
4. Michigan
5. USC
6. Clemson
7. Oklahoma
8. Wisconsin
9. Florida State
10. Ohio State
*/

public class TeamRanks
{
    public static void main(String[] args) {
        String team1 = "Alabama"; // 1
        String team2 = "Ohio State"; // 10
        String team3 = "Florida State"; // 9
        String team4 = "USC"; // 5
        String team5 = "Clemson"; // 6
        String team6 = "Penn State"; // 2
        String team7 = "Oklahoma"; // 7
        String team8 = "Maryland"; // 3
        String team9 = "Wisconsin"; // 8
        String team10 = "Michigan"; // 4
        /*
         * Don't edit above this line.
         * Enter your code below this comment.
         */
        String[] arr = {team1, team6, team8, team10, team4, team5, team7, team9, team3, team2};
        team1 = arr[0];
        team2 = arr[1];
        team3 = arr[2];
        team4 = arr[3];
        team5 = arr[4];
        team6 = arr[5];
        team7 = arr[6];
        team8 = arr[7];
        team9 = arr[8];
        team10 = arr[9];

        /*
         * Don't edit below this line.
         * Enter your code above this comment.
         */

        System.out.print("1. ");
        System.out.println(team1);
        System.out.print("2. ");
        System.out.println(team2);
        System.out.print("3. ");
        System.out.println(team3);
        System.out.print("4. ");
        System.out.println(team4);
        System.out.print("5. ");
        System.out.println(team5);
        System.out.print("6. ");
        System.out.println(team6);
        System.out.print("7. ");
        System.out.println(team7);
        System.out.print("8. ");
        System.out.println(team8);
        System.out.print("9. ");
        System.out.println(team9);
        System.out.print("10. ");
        System.out.println(team10);
    }
}
