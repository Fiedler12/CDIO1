package com.company;
import java.util.Scanner;

public class Tur {
    Scanner input = new Scanner(System.in);
    Terning terning = new Terning();
    public void tur (Spiller currentPlayer){
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
    }

}
