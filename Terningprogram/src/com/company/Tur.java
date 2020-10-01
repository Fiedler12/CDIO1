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
