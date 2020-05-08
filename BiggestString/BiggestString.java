public class BiggestString {
    public static String getBiggest(String[] strings) {

        // get array of lengths of strings
        int[] stringLengths = new int[strings.length];
        for(int i = 0; i < strings.length; i++) {
            stringLengths[i] = strings[i].length();
        }

        // get index of largest value
        int largest = 0;
        for (int j = 1; j < stringLengths.length; j++) {
            if (stringLengths[j] > stringLengths[largest]) largest = j;
        }

        // return largest string by index
        return strings[largest];
    }
}
