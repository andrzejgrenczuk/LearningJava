/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.learningjava.arrays;


/**
 *
 * @author andrz
 */
public class Array1D {
    public static void run() {

    int[] values = {1,2,3,4,5,6};
    System.out.println(values[2]);
    
    for(int row=0;row < values.length; row++){
            System.out.println(row);
    }
    int empty[] = new int[3];
    empty[0] = 1;
    empty[1] = 2;
    empty[2] = 3;
    
    System.out.println(empty[0]);
    System.out.println(empty[1]);
    System.out.println(empty[2]);
        //return 0;
    }
    
}
