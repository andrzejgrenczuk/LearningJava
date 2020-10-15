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
    public static int run() {

    int[] values = {1,2,3,4,5,6};
    System.out.println(values[2]);

    for(int row=0;row < values.length; row++){
            System.out.println(row);
    }
    System.out.println("Mnozenie tablicy 'values' przez 2");
    for(int i=0;i<values.length;i++){
        System.out.print(i*2);
    }
    int empty[] = new int[3];
    empty[0] = 1;
    empty[1] = 2;
    empty[2] = 3;
    
    System.out.println(empty[0]);
    System.out.println(empty[1]);
    System.out.println(empty[2]);

    int[] array1 = {1,2,3,4,5,6,7,8,9};
    int[] array2 = {0,1,2,3,4,5,6,7,8};
    System.out.println("Utworzono 2 macierze jednowtymiarowe, czyli: int[] array1 = {1,2,3,4,5,6,7,8,9} oraz int[] array2 = {0,1,2,3,4,5,6,7,8}");


        return 0;
    }

}
