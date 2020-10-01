package com.company;
public class Terning {
/*
Vi opretter en ny klasse ved navn Terning.
Vi definerer disse terninger som værende af værdien int, da vi kun skal bruge hele tal.
Vi giver vores terninger en roll-metode. Når dette kaldes gives både terning1 og terning2 en tilfældig værdi
mellem 1 og 6.
Dernæst skaber vi tre funktioner der er relativt lige hinanden
Dette kalder vi for hentfunktioner som benyttes til at indhente de værdier der er kommet efter at benytte roll-
funktionen.
 */
    int terning1;  //Første terning
    int terning2;  // Anden terning

    public Terning (){   //roll funktion
        roll();

    }

    public void roll(){  //Hvad skal denne roll funktion gøre?
        terning1 = (int)(Math.random()*6+1);
        terning2 = (int)(Math.random()*6+1);

    }
    public int hentterning1() { //Giv et tal (resultat) for terning 1
        return terning1;

    }
    public int hentterning2() { //Giv et tal (resultat) for terning 2
        return terning2;

    }
    public int henttotal() { //Giv et resultat for de 2 terninger lagt sammen
        return terning1 + terning2;
    }
}
