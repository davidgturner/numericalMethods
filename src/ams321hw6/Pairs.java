/**
 * David Turner
 * 101-50-3291
 * AMS 321 Project 6
 */

import java.util.*;

public class Pairs {

//number of particles
private double particles;

    //does everything to get the integer pairs of particles and stores in vector
    public Vector getPairs()
    {
	Vector vc = new Vector();
	int count=0;
	for (int i=0;i<20;i++ )
	{
	    for (int j=0;j<20;j++)
	    {
		if(((i*i) + (j*j)) <=100)
		{
		    Particle p = new Particle(i,j);
		    vc.add(p);
		    count++;
		}
	    }

	}
    particles = count;
    return vc;
    }

    //returns the number of particles after adding the delta
    public int change(Vector vec, double b1, double b2)
    {
	int count=0;
	double delta = 0.0;


	//scans through every particle
	for (int i=0;i<vec.size();i++)
	 {
	    delta= b1 + Math.random()%b2;
	     Particle part = (Particle)vec.elementAt(i);
	     System.out.println(part.getX());
	      System.out.println(part.getY());
	    double newX = delta+part.getX();
	    double newY = delta+part.getY();
	    System.out.println(newX);
	     System.out.println(newY);
	    part.setX(newX);
	    part.setY(newY);

	    if((part.getX()*part.getX()) + (part.getY()*part.getY()) <= 100.0)
		count++;
	}
	 System.out.println("count " + count);
	return count;
    }

    /** a method to change the particle value */
     public void change(Particle part, double b1, double b2)
    {
	double delta= b1 + Math.random()%b2;
        double newX = delta+part.getX();
        double newY = delta+part.getY();
	part.setX(newX);
	part.setY(newY);
    }


    //returns number of particles (integer pairs)
    public double numParticles()
    {
	return particles;
    }

    public static void main(String[] args) {
        Pairs pairs1 = new Pairs();
	//gets all integers pairs, stores in a vector and prints to screen
	Vector v1 = pairs1.getPairs();
	Vector v2 = (Vector)v1.clone();
	System.out.println("Number of particles: " + pairs1.numParticles());

	int a=0,b=0;

	/** change by -0.1<delta<0.1 */
	for (int i=0;i<v1.size();i++) {
	    Particle part = (Particle)v1.elementAt(i);
	    pairs1.change(part,-0.1,0.2);
	    if((part.getX()*part.getX()) + (part.getY()*part.getY()) <= 100.0)
	    a++;
	}
	System.out.println("Number of particles after -.1<delta<.1: " + a);


	/** change by -0.5<delta<0.5 on the clone*/
	for (int i=0;i<v2.size();i++) {
	    Particle part = (Particle)v2.elementAt(i);
	    pairs1.change(part,-0.5,1.0);
	    if((part.getX()*part.getX()) + (part.getY()*part.getY()) <= 100.0)
	    b++;
	}
	System.out.println("Number of particles after -.5<delta<.5: " + b);

    }
}