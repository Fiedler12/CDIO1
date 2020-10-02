package Test;

import com.company.Terning;

public class Terningtest {

    public static void main(String[] args) {
        int t;
            Terning terning = new Terning();
            int to = 0;
            int tre = 0;
            int fire = 0;
            int fem = 0;
            int seks = 0;
            int syv = 0;
            int otte = 0;
            int ni = 0;
            int ti = 0;
            int elleve = 0;
            int tolv = 0;

                t = 0;
                while (t <= 1000) {
                    terning.roll();
                    t++;
                    switch (terning.henttotal()) {
                        case 2:
                            to++;
                            break;
                        case 3:
                            tre++;
                            break;
                        case 4:
                            fire++;
                            break;
                        case 5:
                            fem++;
                            break;
                        case 6:
                            seks++;
                            break;
                        case 7:
                            syv++;
                            break;
                        case 8:
                            otte++;
                            break;
                        case 9:
                            ni++;
                            break;
                        case 10:
                            ti++;
                            break;
                        case 11:
                            elleve++;
                            break;
                        case 12:
                            tolv++;
                            break;

                    }



                }
                System.out.println("To: " + to + " tre: " + tre + " fire: " + fire + " fem: " + fem + " seks: " + seks + " syv: " + syv + " otte: " + otte + " ni: " + ni + " ti: " + ti + " elleve: " + elleve + " tolv: " + tolv);

            }
        }

