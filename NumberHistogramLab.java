import java.util.Random;
public class NumberHistrogram {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 8, 16, 2, 3, 5, 9, 0, 9, 6}; // problem 1
        System.out.println(nums[0]); // problem 2
        System.out.println(nums[1]); // problem 3
        System.out.println(nums[3]); // problem 4
        System.out.println(nums[nums.length - 1]); // problem 5
        System.out.println(nums.length); // problem 6
        System.out.println("I already did that.");// problem 7
        // Riddle // problem 8
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println(); // problem 9
        System.out.println(nums[0] == 6 || nums[nums.length - 1] == 6); // problem 10
        for(int num : nums) {
            if (num > 10) {
                System.out.println("Above ten.");
                break;
            }
        } // problem 11
        for(int num : nums) {
            if(num == 6) {
                System.out.println("Found a six!");
                break;
            }
        } // problem 12
        boolean above8 = false;
        boolean below2 = false;
        for(int num: nums) {
            if(num > 8) {
                above8 = true;
            }
            if(num < 2) {
                below2 = true;
            }
        }
        if(above8 && below2) {
            System.out.println("Not within 2-8");
        } else {
            System.out.println("Within 2-8");
        } // problem 13
        HistogramApp();
    }
    public static void HistogramApp() {
        Random randomGen = new Random();
        int[] data = new int[25];
        int[] histogram = new int[10];
        for(int i = 0; i < data.length; i++) {
            int num = randomGen.nextInt(10);
            data[i] = num;
            histogram[num] += 1;
        }
        for(int j = 0; j < histogram.length; j++) {
            System.out.println(j + " - occurred " + histogram[j] + " times.");
        }
    }
}
