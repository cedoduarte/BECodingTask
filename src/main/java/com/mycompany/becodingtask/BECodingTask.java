package com.mycompany.becodingtask;

import java.util.Scanner;

/**
 * @author Carlos Enrique Duarte Ortiz (carlosduarte.1@hotmail.com)
 */
public class BECodingTask {
    public static void main(String[] args) {
        // keyboard scanner
        Scanner scanner = new Scanner(System.in);
        
        // array size
        int X = scanner.nextInt();
        
        // number of iterations
        int Y = scanner.nextInt();
        
        // adjust "X" based on its constraints
        if (X < 3) {
            X = 3;
        } else if (X > 10000000) {
            X = 10000000;
        }
        
        // array of size "X" setted all to zeros
        int[] array = new int[X];
        for (int a = 0; a < X; a++) {
            array[a] = 0;
        }
        
        // adjust "Y" based on its constraints
        if (Y < 1) {
            Y = 1;
        } else if (Y > 200000) {
            Y = 200000;
        }
        
        // starts iterations
        for (int a = 0; a < Y; a++) {
            // from index
            int i = scanner.nextInt();
            // adjust "i" based on its constraints
            if (i < 1) {
                i = 1;
            } else if (i > X) {
                i = X;
            }
            
            // to index
            int j = scanner.nextInt();
            // adjust "j" based on its constraints
            if (j < i) {
                j = i;
            } else if (j > X) {
                j = X;
            }
            
            // value "k" to be added to each array element
            int k = scanner.nextInt();  
            // adjust "k" based on its constraints
            if (k < 0) {
                k = 0;
            } else if (k > 1000000000) {
                k = 1000000000;
            }
            
            // do process from "i" position to "j" position in the array.
            // parse position with this criteria: position "1" as "0", position "2" as "1", etc...
            for (int c = i-1; c <= j-1; c++) {
                array[c] += k;
            }
        }
        
        // gets the maximum value there is in the array
        int maxValue = array[0];
        for (int a = 0; a < X; a++) {
            if (array[a] > maxValue) {
                maxValue = array[a];
            }
        }
        // prints the result
        System.out.println(maxValue);
    }
}
