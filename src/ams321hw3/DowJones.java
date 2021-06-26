public class DowJones
{

/**
Dow Jones daily closing index for the trading days in the months of 
August and September of 2002
I got my historical price data from the following URL at Yahoo Finance:
Part 2. Exact URL : http://table.finance.yahoo.com/k?s=^dji&g=d
*/
private double[] closing; 

    public DowJones()
    {
	//closing[0] is August 1 2002
	closing = new double[42];
	closing[0]= 8506.60;//August 1  1
	closing[1]= 8313.10; //August 2
	closing[2]= 8043.60;//August 5
	closing[3]= 8274.10;//August 6
	closing[4]= 8456.20;//August 7
	closing[5]= 8712.00;//August 8
	closing[6]= 8745.50;//August 9
	closing[7]= 8688.90;//August 12
	closing[8]= 8482.40; //August 13
	closing[9]= 8743.30;//August 14 10
	closing[10]= 8818.10;//August 15
	    closing[11]= 8778.10;//August 16
	    closing[12]= 8990.80;//August 19
	    closing[13]= 8872.10;//August 20
	    closing[14]= 8957.20;//August 21
	    closing[15]= 9053.60;//Aug 22
	    closing[16]= 8872.96;//Aug 23
	    closing[17]=8919.01;//Aug 26
	    closing[18]= 8824.41;//Aug 27
	    closing[19]= 8694.09;//Aug 28 20
	    closing[20]= 8670.99;//Aug 29
	    closing[21]= 8663.50;//Aug 30
	    closing[22]= 8308.05;//Sept 3
	    closing[23]= 8425.12;//Sept 4
	    closing[24]= 8283.70;//Sept 5
	    closing[25]= 8427.20;//Sept 6
	    closing[26]= 8519.38;//Sept 9
	    closing[27]= 8602.61;//Sept 10
	    closing[28]= 8581.17;//11
	    closing[29]= 8379.41;//12 30
	    closing[30]= 8312.69;//13
	    closing[31]= 8380.18;//16
	    closing[32]= 8207.55;//17
	    closing[33]= 8172.45;//18
	    closing[34]= 7942.39;//19
	    closing[35]= 7986.02;//20
	    closing[36]= 7872.15;//23
	    closing[37]= 7683.13;//24
	    closing[38]= 7841.82;//25
	    closing[39]= 7997.12;//26 40
	    closing[40]= 7701.45;//27
	    closing[41]= 7591.93;//30 //42
	    }

    /** Part 1 prints out all the closing index for the trading days in Sept and Aug */
    public void print()
    {
	System.out.println("day (x)         closing index (y)");
	for(int i=0;i<closing.length;i++)
	    {
		int i2 = i+1;
		System.out.println("day " + i2 + "                " + closing[i]);
	    }

    }

    /** Part 3 Obtain the coefficients by using Jacobi's method */
    public void jacobi()
    {
	double x0,x1,x2,x3;
	x0= 10.0;
	x1=20.0;
	x2=30.0;
	x3=40.0;
double[][] mat = new double[4][5];
mat[0][0] = Math.pow(x0,0.0);
mat[0][1] = Math.pow(x0,1.0);
mat[0][2] = Math.pow(x0,2.0);
mat[0][3] = Math.pow(x0,3.0);
mat[0][4] =  8743.30;

mat[1][0] = Math.pow(x1,0.0);
mat[1][1] = Math.pow(x1,1.0);
mat[1][2] = Math.pow(x1,2.0);
mat[1][3] = Math.pow(x1,3.0);
mat[1][4] = 8694.09;

mat[2][0] = Math.pow(x2,0.0);
mat[2][1] = Math.pow(x2,1.0);
mat[2][2] = Math.pow(x2,2.0);
mat[2][3] = Math.pow(x2,3.0);
mat[2][4] = 8379.41;

mat[3][0] = Math.pow(x3,0.0);
mat[3][1] = Math.pow(x3,1.0);
mat[3][2] = Math.pow(x3,2.0);
mat[3][3] = Math.pow(x3,3.0);
mat[3][4] = 7997.12;



//gets the exact result
int k=20;
double x,y,z,w,temp1,temp2,temp3;
x=0.0; y=0.0; z=0.0; w=0.0; temp1=0.0;temp2=0.0;temp3=0.0;
for(int i=1;i<k;i++)
{
x = (mat[0][4]  - mat[0][1] - mat[0][2]-mat[0][3] ) / mat[0][0];
y = (mat[1][4] - mat[2][2] - mat[2][3]) / mat[1][1] ;
temp1 = y;
z= (mat[2][4] -  mat[2][1] - mat[2][3]) /mat[2][2];
temp2=z;
w= (mat[3][4] - mat[3][1] - mat[3][2]) /mat[3][3];
temp3=w;
}

//prints out the results of the coeffcients
System.out.println(x);
System.out.println(y);
System.out.println(z);
System.out.println(w);
    }

    public static void main(String[] args)
    {
	DowJones_3 dj = new DowJones_3();
	dj.print();
	dj.jacobi();
    }

}
