/*
ASSIGNMENT
This activity is due on January 22, 2021 and you submitted it on Jan. 22, 2021, 7:18 a.m.
Current Grade: 5.0 out of 5 Status: Finalized
Racecar
Most of the Racecar class has been completed for you, but you will need to complete the computeTime method.

computeTime – takes one parameter, a double, which is the length of the course. Returns how long it will take the racecar to complete the course in seconds, rounded to two decimal places. See the explanation below for instructions on how to compute the time.



Main Method
In main, you should create two Racecar objects to represent two cars on the race track. Compute how long each car takes to complete the race. Print out each car’s time. There are comments in main to help you with the algorithm.

For the Racecar objects, make up a driver’s name for each car. Use Math.random to randomly choose each car’s acceleration. The acceleration should be greater than one. You can use a combination of Math.random and Math.round, or use the equation given in the slides. To make the minimum value 1 using the equation, just add 1 to the final answer.



Computing the finishing time
From physics, the kinematic equations tell us that

d = v0 * t + 0.5*a*t2

where d is distance in meters, v0 is the starting velocity in m/s, t is the time in seconds, and a is acceleration in m/s2.

Since the car starts from rest, v0 = 0. This means that

t = √(2*d/a)

The value of t will generally be a number with a long decimal value. Make sure to use Math.round to round the value of t to the second decimal place.


Example Output
First car finished in 262.62 seconds
Second car finished in 120.96 seconds
*/
public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double time = Math.sqrt(2*distance/accel);
        double rounded = Math.round(time * 100) / 100.0;
        return rounded;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}

public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double accel1 = Math.random();
        double accel2 = Math.random();
        
        // Create two Racecar objects
        Racecar car1 = new Racecar(accel1, "John");
        Racecar car2 = new Racecar(accel2, "Jane");
        
        // Compute the finishing times for both cars
        double time1 = car1.computeTime(distance);
        double time2 = car2.computeTime(distance);
        
        // Print times of each car
        System.out.println("First car finished in " + time1 + " seconds");
        System.out.println("Second car finished in " + time2 + " seconds");

    }
}
