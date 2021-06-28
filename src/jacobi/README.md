
Problem Description
1. In this problem, you write a program to do the following three things: 
1)Generate two square matrices (100x100 in size) A and B with random number elements in
  interval [0, 1];
2)Multiply these two matrices to produce matrix C;
3)Count approximately how many "add" and "multiply" operations the computer has done for the 
  matrix multiply.

Compile 
javac Matrix.java
Run
java Matrix

Numerical Results
There were 1000000 multiplications and 500000 additions because I used a nested for loop.

Algorithm (Pseudocode)
for i=0 to length
for j=0 to length
for k=0 to length
{
matrix[i][j] += mat[i][k] * mat2[k][j];
}


Problem Description
A couple borrowed from a bank $350,000 at 6.75% annual interest rate (daily interest 
compounds and  assume each month has 30 days.) If the borrower pays the bank $2500 a month 
(say, at start of each  month), write a program to compute when borrower will pay off the loan.

1)Compute the total number of months needed to pay off the loan;

2)If the borrower pays the bank twice a month at $1250 each (one at start of, and another at middle
of, the month), the loan will be paid off a bit sooner. Please compute the number of months that the
loan is paid off;

3)If the borrower pays below one number each month, the loan will never be paid off (but it won’t
grow either). Please calculate such number.

my algorithm to solve this problem is as follows:
 1) for the first part
while(!paidoff)
{
p=p*(1+r)-d;
if(p <= 0)
paidoff = true;
}

2)


Problem 3 Description
3. Search for the Dow Jones daily closing index for the trading days in the months
 of August and September of 2002 by your favorite search tool from the world-wide web. You
 should 
1) Present your results in the following format:
          day (x)         closing index (y)
          1                 7666.89
          2                 7786.12
          ...
          50                7768.09
Note: the number of trading days in the months may not be exactly 50 days and the indices I 
am using here are hypothetical.
2) Give the exact reference (such as URL) as where you get your results.
3) Interpolate four representative points by a cubic polynomial.
In other words, find the coefficients for the following polynomial:
          y = a0 + a1 x + a2 x^2 + a3 x^3.
The four representative points are at x= 15, 25, 35, and 45.

I got my stock information from the following URL:
 http://table.finance.yahoo.com/k?s=^dji&g=d





