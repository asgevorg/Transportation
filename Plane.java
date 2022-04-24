package com.company;

public class Plane extends Transportation{
    int speed = 800;
    public double[] transport(int km){
        double arr[] = new double[2];
        arr[0] = (double) km / speed;
        arr[1] = speed;
        return arr;
    }
}
