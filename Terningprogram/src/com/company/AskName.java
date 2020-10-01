package com.company;
import java.util.Scanner;
/*
Vi har derudover skabt en navngivningsklasse med den intention at vi kan navngive alle spillere ligemeget antallet af
disse.

I dette tilfælde benytter vi vores set-funktion.
 */
public class AskName {
    Scanner input = new Scanner(System.in);


    public void askName(Spiller currentPlayer){
        currentPlayer.setNavn(input.nextLine());
        }
    }
