/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.learningjava.main;

import pl.grenczuk.learningjava.arrays.Array1D;
import pl.grenczuk.learningjava.arrays.ArrayXD;
import pl.grenczuk.learningjava.numbers.Integers;
import pl.grenczuk.learningjava.string.Strings;

/**
 *
 * @author andrz
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Uruchomienie operacji na Array 1 dimension");
        Array1D.run();
        System.out.println("\n");
        System.out.println("Uruchomienie operacji na Array X dimension");
        ArrayXD.run();
        System.out.println("\n");
        System.out.println("Uruchomienie operacji na Strinach - ciągu znaków, a nie na majtkach :)");
        Strings.run();
        System.out.println("Uruchomienie operacji na liczbach całkowitych");
        Integers.run();
    }
}
