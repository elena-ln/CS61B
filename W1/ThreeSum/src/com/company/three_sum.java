package com.company;

public class three_sum {
    public static void main(String[] args) {

        int[] a = {-8, -2, 0, -6, 1, 2, 3, 4, 10, 24};
        int f= 0;
        int g=0;
        int h=0;
        int t_sum=-1;
        int n = -1;

        for (f=0; f < a.length-2; f++){

            for(g=f+1; g < a.length-1; g++){

                for (h=g+1; h < a.length; h++){

                    t_sum = a[f]+a[g]+a[h];
                    if (t_sum == 0) {
                        n ++;
                    }
                }
            }
        }
        boolean iszero = (t_sum != -1);
        System.out.println(iszero);
    }
}

