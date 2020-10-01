package com.company;
/* Vi starter vores program med at definerer objekter. I denne klasse definerer vi vores spillerklasse.
Først vil vi definere hvad vores spiller skal indeholde. Vi finder at en spiller indeholder to ting:
En spiller skal tilknyttes en værdi eller de point som spilleren har.
Derfor opretter vi en int som vi kalder point.
Dernæst finder vi at vores spillere også skal have et navn. Derfor opretter vi en String som vi kalder navn.
Derefter benytter vi "getter setter" funktionen som opretter to forskellige metoder til både vores int og vores String.
getNavn-metoden giver os muligheden for at indhente spillerens navn i vores andre klasser.
setNavn-metoden giver os muligheden for at definere en værdi.
Det samme kan siges om vores int point.

 */
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
