import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Points extends JFrame
{
    private int size;
    private int radius;
    private RandomPoints rp;
    private int num;
    private double height;
    private double width;

    /** points that lie inside the disk */
    private int ni;
    public Points(int num)
    {
	width = 500.0;
	height = 500.0;
	setSize((int)width,(int)height);
	rp = new RandomPoints(num);
	this.num=num;	
    }

    public void paint(Graphics g)
    {
	g.drawRect(0,10,(int)width,(int)height);	
	g.drawOval(0,10,(int)width,(int)height);	
	g.setColor(Color.red);
	float[] x = rp.getX();
	float[] y = rp.getY();
	for(int i=0;i<num;i++)
	    {
		g.fillOval(convert(x[i]),convert(y[i]),1,1);
		if(Math.pow(x[i],2.0) + Math.pow(y[i],2.0) <= 1.0)
		    ni++;
	    }
	//multiply ni by 4 to take into account all 4 quadrants
	ni*= 4;
	g.setColor(Color.black);	
	g.drawOval(0,10,(int)width,(int)height);
	System.out.println("Total Points: " + num);
	System.out.println("Points inside the disk: " + ni);
	System.out.println("Computing of 4*Ni/N: " + compute(ni,num) );
    }

   

    /** computes 4*Ni/N */
    public double compute(int ni, int n)
    {
	return (double)(4.0 * ((double)ni/(double)n));
    }

    //convert a point
    public int convert(double p)
	{
	    return (int)((width/2.0) * p);
	}
    public static void main(String[] args)
    {
	Points p = new Points(1000000);
	p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p.show();
	p.dispose();
	System.gc();
	System.exit(0);
	
    }

}
