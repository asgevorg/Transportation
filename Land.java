package com.company;

public class Land extends Transportation{
    int speed = 80;
    public double[] transport(int km){
        double arr[] = new double[2];
        arr[0] = (double) km / speed;
        arr[1] = speed;
        return arr;
    }
}
