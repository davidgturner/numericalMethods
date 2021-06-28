
Problem 1 (10 Points):  A traveling salesman must visit nine cities at least once. Please design a method (any method, brute force or novel) to find the shortest-distance path. We further assume City 1 is the starting city and any order for the subsequent cities which can be chosen to minimize the distance. In this project, you would need to do the following 
A.	algorithm you use for the optimization; 
B.	code with comments to implement the algorithm; 
C.	the resulting path that has shortest (or approximately shortest) total distance; You may express the path by ordering the cities in the order you travel: C1àC9à...C2.
D.	the shortest distance, i.e., a number that’s the distance you found.
A.	The algorithm I used for this optimization first consisted of making a City data structure for each city and then storing them in a vector. From this I calculated all the distances from one city to all the other cities and stored those values in a matrix. 

After having the matrix, I then scanned each of the rows one by one and picked the smallest distance in each row and stored the column it was in. That column represents the next city to go to. This city is marked visited by using a boolean array. I keep doing this until all the cities are visited. This gives the shortest distance.

B.	(code in a separate source file)

C.	Resulting Path: City0 -> City1 -> City2 -> City4 -> City7 -> City8 -> City3 -> City5 -> City6 -> City0

D. shortest distance : 29.348545

