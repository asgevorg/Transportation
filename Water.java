package com.company;

public class Water extends Transportation{
    int speed = 20;
    public double[] transport(int km){
        double arr[] = new double[2];
        arr[0] = (double) km / speed;
        arr[1] = speed;
        return arr;
    }
}
