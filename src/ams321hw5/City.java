/**
David turner
101-50-3291
AMS 321 Homework 5
*/

public class City
{
    /** x coordinate */
    private double x;
    /** y coordinate */
    private double y;
    /** check to see if city is visited */
    private boolean visited=false; 

    public City(double x, double y)
    {
	this.x= x;
	this.y= y;
	visited = false;
    }

    public void setVisited(boolean visit)
    {
	visited = visit;
    }

    public double getX()
    {
	return x;
    }

    public double getY()
    {
	return y;
    }

    /** the distance between one city and another */
    public static double distance(City c1, City c2)
    {
	double x1 = c1.getX();
	double x2 = c2.getX();
	double y1 = c1.getY();
	double y2 = c2.getY();
	double value = Math.pow(x2-x1, 2.0) + Math.pow(y2-y1,2.0);
        return Math.sqrt(value);
    }

    public String toString()
    {
	return "(" + x + "," + y + ")" ; 
    }

    /** prototype main method*/
    public static void main(String[] args)
    {

    }
}
