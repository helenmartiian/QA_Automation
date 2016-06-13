package com.company;

/**
 * Created by Елена on 27/05/2016.
 */
public class Drobi {

    public static void main(String[] args) {

        System.out.println(addFractions(1,2,3,4));

    }

    public static double addFractions(int a, int b, int c, int d) {

        return ((double)a * d + b * c) / (b * d);
    }


}
