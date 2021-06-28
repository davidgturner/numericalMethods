public class DowJones_older
{

/**
Dow Jones daily closing index for the trading days in the months of 
August and September of 2002
I got my historical price data from the following URL at Yahoo Finance:
Part 2. Exact URL : http://table.finance.yahoo.com/k?s=^dji&g=d
*/
private double[] closing; 

    public DowJones_older()
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
double[][] mat = new double[4][4];
mat[0][0] = 1.0;
mat[0][1] = 10.0;
mat[0][2] = 100.0;
mat[0][3] = 1000.0;

mat[1][0] = 1.0;
mat[1][1] = 20.0;
mat[1][2] = 400.0;
mat[1][3] = 8000.0; 

mat[2][0] = 1.0;
mat[2][1] = 30.0;
mat[2][2] = 900.0;
mat[2][3] = 27000;

mat[3][0] = 1.0;
mat[3][1] = 40.0;
mat[3][2] = 1600.0;
mat[3][3] = 64000.0;

double[] b = new double[4];
b[0]= 8743.30;
b[1]= 8694.09;
b[2]= 8379.41;
b[3]= 7997.12;

//gets the exact result
int k=55;//# of iterations
double[] a = new double[4]; //the vector that has all the coefficients in it

for(int i=1;i<k;i++)
{

//for(int j=1;j<b.length;j++)
//{
//a[j] = b[j] - mat[j
//}

}
/**
for(int i=1;i<k;i++)
{
a1 = -mat[0][1]/mat[0][0]*temp2 + mat[0][2]/mat[0][0];
a2 = ((-mat[1][0])/mat[1][1])*a1 - ((-mat[1][2])/mat[1][1]);
temp2 = a2;
}
System.out.println(a1);
System.out.println(a2);
*/
    }

    public static void main(String[] args)
    {
	DowJones_3 dj = new DowJones_3();
	dj.print();
	dj.jacobi();
    }

}
