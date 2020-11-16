package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] massiv ={1.2,33.4,2.0,-33.2,23.3,-3.0,12.2,34.2,-31.0,-32.2,9.3,-8.2,-12.3,4.8,-82.1};


        for (double just:massiv) {
           double h = ((massiv[3]+massiv[4]+massiv[5]+massiv[6]+massiv[7]+massiv[8]+massiv[9]+massiv[10]+massiv[11]+massiv[12]+massiv[13]+massiv[14])/12);

            System.out.println(h);
           }
        System.out.print("\nSorted: \n");
        Arrays.sort(massiv);
        for (int i = 0; i <massiv.length; i++) {
            System.out.println(massiv[i] + " ");
        }


            }

    }
    


    



