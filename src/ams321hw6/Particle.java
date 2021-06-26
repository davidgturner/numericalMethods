/**
 * David Turner
 * AMS 321 Project 6
 */

public class Particle {

private double x;
private double y;

    //particle constructor to hold an integer pair
    public Particle(double x, double y)
    {
	x=x;
	y=y;
    }

     public Particle(int x, int y)
    {
	this.x=x;
	this.y=y;
    }

    public double getX()
    {
	return x;
	}

    public double getY()
    {
	return y;
    }

    public void setX(double x)
    {
	this.x=x;
	}

    public void setY(double y)
    {this.y=y;}

    public String toString()
    {
	return "("+ x +"," + y + ")";
    }
}