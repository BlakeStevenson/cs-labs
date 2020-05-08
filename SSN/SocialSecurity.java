public class socialSecurity {
    private String socialNum;
    private int sum;

    public socialSecurity(String ssn) { socialNum = ssn; }

    public void getTotal() {
        // split ssn into array of strings using .split
        String[] strArray = socialNum.split("-");

        // initialize a new array of integers with length of stringArray
        int[] intArray = new int[strArray.length];

        // for every item in stringArray, parse the string into an integer & add to integer array
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        // add all numbers in intArray together and store total
        int total = 0;
        for (int number : intArray) {
            total += number;
        }

        // set sum to total
        sum = total;
    }

    public String toString() {
        // get total of SSN segments
        getTotal();

        // return a friendly message to output to the user.
        return "SS# " + socialNum + " has a total of " + sum;
    }
}
