package com.company;
import java.util.Scanner;

public class AskName {
    Scanner input = new Scanner(System.in);


    public void askName(Spiller currentPlayer){
        currentPlayer.setNavn(input.nextLine());
        }
    }
