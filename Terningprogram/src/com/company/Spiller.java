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
    int point; //Point skal defineres som Int da det involverer hele tal
    String navn; //Navn skal defineres som String da det involverer tekst

    public String getNavn() {
        return navn;
    } //Her gør vi så når man skriver getNavn så får man det definerede Navn

    public void setNavn(String navn) {
        this.navn = navn;
    } //Her gør vi så når man skriver setNavn så definerer vi navnet

    public int getPoint() {
        return point;
    } //Når man skriver getPoint så viser den ens point

    public void setPoint(int point) {
        this.point = point;
    } //Når man skriver setPoint så opdaterer den værdien af ens point
}
