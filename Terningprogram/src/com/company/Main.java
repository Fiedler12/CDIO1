package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int spiller1;
        int spiller2;
        spiller1 = 0;
        spiller2 = 0;
    //Gør eventuelt dette til en class.
        System.out.println("Indtast spiller 1's navn.");
        String spiller1navn = input.nextLine();

        System.out.println("Indtast spiller 2's navn.");
        String spiller2navn = input.nextLine();


        while (spiller1 < 40 && spiller2 < 40) {
            //Spiller 1's tur
            Terning terning = new Terning();
            System.out.println("Tryk enter for at slå.");
            input.nextLine();
            terning.roll();
            System.out.println("Du har slået: " + terning.hentterning1() + " og " + terning.hentterning2() + " i alt har du slået:" + terning.henttotal());
            spiller1 = spiller1 + terning.henttotal();
            System.out.println(spiller1navn + " har nu: " + spiller1);

            if (spiller1 >= 40) {
                break;
            // to 1'ere er tager alle point væk
            // spiller slår to ens giver en ekstra tur.
            // to 6'ere i streg betyder at man vinder
            // Spiller skal slå to ens efter at have fået 40 point.
            // Eventuelt ved brug af switch-funktion.
            }
            //Spiller 2's tur
            System.out.println("Tryk enter for at slå.");
            input.nextLine();
            terning.roll();
            System.out.println("Du har slået: " + terning.hentterning1() + " og " + terning.hentterning2() + " i alt har du slået:" + terning.henttotal());
            spiller2 = spiller2 + terning.henttotal();
            System.out.println(spiller2navn + " har nu: " + spiller2);

        }
        if(spiller1 >= 40) {
            System.out.println("Tillykke! " + spiller1navn + " har vundet!");
        }

        else if(spiller2 >= 40) {
            System.out.println("Tillykke! " + spiller2navn + " har vundet!");
        }
    }
}
