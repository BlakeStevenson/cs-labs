/*
ASSIGNMENT
This activity is due on January 22, 2021 and you submitted it on Jan. 22, 2021, 7:11 a.m.
Current Grade: 5.0 out of 5 Status: Finalized
In this program we are going to practice using the Math class by computing some important values on the unit circle. Using the angles 0, PI/2, and PI, print out the angle, the cosine of the angle, and the sine of the angle.

Your output should look like this:

Radians: (cos, sin)
0.0: 1.0, 0.0
1.5707963267948966: 0.0, 1.0
3.141592653589793: -1.0, 0.0
Hints:

You’ll need to use the Math.sin, Math.cos methods
and the Math.PI constant!
You can round a decimal to 2 decimal places by multiplying by 100, rounding to the nearest int using Math.round, and then dividing by 100. You will need to round the sine and cosine values. Here’s an example:
double angle = Math.PI/4;
double cosine = Math.cos(angle); // 0.707106781
cosine = cosine * 100;       // 70.7106781
cosine = Math.round(cosine);  // 71.0
cosine = cosine / 100.0;     // 0.71

// Or put it all on one line:
cosine = Math.round(cosine * 100) / 100.0;


Some Math Background
The Java methods need the angles to be in radians, rather than degrees. PI/2 radians is equal to 90 degrees. PI radians is equal to 180 degrees.
That’s why we’re using multiples of PI in this exercise.
*/
public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        double angle1 = 0.0;
        double angle2 = Math.PI / 2;
        double angle3 = Math.PI;
        
        System.out.println(angle1 + ": " + round(Math.cos(angle1)) + ", " + round(Math.sin(angle1)));
        System.out.println(angle2 + ": " + round(Math.cos(angle2)) + ", " + round(Math.sin(angle2)));
        System.out.println(angle3 + ": " + round(Math.cos(angle3)) + ", " + round(Math.sin(angle3)));
    }
    public static double round(double num) {
        return Math.round(num * 100)/100.0;   
    }
}
