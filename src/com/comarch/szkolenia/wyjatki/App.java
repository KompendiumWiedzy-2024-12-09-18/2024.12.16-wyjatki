package com.comarch.szkolenia.wyjatki;

import java.io.*;

public class App {
    public static void main(String[] args) {

        /*String[] tab = new String[10];
        String s = tab[10];
        s.toLowerCase();
        tab[0].toLowerCase();*/


        try {
            String[] tab = new String[10];
            //String s = tab[10];
            //s.toLowerCase();
            tab[0].toLowerCase();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cos sie zepsulo z tablica !!");
        }

        try {
            String file = "plik.txt";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma pliku !!");
        } catch (IOException e) {
            System.out.println("problem z wczytywaniem !!");
        }

        /*int[] tab = new int[10];
        tab[10] = 10;*/
        System.out.println("Koniec programu !!!");

    }
}
