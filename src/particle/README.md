Problem 1 (10 points): 

(1)	Generate all possible integer pairs (x, y) inside a disk whose boundary equation is x^2 +y^2=10^2.
	For example, x=0 and y=10; x=4 and y=5 are two such pairs of numbers.
(2)	Use these numbers as the coordinates of the particles inside the disk. Count the number of particles you have inside the disk;
(3)	Next, change each particle’s coordinates by a random number “delta” where -0.1< delta < 0.1 to form new coordinates for the particles. In other words, if a particle’s coordinates found about in (1) is x=4, y=5, its new coordinates will be x=4 + delta1, y=5+delta2 where delta1 and delta2 are two random numbers in (-0.1, 0.1). Count again the number of particles you have inside the disk.
(4)	Same as the above (3) except that the range of the range number delta is now between (-0.5, 0.5). In other words, if a particle’s coordinates found about in (1) is x=4, y=5, its new coordinates will be x=4 + delta1, y=5+delta2 where delta1 and delta2 are two random numbers in (-0.5, 0.5). Count again the number of particles you have inside the disk.

Algorithm

My algorithm to find all the integer pairs from x^2+y^2=10^2 is to use a nested for loop as follows:
	For(int i=0 to some big number when squared is larger than 100(I picked 20))
	For(int j=0 to some big number when squared is larger than 100(I picked 20))
		if(i*i + j*j <= 100)
			store i and j in a particle object pair
			count++;

	returning count gives you the amount of particles and the particle object gives you all integer pairs. Print out particles by using the toString() method in particles and to get the number of particles, print that out using the method in numParticles in the Pairs class.

Adding Delta algorithm

To add delta when it equals either -0.1 < delta < 0.1 or -0.5<delta<0.5 I added the negative value to the modulo of a random number between 0 and 1 as follows:

For -0.1<delta<0.1 : -0.1 + (random MOD 0.2)
For -0.5<delta<0.5 : -0.5 + (random MOD 1.0)
To run my program : run Pairs.java… java Pairs

	
