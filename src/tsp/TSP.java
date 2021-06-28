import java.util.Vector;

/**
 traveling salesman problem to find the shortest path from the starting city to make
a tour to the remaining cities
*/
public class TSP
{
    //stores all the city data
    private Vector cities;

    //visited cities
    private boolean[] visited;

    //distances table
    private double[][] distances;

    //represents the current node you are on, the index of the current city
    private int current;

    //stores the path in an integer array of indices
    private int[] path;

    //the total distance
    private double totalDistance;

    public TSP()
    {
	//adds all the cities to the vector. Marks city1 as being visited
	cities = new Vector();
	City city1 = new City(6.623123, 2.253046);
	city1.setVisited(true);
	cities.add(city1);
	cities.add(new City(4.723182, 1.949215));
	cities.add(new City(2.346305, 4.202261));
	cities.add(new City(7.069488, 6.151476));
	cities.add(new City(0.415793, 1.353737));
	cities.add(new City(7.485281, 7.505212));
	cities.add(new City(7.901073, 8.858949));
	cities.add(new City(6.386353, 7.364161));
	cities.add(new City(5.287427, 7.223111));
	visited = new boolean[cities.size()];
	path = new int[cities.size()];
	path[0]=0;
	visited[0]=true;
	distances = new double[cities.size()][cities.size()];
	current =0; //current node is City 1
    }

    public void printVisit()
    {
	for(int i=0;i<visited.length;i++)
	    System.out.println(visited[i]);
    }

    public City getCity(int i)
    {
	return (City)cities.get(i);
    }

    /** stores all the distances in a table of distances */
    public double[][] getDistances()
    {
	double[][] d = new double[cities.size()][cities.size()];
	for(int i=0;i<cities.size();i++)
	    {
		//System.out.println();
		for(int j=0;j<cities.size();j++)
		{
		    d[i][j] = distance((City)getCity(i),(City)getCity(j));
		    //System.out.println(d[i][j] + " " + i + "," + j);
		}
	    }
	distances = d;
    return d;
    }

    //input a row to check for the smallest distance in that row
    public double getPath(int row)
    {
	//the current min, I chose to start at 1000 because it was a larger # than the largest
	//distance
	double min1 =1000.0;
	//double[][] dd = getDistances();
	for(int i=0;i<distances[row].length;i++)
	    {
		if(distances[row][i] != 0.0 && visited[i] == false)
		min1 = Math.min(min1, distances[row][i]);
	    }
	//System.out.println(min1);
	return min1;
    }
   

    //gets the column index of a corresponding row
    public int getColumnIndex(int row)
    {
	int index=0;
	//double[][] dd = getDistances();
	for(int i=0;i<distances[row].length;i++)
	    {
		if(getPath(row) == distances[row][i])
		    index = i;
	    }
	//	System.out.println(index);
	return index;
    }

    //finds the path by scanning through each row and picking the smallest distance
    public void find()
    {
	int nextCity =0;
	
	//System.out.println(path[0]);
	for(int i=0;i<8;i++)
	    {
		nextCity = getColumnIndex(i);
		totalDistance += distances[i][nextCity];
		visited[nextCity] = true;
		path[i+1]= nextCity;
		//System.out.println(path[i]);
	    }
	
	//add the return back to the original city to complete the tour
	totalDistance +=  distances[path[path.length-1]][0];
	//System.out.println("last city before return  " + path[path.length-1]);  
}


    /** finds the distance between 2 cities */
    public double distance(City c1, City c2)
    {
	return City.distance(c1,c2);
    }

    //prints the resulting path and total shortest distance
    public void printPath()
    {
	System.out.println("The tour of cities");
	for(int i=0;i<path.length;i++)
	    {
		System.out.print("City" + path[i]+ "-> ");
		
	    }
	System.out.println("City" + path[0]);
	System.out.println("Total distance traveled: " + totalDistance);
    }

  

    public static void main(String[] args)
    {

	TSP tsp = new TSP();
	tsp.getDistances();
	tsp.find();
	tsp.printPath();
    }

}







