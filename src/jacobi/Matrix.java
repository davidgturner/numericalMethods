/** class to perform matrix multiplications and count how many operations there are */
public class Matrix
{


public static void main(String[] args)
{
double[][] mat = new double[100][100];
double[][] mat2 = new double[100][100];
double[][] mat3 = new double[100][100];



//fill up the first 2 matrices
for(int i=0;i<mat.length;i++)
for(int j=0;j<mat.length;j++)
{
mat[i][j]= Math.random();
mat2[i][j]= Math.random();
}

int numMult=0;

//find the multiplication of the first 2 matrices
for(int i=0;i<mat.length;i++)
for(int j=0;j<mat.length;j++)
for(int k=0;k<mat.length;k++)
{
mat3[i][j] += mat[i][k] * mat2[k][j];
numMult++;
}
System.out.println("Number of multiplications: " + numMult);
System.out.println("Number of additions: " + numMult/2);
}
}
