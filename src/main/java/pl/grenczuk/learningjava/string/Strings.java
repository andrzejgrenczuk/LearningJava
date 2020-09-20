/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.learningjava.string;

import java.util.Scanner;

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
        if(imie.length()==nazwisko.length()){ 
            System.out.println("Długość imienia jest taka sama jak nazwisko!");
        }else{System.out.println("Imie i nazwisko mają rożną długość!");}
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz jakiś tekst, dowolny - ważne, musi być ednolinijkowy");
        String text1 = sc.nextLine();
        System.out.println("Wpisz jakiś kolejny dowolny jednolinijkowy tekst");
        String text2 = sc.nextLine();
        System.out.println("Jako piewrszy tekst wpisałeś:\n"
        + text1+"\n"
                +"Jako drugi wpisałeś: \n"
        +text2);
        System.out.println(imie.concat("a"));
        System.out.println(nazwisko.concat("a"));
        System.out.println(imie);
        System.out.println(nazwisko);
        
        for(int letter=0;letter<imie.length();letter++){
            System.out.println(imie.charAt(letter));        
        } //wyświetli literę po literze z imienia
        System.out.println("\n");
        
        for(int letter=0;letter<nazwisko.length();letter++){
            System.out.println(nazwisko.charAt(letter));        
        } //wyświetli literę po literze z nazwisko
        
        
    
    }
}
