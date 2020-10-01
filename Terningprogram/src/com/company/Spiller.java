package com.company;
//Spillernavn skal herind!
//Det er ikke et objekt men derimod en attribut vi giver spilleren!
public class Spiller {
    int point;
    String navn;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
