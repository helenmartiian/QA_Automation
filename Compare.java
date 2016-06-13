package com.company;

/**
 * Created by Елена on 29/05/2016.
 */
public class Compare {

    public static void main (String[] args){
        System.out.println(getMax(1,- 22,3,4));
    }

    public static int getMax (int a, int b,int c, int d){

        return   a > b ?
                (a > c ? (a > d ? a : d) : (c > d ? c : d)):
                (b > c ? (b > d ? b : d) : (c > d ? c : d));
    }
}
