package com.company;
/**
 *
 */

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {-8, -2, 0, -6, 1, 2, 3, 4, 10, 24};

        int n=0;
        int i = 0;
        int j = 0;
        int p = 0;

        while (i<a.length -2) {
            j=i+1;
            while (j<a.length -1) {
                p = j+1;
                while (p<a.length) {
                    int myThreeSum = a[i] + a[j] + a[p];
                    if(myThreeSum==0){n++;}
                    p++;
                }
                j++;
            }
            i++;
        }
        System.out.println(n>0);
    }}

