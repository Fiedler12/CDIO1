package com.company;

import java.util.Scanner;


public class Main {
    static Spiller spiller1;
    static Spiller spiller2;
    static Scanner input = new Scanner(System.in);
    static Terning terning = new Terning();

    public static void main(String[] args) {
        spiller1 = new Spiller();
        spiller2 = new Spiller();

        //Gør eventuelt dette til en class.
        System.out.println("Indtast spiller 1's navn.");
        spiller1.setNavn(input.nextLine());

        System.out.println("Indtast spiller 2's navn.");
        spiller2.setNavn(input.nextLine());


        while (spiller1.getPoint() < 40 && spiller2.getPoint() < 40) {
            tur(spiller1);
            tur(spiller2);



        }
    }
    public static void tur(Spiller currentPlayer) {
        System.out.println(currentPlayer.getNavn() + ", det er din tur.");
        System.out.println("Tryk enter for at slå.");
        input.nextLine();
        terning.roll();
        System.out.println("Du har slået: " + terning.hentterning1() + " og " + terning.hentterning2() + " i alt har du slået:" + terning.henttotal());
        currentPlayer.setPoint(currentPlayer.getPoint() + terning.henttotal());
        System.out.println(currentPlayer.getNavn() + " har nu: " + currentPlayer.getPoint());
    }
}
