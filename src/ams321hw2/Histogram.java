import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.text.*;

public class Histogram extends JFrame
{

    private int WINDOW_WIDTH = 600;
    private int WINDOW_HEIGHT= 400;
    private Color c;
    private int[] data;

    public Histogram(int[] data)
    {
	setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
	c= Color.red;
	repaint();
	this.data = data;
    }

    //converts the y value to pixels
    public double convertToPix(int y)
    {
	double value2 = (double)(WINDOW_HEIGHT) / (double)(data.length);
	double value = value2 * y;
	return value;
    }

    public void paint(Graphics g)
    {
System.out.println(convertToPix(500000));
	int count=0;
	String[] inter = new String[21];
	int offset=10;
	Graphics2D g2 = (Graphics2D)g;
	


	for(double d=-1.0;d<1.0;d=d+.1)
	    {
		String strange = "0.#";
		DecimalFormat weirdFormatter =  new DecimalFormat(strange);
		String bizarre = weirdFormatter.format(d);
		inter[count]=bizarre;
		System.out.println(inter[count]);
		count++;
	    }

	int count2=0;

	//draw on the screen and print to system
	for(int i=10;i<=WINDOW_WIDTH;i+=WINDOW_WIDTH/21)
	    {
		g.drawString(inter[count2],i,WINDOW_HEIGHT-20);
		g.drawLine(i,WINDOW_HEIGHT-20,i,(int)(WINDOW_HEIGHT - convertToPix(data[count2])));
		count2++;	
	    }

    }


    public static void main(String[] args)
    {
	int[] ere = new int[1000000];
	ere[0]= 500000;
	ere[1] = 120000;
	Histogram h = new Histogram(ere);
	//double f = (double)(800.0 / 1000000.0);
	//System.out.println(f);
	h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	h.show(); 
    }
}
