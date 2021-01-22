/*
ASSIGNMENT
This activity is due on January 22, 2021 and you submitted it on Jan. 22, 2021, 6:55 a.m.
Current Grade: 5.0 out of 5 Status: Finalized
Fill in the Currency class using the method comments as a guide.

For getDollars and getCents, you can isolate the dollar part by rounding the Double to an Integer. To do that, get the double value using doubleValue and cast the result to an integer. (You can refer to this previous example: https://codehs.com/editor/1720238/?/8802/6165).

There are several ways to get the cents, but you need to be careful not to get a double rounding error. The safest way is to multiply the orginal value by 100, then cast to an integer and then use a mod 100 function:
cents = (int)(value * 100) % 100

When you run main, you should get

Value of bankroll: $12.45
Dollars: 12
Cents: 45
Value of bankroll: $20.56
Dollars: 20
Cents: 56
Value of bankroll: $67.78
Dollars: 67
Cents: 78
*/
public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        String str = "" + value;
        int dollars = Integer.parseInt(str.substring(0, str.indexOf(".")));
        return new Integer(dollars);
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        return new Integer((int)(value * 100) % 100); 
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$" + getDollars() + "." + getCents();
    }
}
