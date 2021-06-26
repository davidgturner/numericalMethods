David Turner
AMS 321
Project 2

Problem Description
part a of the assignment required us to create 1000000 uniform random numbers and 
find out if they are equal in the intervals they are in from -1.0 to 1.0. 
part b had us draw 1000000 points to the screen in a -2.0 by 2.0 interval to draw a perfect
square and then we draw a circle enclosing the square. then we count how many points are inside
the circle as opposed to being outside the circle.
part c had us find all the pyrimidal numbers and then find how integers from 1-5000 can be 
crated using these numbers.

Programs with comments
A) to run part a, compile and run RandomNum.java
java RandomNum
This class also runs part c as well.
I tried making a graphical histogram using the Java Graphics library but it was taking up too
much of my time so that I couldn't be productive.

B)compile and run Points.java
java Points

C) compile and run Pyrimidal.java
java Pyrimidal


Required numerical results
I printed out all numerical results to the screen.

Comments on the results and the performance of algorithms
A) I thought the first part show the algorithm you can use to generate random numbers which is
randomNum1 + randomNum2 MOD 1.0 which gets a random number from 0 to 1 and then you can convert
that into -1.0 to 1.0 by using the formula Y=1-2X. Then the 3rd part of the assignment I found
out the histogram would look like a bellshaped curve or normal distribution just by looking at
the frequencies while the first part would be generally a straight line accross showing a
uniform distribution.

B) 4 * Ni/N gave us an approximation to Pi.
I didn't do the 16,000,000 points question because of the way I implemented it I kept running
out of memory.

C) The algorithm I used to find the pyrimidal numbers used iteration.
For all the integers that return 1 I used one for loop, for all the integers that returned 2
I used a nested loop, for all the numners that used three integers, I used a triple nested loop
and so on. 
I know this wasn't the best algorithm to use but everything works and I am able to get all the results. If I was to do the problem again I would use recursion but I had some trouble
coming up with a recursive definition.
