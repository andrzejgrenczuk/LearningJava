/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.learningjava.numbers;

/**
 *
 * @author andrz
 */
public class Integers {
    public static void run(){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        Class<Integer> intType = Integer.TYPE;
        System.out.println("Min value of integer is "+min);
        System.out.println("Max value of integer is "+max);
        System.out.println("Type is "+intType);        
        System.out.println("Number of bytes for single integer: "+Integer.BYTES);
        System.out.println("Bit count for value: min => "+Integer.bitCount(min));
        System.out.println("Bit count for value: max => "+Integer.bitCount(max));
        
    
    }
}
