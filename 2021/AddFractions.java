/*
In this program you will initialize 4 integers that represent each part of two fractions, namely the numerator and denominator of the first fraction and the numerator and denominator of the second fraction.

Your program should add the two fractions and print out the result.

For example, a sample program run might look like this

The numerator of the first fraction is 1
The denominator of the first fraction is 2
The numerator of the second fraction is 2
The denominator of the second fraction is 5
The sum of 1/2 + 2/5 = 9/10
Note: you do not need to reduce these fractions. Be sure to test your code for postive and negative integers by changing the values of your initialized variables.

Remember, if you have two fractions you add them with:

     a         c        ad + bc
    ___   +   ___    =   ______
     b         d           bd
*/
public class AddFractions
{
    public static void main(String[] args)
    {
        int num1 = 1;
        int den1 = 2;
        int num2 = 2;
        int den2 = 5;
        System.out.println("The numerator of the first fraction is 1\n" +
                "The denominator of the first fraction is 2\n" +
                "The numerator of the second fraction is 2\n" +
                "The denominator of the second fraction is 5");
        int[] result = addFraction(num1, den1, num2, den2);
        System.out.println("The sum of " + num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + result[0] + "/" + result[1]);
    }
    public static int[] addFraction(int num1, int den1, int num2, int den2) {
        int numerator = (num1 * den2) + (den1 * num2);
        int denominator = den1 * den2;
        return new int[]{numerator, denominator};
    }
}
