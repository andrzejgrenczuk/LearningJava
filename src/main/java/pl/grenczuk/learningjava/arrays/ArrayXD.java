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
public class ArrayXD {
    public static void run(){
    int[][] grid = {
        {1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
        {16,17,18,19,20}
    };
    
    System.out.println(grid[2][2]);
    System.out.println(grid[2][0]);
    System.out.println(grid[2][1]);
    System.out.println(grid[3][2]);
    System.out.println(grid[0][2]);
    System.out.println(grid[0][1]);
    System.out.println(grid[0][4]);
    System.out.println(grid[1][0]);
    System.out.println(grid[1][1]);
    
    System.out.println("Deklaracja i operacji na tablicy wielowymiarowej:");
    int empty[][] = new int[4][4];
       // empty = null;
    
    empty[0][0] = 4;
    empty[0][1] = 3;
    empty[2][0] = 5;
    empty[2][1] = 0;
    
        for (int row=0;row<empty.length;row++) {
            for (int col = 0; col < empty[row].length; col++) {
                System.out.print(empty[row][col] + "\t");
            }
            System.out.println();
        }

    
    }
}
