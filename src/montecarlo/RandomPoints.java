public class RandomPoints {
    /**
     * all the random x coordinates
     */
    private float[] xcoor;
    /**
     * all the random y coordinates
     */
    private float[] ycoor;
    /**
     * N points
     */
    private int npoints;

    /**
     * generates n number of random points
     */
    public RandomPoints(int n) {
        npoints = n;
        RandomNum rand = new RandomNum(n, 0.3234234f, 0.7823287324f);
        xcoor = rand.fillNum2(2.0f);
//rand=null;
//System.gc();
        RandomNum rand2 = new RandomNum(n, 0.63453f, 0.45785798f);

        ycoor = rand2.fillNum2(2.0f);
//rand2=null;
//System.gc();
    }

    /**
     * prints out all the random points
     */
    public void print() {
        for (int i = 0; i < npoints; i++) {
            System.out.println("( " + xcoor[i] + ", " + ycoor[i] + ")");
        }
    }

    public float[] getX() {
        return xcoor;
    }

    public float[] getY() {
        return ycoor;
    }


    public static void main(String[] args) {
        RandomPoints rp = new RandomPoints(1000000);
        rp.print();
    }

}
