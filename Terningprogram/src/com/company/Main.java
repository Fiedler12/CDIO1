package com.company;

public class Main {
    static Spiller spiller1 = new Spiller();
    static Spiller spiller2 = new Spiller();
    static Tur tur = new Tur();
    static AskName name = new AskName();
    static PrintRegler print = new PrintRegler();

    public static void main(String[] args) {
        print.printRegler();
        System.out.println("Skriv navnet på spiller 1.");
        name.askName(spiller1);
        System.out.println("Skriv navnet på spiller 2");
        name.askName(spiller2);

       while (spiller1.getPoint() < 40 && spiller2.getPoint() < 40) {
            tur.tur(spiller1);
            if (spiller1.getPoint() >= 40) {
                System.out.println("Tillykke " + spiller1.getNavn() + " du har vundet!");
                break;
            }
            tur.tur(spiller2);
        }
        if (spiller2.getPoint() >= 40) {
            System.out.println("Tillykke " + spiller2.getNavn() + " du har vundet!");
        }
    }
}
