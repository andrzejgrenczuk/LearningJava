/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.learningjava.string;

/**
 *
 * @author andrz
 */
public class Strings {
    public static void run(){
        String imie = "Andrzej";
        String nazwisko = "Grenczuk";
        System.out.println("Dzień dobry, witam Was "+imie+" "+nazwisko+".");
        System.out.println("Piwersza litera w zmiennej imie to "+"'"+imie.charAt(0)+"'.");
        System.out.println("Czy zmienna 'imie' jest wartością pusta? "+imie.isEmpty());
        System.out.println("Długość mojego nazwiska to: " + nazwisko.length());
        System.out.println(imie.toCharArray());
        
    
    }
}
