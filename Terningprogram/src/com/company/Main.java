package com.company;

public class Main {
    static Spiller spiller1;
    static Spiller spiller2;
    static Tur tur = new Tur();
    static Spillernavn navn = new Spillernavn();


    public static void main(String[] args) {
        spiller1 = new Spiller();
        spiller2 = new Spiller();
        navn.askName(currentPlayer);







        while (spiller1.getPoint() < 40 && spiller2.getPoint() < 40) {
            tur.tur(spiller1);
            tur.tur(spiller2);
        }
    }

}
