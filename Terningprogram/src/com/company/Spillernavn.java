package com.company;
import java.util.Scanner;

public class Spillernavn {
    Scanner input = new Scanner(System.in);
    Spiller spiller1 = new Spiller();
    Spiller spiller2 = new Spiller();


    public void spillernavn () {
        askName();
    }
    public void askName(){

        System.out.println("Indtast spiller 1's navn.");
        spiller1.setNavn(input.nextLine());
        System.out.println("Spiller 1 er " + spiller1.getNavn());

        System.out.println("Indtast spiller 2's navn.");
        spiller2.setNavn(input.nextLine());
        System.out.println("Spiller 2 er " + spiller2.getNavn());

        }
    }
