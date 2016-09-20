package com.company;

/**
 * Created by Елена on 29/05/2016.
 */
public class Compare {

    public static void main (String[] args){
        System.out.println(getMax(1,- 22,3,4));
    }

    public static int getMax (int a, int b,int c, int d){

        int k = a > b ? a : b; // k = a or b
        int l = c > d ? c : d; // l = c or d


        return  k > l ? k : l;
    }
}
