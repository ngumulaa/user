package edu.guilford;

import java.util.ArrayList;

public class Bikes {
     
    //attributes
    private String color;
    private String brand;
    private int year;
    private int price; 
    private int mileage; 

    //constructor
    public Bikes(String color, String brand, int year, int price, int mileage) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }

    // generate a bike with random values for price and mileage 

    public Bikes(String color, String brand, int year) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.price = (int)  (Math.random() * 1000) + 100;
        this.mileage = (int) (Math.random() * 1000) + 100;
}
    //getters and setters 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }
   
    public int getmileage() {
        return mileage;
    }

    public void setmileage(int mileage) {
        this.mileage = mileage;
    }

    //toString method
    @Override
    public String toString() {
      return "{" +
        " color='" + getColor() + "'" +
        ", brand='" + getbrand() + "'" +
        ", year='" + getyear() + "'" +
        ", price='" + getprice() + "'" +
        ", mileage='" + getmileage() + "'" +
        "}"; 
    }

    public static ArrayList<Bikes> makeBikes(int numBikes) {
        ArrayList<Bikes> bikes = new ArrayList<Bikes>();
        for (int i = 0; i < numBikes; i++) {
            bikes.add(new Bikes("red", "trek", 2018));
        }
        return bikes;
    }

    /**
     * @param bikes
     */
    public static void printBikes(ArrayList<Bikes> bikes) {
        for (Bikes bike : bikes) {
            System.out.println(bike);
        }
    }
}
