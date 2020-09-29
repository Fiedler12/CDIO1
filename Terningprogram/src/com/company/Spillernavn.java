package com.company;
import java.util.Scanner;

public class Spillernavn {
    Scanner input = new Scanner(System.in);
    spiller1 = new Spiller();
    spiller2 = new Spiller();

    public void spillernavn () {
        askName(Spiller);
    }
    public void askName (Spiller currentPlayer){

        System.out.println("Indtast spiller 1's navn.");
        currentPlayer.setNavn(input.nextLine());
        System.out.println("Spiller 1 er " + currentPlayer.getNavn());

        System.out.println("Indtast spiller 2's navn.");
        currentPlayer.setNavn(input.nextLine());
        System.out.println("Spiller 2 er " + currentPlayer.getNavn());

        }
    }
