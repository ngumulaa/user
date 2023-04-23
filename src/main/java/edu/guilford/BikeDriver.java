package edu.guilford;

import java.util.ArrayList;

public class BikeDriver 
{
    public BikeDriver(String string, String string2, int i) {
    }

    public static void main( String[] args ) {
       BikeDriver bike = new BikeDriver ("red", "trek", 2018);
        System.out.println (bike);
        ArrayList<BikeDriver> bikes = bike.makeBikes(5);
        bike.printBikes(bikes);

    
    }

    private void printBikes(ArrayList<BikeDriver> bikes) {
    }

    private ArrayList<BikeDriver> makeBikes(int i) {
        return null;
    }

}
