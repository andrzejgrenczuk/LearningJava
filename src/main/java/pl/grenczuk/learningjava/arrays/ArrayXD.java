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
    public static void run() {
        int[][] grid = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
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
        System.out.println("Utworzono pustą tablicę dwuwymiarową tablicę o wymiarach 4x4");
        empty[0][0] = 4;
        empty[0][1] = 3;
        empty[2][0] = 5;
        empty[2][1] = 0;

        for (int row = 0; row < empty.length; row++) {
            for (int col = 0; col < empty[row].length; col++) {
                System.out.print(empty[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("Zdefiniowane następujace tablice:" +
                "int[][] array1 = {\n" +
                "                {1, 2, 3, 4, 5, 6},\n" +
                "                {7, 8, 9, 10, 11, 12},\n" +
                "                {0, 1, 2, 3, 4, 5},\n" +
                "                {0, 9, 8, 7, 6, 5}\n" +
                "        }" +
                "int[][] array2 = {\n" +
                "                {0, 1, 2, 3, 4, 5},\n" +
                "                {0, 9, 8, 7, 6, 5},\n" +
                "                {5, 4, 3, 2, 1, 0},\n" +
                "                {125, 789, 1458754, 215, 3687}\n" +
                "        }");
        int[][] array1 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {0, 1, 2, 3, 4, 5},
                {0, 9, 8, 7, 6, 5}
        };
        int[][] array2 = {
                {0, 1, 2, 3, 4, 5},
                {0, 9, 8, 7, 6, 5},
                {5, 4, 3, 2, 1, 0},
                {125, 789, 1458754, 215, 3687}
        };
        System.out.println("Operacja dodawania dwóch tablic");
        if (array1.length != array2.length) {
            System.out.println("Tablice nie mają wspólnego wymiaru");
        } else {
            add(array1, array2);
        }
        System.out.println();
        System.out.println(" Mnozenie tablic array1 przez array2: " +
                multiply(array1,array2));

    /*for(int row=0;row<array1.length;row++){
        for(int col=0;col<array2.length;col++){
            System.out.println();
        }
    }*/



    }
    public static int[][] add(int[][] array1, int[][] array2){
        int[][] wynik = new int[array1.length][array1[0].length];
        if (array2.length == array1.length && array2[0].length == array1[0].length) {
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    //System.out.print(wynik[i][j] = array1[i][j] + array2[i][j]);
                    System.out.print((array1[i][j] + array2[i][j]) +"\t");
                }
            }
        } else {
            wynik = null;
        }
        return wynik;
    }

    public static int[][] multiply(int[][] array1, int[][] array2) {

        int[][] wynik=new int[array1.length][array2[0].length];
        if (array2.length==array1[0].length) {
            for (int i=0;i<wynik.length;i++) {
                for (int j=0;j<wynik[0].length;j++) {
                    wynik[i][j]=0;
                    for (int x=0;x<array1[0].length;x++) {
                        System.out.println(wynik[i][j]=wynik[i][j]+array1[i][x]*array2[x][j]);
                        //System.out.println(wynik[i][j]+array1[i][x]*array2[x][j]);
                    }
                }
            }
        } else {
            wynik=null;
        }
        return wynik;
    }


}
