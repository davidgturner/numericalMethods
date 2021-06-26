import java.text.*;
import java.awt.*;
import javax.swing.*;

public class RandomNum {

    /**
     * random numbers from -1.0 to 1.0
     */
    private float[] numbers;
    /**
     * holds the frequency in each interval
     */
    private int[] arr;

    /**
     * this was a temp constructor. not very good design
     */
    public RandomNum(float seed0, float seed1) {
        numbers = new float[1000000];
        numbers[0] = seed0;
        numbers[1] = seed1;
    }


    /**
     * specifies size and both seeds
     */
    public RandomNum(int size, float seed0, float seed1) {
        numbers = new float[size];
        setSeed(seed0, seed1);
    }

    /**
     * sets the seed
     */
    public void setSeed(float seed0, float seed1) {
        numbers[0] = seed0;
        numbers[1] = seed1;
    }

    /**
     * makes an interval chart to show the number of occurences in each
     * interval and prints these out.
     */
    public void interval() {
        //an array to store of the number of occurences
        // in interval [-1,-0.9) is arr[0], [-0.9,-0.8) is arr[1] and so on
        arr = new int[20];
        //the starting interval
        double left = -1.0;//left interval
        double right = -0.9;//right interval
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (left <= numbers[j] && numbers[j] < right) {
                    count++;
                }//if
            }//for
            arr[i] = count;

            String strange = "0.#";
            DecimalFormat weirdFormatter = new DecimalFormat(strange);
            String bizarre1 = weirdFormatter.format(left);
            String bizarre2 = weirdFormatter.format(right);
            //System.out.println(bizarre);

            System.out.println("[" + bizarre1 + "," + bizarre2 + "): " + arr[i]);
            left += 0.1;
            right += 0.1;
            count = 0;
        }//for

        //Histogram h = new Histogram(arr);
        //h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //h.show();
    }//method


    public void interval(float[] numbers) {
        //an array to store of the number of occurences
        // in interval [-1,-0.9) is arr[0], [-0.9,-0.8) is arr[1] and so on
        int[] arr = new int[20];
        //the starting interval
        double left = -10;//left interval
        double right = -9;//right interval
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (left <= numbers[j] && numbers[j] < right) {
                    count++;
                }//if
            }//for
            arr[i] = count;

            String strange = "0.#";
            DecimalFormat weirdFormatter = new DecimalFormat(strange);
            String bizarre1 = weirdFormatter.format(left);
            String bizarre2 = weirdFormatter.format(right);
            //System.out.println(bizarre);

            System.out.println("[" + bizarre1 + "," + bizarre2 + "): " + arr[i]);
            left += 1;
            right += 1;
            count = 0;
        }//for
    }//method

    /**
     * fills in all the random numbers with certain bounds
     * if bounds= 1 than it will be a random number between -1 and 1
     */
    public float[] fillNum(int bounds) {
        //from 0 to 1
        for (int i = 1; i < numbers.length - 1; i++) {
            numbers[i + 1] = (numbers[i] + numbers[i - 1]) % 1.0f;
        }
        //from -1 to 1
        for (int j = 1; j < numbers.length - 1; j++) {
            numbers[j + 1] = 1.0f - (2.0f * numbers[j + 1]);
        }

        return numbers;
    }

    public float[] fillNum2(float bounds) {
        //from 0 to 1
        for (int i = 1; i < numbers.length - 1; i++) {
            numbers[i + 1] = (float) Math.abs((numbers[i] + numbers[i - 1]) % 2.0f);
            //numbers[i+1] *= bounds;
        }

        return numbers;
    }

    /**
     * shows every single random number
     */
    public void show() {
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }

    //performs garbage collection
    public void cleanUp() {
        numbers = null;
        System.gc();
    }

    public float[] getNewRandoms() {

        /** this makes another array of completely new numbers*/
        float addup = 0.0f;
        float[] h = new float[1000000];
        //for all the 10,000,000 random numbers
        for (int i = 0; i < numbers.length; i++) {
            //gets every 10 and adds it up and puts it in the h array
            addup += numbers[i];
            if (i % 10 == 0) {
                h[i / 10] = addup;
                addup = 0;
            }
        }
        //	System.out.println("COOOUNNNT " + h.length);

        //for(int i=0;i<h.length;i++)
        //System.out.println(h[i]);

        return h;
    }

    public static void main(String[] args) {
        System.out.println("Generates 1000000 uniformly distributed random #'s");
        //generates 1000000 random numbers
        RandomNum rand = new RandomNum(1000000, 0.64564588f, -0.223496610f);
        //fills in the random #'s
        rand.fillNum(1);
        //rand.show();
        //prints out the frequencies of randomness
        rand.interval();

        //rand.cleanUp();

        System.out.println();
        System.out.println("Generates 10,000,000 uniformly distributed random #'s");
        System.out.println("Generates a new 1,000,000 numbers from adding up every 10");
        //generates 1000000 random numbers
        RandomNum rand2 = new RandomNum(10000000, 0.3275988f, 0.63616610f);
        rand2.fillNum(1);
        //rand2.getNewRandoms();
        rand2.interval(rand2.getNewRandoms());


    }
}
