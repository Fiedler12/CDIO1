package com.company;

import java.util.Scanner;


public class Main {
    static Spiller spiller1;
    static Spiller spiller2;
    static Scanner input = new Scanner(System.in);
    static Terning terning = new Terning();
    static Tur tur = new Tur();


    public static void main(String[] args) {
        spiller1 = new Spiller();
        spiller2 = new Spiller();

        //Gør eventuelt dette til en class.
        System.out.println("Indtast spiller 1's navn.");
        spiller1.setNavn(input.nextLine());
        System.out.println("Spiller 1 er " + spiller1.getNavn());

        System.out.println("Indtast spiller 2's navn.");
        spiller2.setNavn(input.nextLine());
        System.out.println("Spiller 2 er " + spiller2.getNavn());


        while (spiller1.getPoint() < 40 && spiller2.getPoint() < 40) {
            tur.tur(spiller1);
            tur.tur(spiller2);
        }
    }

}
