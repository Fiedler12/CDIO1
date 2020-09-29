package com.company;
public class Terning {
// modificeres så der kun er en terning
    int terning1;  //Første terning
    int terning2;  // Anden terning

    public Terning (){   //roll funktion
        roll();

    }

    public void roll(){  //Hvad skal denne roll funktion gøre?
        terning1 = (int)(Math.random()*6+1);
        terning2 = (int)(Math.random()*6+1);

    }
    public int hentterning1() {
        return terning1;

    }
    public int hentterning2() {
        return terning2;

    }
    public int henttotal() {
        return terning1 + terning2;
    }
}
