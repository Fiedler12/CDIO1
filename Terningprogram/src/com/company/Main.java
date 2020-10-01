package com.company;

public class Main {
    // Se Spiller.java
    static Spiller spiller1 = new Spiller();
    static Spiller spiller2 = new Spiller();
    //Se Tur.java
    static Tur tur = new Tur();
    //Se AskName.java
    static AskName name = new AskName();
    // Se PrintRegler.java
    static PrintRegler print = new PrintRegler();


    public static void main(String[] args) {
        //Vi starter spillet med at printe regler for at give en så brugervenlig oplevelse som muligt.
        print.printRegler();
        System.out.println("Skriv navnet på spiller 1.");
        name.askName(spiller1);
        System.out.println("Skriv navnet på spiller 2");
        name.askName(spiller2);
        // Rammerne for spillet skabes og ture bliver kørt så længe begge spillere har mindre en 40 point.
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
