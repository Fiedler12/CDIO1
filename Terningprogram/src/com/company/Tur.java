package com.company;
import java.util.Scanner;
/*
Tur-klassen har vi skabt for at gøre det nemt at ændre struktur, rækkefølge eller lignende i spillet.
Vores tur indeholder derudover også spillets struktur samt definition af point.
Vi har designet tur således at den kan blive påført en hvilken som helst spiller.
Dette betyder at du principielt kan spille med et ubegrænset antal spillere. Ikke blot 2.
Dette gøres muligt
 */
public class Tur {
    Scanner input = new Scanner(System.in);
    Terning terning = new Terning();
    public void tur (Spiller currentPlayer){
        //Metodes er lavet således at dette kun kan blive kørt på en spiller. Deraf indholdet i parantesen.
        //Den spiller som skal køres på erstattes af "currentPlayer" i koden.
        System.out.println(currentPlayer.getNavn() + ", det er din tur.");
        System.out.println("Tryk enter for at slå.");
        input.nextLine();
        terning.roll();
        System.out.println("Du har slået: " + terning.hentterning1() + " og " + terning.hentterning2() + " i alt har du slået: " + terning.henttotal());
        currentPlayer.setPoint(currentPlayer.getPoint() + terning.henttotal());
        if (terning.henttotal() == 2) {
            currentPlayer.setPoint(0);
            System.out.println("Fordi du har slået to 1'ere har du mistet alle dine point.");
        }
        System.out.println(currentPlayer.getNavn() + " har nu: " + currentPlayer.getPoint() + " point");
        while (terning.hentterning1() == terning.hentterning2()) {
            if (currentPlayer.getPoint() >= 40) {
                break;
            }
            System.out.println("Du har slået 2 ens, så du får en tur til");
            System.out.println("Tryk enter for at slå.");
            input.nextLine();
            terning.roll();
            System.out.println("Du har slået: " + terning.hentterning1() + " og " + terning.hentterning2() + " i alt har du slået: " + terning.henttotal());
            currentPlayer.setPoint(currentPlayer.getPoint() + terning.henttotal());
            if(currentPlayer.getPoint() >= 40) {
                System.out.println(currentPlayer.getNavn() + " har nu: " + currentPlayer.getPoint() + " point");
                break;
            }
            if (terning.henttotal() == 2) {
                currentPlayer.setPoint(0);
                System.out.println("Fordi du har slået to 1'ere har du mistet alle dine point.");
            }
            System.out.println(currentPlayer.getNavn() + " har nu: " + currentPlayer.getPoint() + " point");
        }
    }

}
