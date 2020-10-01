package com.company;
/*
Vi benytter skaber PrintRegler-klassen for at give en nem overflade til at forklare hvordan spillet spilles.
Derfor vil det være nemt at tilføje og fjerne eventuelle forklaringer og regler.
 */
public class PrintRegler {
    public void printRegler() {
        System.out.println("Du vinder når du får 40 point");
        System.out.println("Hvis du slår to 1'er, mister du alle point");
        System.out.println("Hvis du slår to ens, får du en ekstra tur");

    }
}