
/** program that uses the 4th order Runge Kutta algorithm
to solve the initial value problem of:
y'=(t-y)/2
y(0)=1
*/ 
public class RungeKutta
{

//the function we are trying to solve
public static double f(double t, double y)
{
return (t-y)/2.0;
}

//method put in to check my answer
public static double y(double t)
{

return (t - 2.0 + 3*Math.exp(-t/2.0));
}

public static void rungeKutta(double h)
{
    System.out.println("for step size of:" + h);
    double y=1.0;
    double t=0.0;
    //iterations compute the number of iterations that should be done
    double iterations = h*4.0;
    double k1,k2,k3,k4;
    k1=0.0;k2=0.0;k3=0.0;k4=0.0;

    //n is equal to the number of iterations
    int n=0;
    while(t<4.0)
	{
	    k1=h*f(t,y);
	    k2=h*f(t+(h/2.0), y+(k1/2.0));
	    k3=h*f(t+(h/2.0),y+(k2/2.0));
	    k4=h*f(t+h,y+k3);
	    y= y+ ((k1 + (2.0*k2) + (2.0*k3) + k4)/6.0);
	    t=t+h;
	    System.out.println("n:" + n + " t:" + t + " y:"+ y);
	    n++;
	}

    System.out.println();
}

public static void main(String[] args)
{
    //computes runge kutta by inputting h
    rungeKutta(1.0/3.0);
    rungeKutta(1.0/6.0);
    rungeKutta(1.0/12.0);
}

}
