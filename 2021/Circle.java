/*
ASSIGNMENT
This activity is due on January 22, 2021 and you submitted it on Jan. 22, 2021, 7:02 a.m.
Current Grade: 5.0 out of 5 Status: Finalized
Here is a Circle class.

Implement getArea and getCircumference by using methods from the Math class.
*/
public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    
    // Implement getCircumference using
    // Math.PI
    // Circumference = 2 * PI * r
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    
}

