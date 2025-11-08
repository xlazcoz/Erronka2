package JAVA_APLIKAZIOA;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java {
    public static final Scanner sc = new Scanner(System.in);

    public static final String BERDEA = "\u001B[32m";
    public static final String URDINA = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String HORIA = "\u001B[33m";
    public static final String reset = "\u001B[0m";
    public static final String GORRIA = "\u001B[31m";
    public static final String LARANJA = "\u001B[38;5;208m";

    public static void main(String[] args) {

        ArrayList<String> hilabeteak = new ArrayList<>();

        hilabeteak.add("Urtarrila");
        hilabeteak.add("Otsaila");
        hilabeteak.add("Martxoa");
        hilabeteak.add("Apirila");
        hilabeteak.add("Maiatza");
        hilabeteak.add("Ekaina");
        hilabeteak.add("Uztaila");
        hilabeteak.add("Abuztua");
        hilabeteak.add("Iraila");
        hilabeteak.add("Urria");
        hilabeteak.add("Azaroa");
        hilabeteak.add("Abendua");

        ArrayList<String> areto = new ArrayList<String>();
        areto.add(0, null);
        areto.add("1. Umeen areto");
        areto.add("2. Superheroien areto");
        areto.add("3. Thriller areto");
        areto.add("4. Zientzia fikziozko areto");
        areto.add("5. Komedia areto");

        ArrayList<pelikula> pelikulak = new ArrayList<>();
        pelikulak.add(objektuak.p1);
        pelikulak.add(objektuak.p2);
        pelikulak.add(objektuak.p3);
        pelikulak.add(objektuak.p4);
        pelikulak.add(objektuak.p5);
        pelikulak.add(objektuak.p6);
        pelikulak.add(objektuak.p7);
        pelikulak.add(objektuak.p8);
        pelikulak.add(objektuak.p9);
        pelikulak.add(objektuak.p10);
        pelikulak.add(objektuak.p11);
        pelikulak.add(objektuak.p12);
        while (true) {

            System.out.println(MAGENTA + "Ongi etorri Zinema Usurbilera!" + reset);

            System.out.println(BERDEA + "Aukeratu hauetako opzio bat:" + reset);
            System.out.println("1. Pelikulen erosketa");
            System.out.println("2. Pelikulen informazioa orokorra");
            System.out.println("3. Kokapena");
            System.out.println("4. Irekiera ordutegia");
            System.out.println("5. Programa bukatu");
            int aukMenua = sc.nextInt();

            switch (aukMenua) {
                case 1:
                    System.out.println(LARANJA + "---PELIKULEN EROSKETA---" + reset);
                    sc.nextLine();
                    // HILABETE AUKERATU
                    System.out.println(BERDEA + "Aukeratu hilabete bat: " + hilabeteak + reset);
                    String hilabete = sc.nextLine();

                    // ASTEBURU AUKERATU
                    System.out.println(BERDEA + "Aukeratu " + hilabete + "-ren asteburu bat (1-5):" + reset);
                    int asteburua = sc.nextInt();

                    if (asteburua >= 6 || asteburua <= 0) {
                        System.out.println(GORRIA + "ERROREA: " + reset + "Sartutako asteburua ez da baliogarria");
                    } else {
                        // ARETO AUKERATU
                        System.out.println(BERDEA + "Aukeratu nahi duzun areto(1-5):" + reset);
                        for (int i = 1; i < 6; i++) {

                            System.out.println(areto.get(i));
                        }

                        int aukareto = sc.nextInt();

                        System.out.println(LARANJA + "--AUKERATUTAKO GELAREN INFORMAZIOA--" + reset);

                        // Depende zer zenbaki aukeratu orduan beste dokumentuan sortutako areto baten
                        // informazioa emango du, funztio baten bitartez, hau da, izena eta edukiera
                        // erakutsiko dira. 1

                        switch (aukareto) {
                            case 1:
                                objektuak.g1.aretoInfo();
                                break;
                            case 2:
                                objektuak.g2.aretoInfo();
                                break;
                            case 3:
                                objektuak.g3.aretoInfo();
                                break;
                            case 4:
                                objektuak.g4.aretoInfo();
                                break;
                            case 5:
                                objektuak.g5.aretoInfo();
                                break;
                            default:
                                System.out.println("Ez du balio ");
                        }
                        // LARUNBATA EDO IGANDEA AUKERATU
                        System.out.println(BERDEA + "Aukeratu asteburuko egun bat(1.Larunbata edo 2.Igandea)" + reset);
                        int eguna = sc.nextInt();

                        // pelikula arrayList-aren objetuak lekuz mugitu eta gero atera diren horien
                        // izenak imprimitu 0-tik 3-ra
                        switch (eguna) {
                            case 1:
                                System.out.println(LARANJA + "Hauek dira Larunbateko pelikulak:" + reset);
                                Collections.shuffle(pelikulak);
                                List<pelikula> emaitza1 = pelikulak.subList(0, 4);

                                for (int i = 0; i < emaitza1.size(); i++) {

                                    System.out.println(i + "." + emaitza1.get(i).izenaEman());

                                }

                                // PELIKULA AUKERATU

                                System.out.println(BERDEA
                                        + "Mesedez aukeratu hauetako pelikula bat haren informazioa ikusteko eta sarrerak erosteko(0-4) "
                                        + reset);

                                int aukpeli = sc.nextInt();

                                if (aukpeli >= 0 || aukpeli <= 3) {

                                    pelikula aukeratutakoPeli = emaitza1.get(aukpeli);

                                    aukeratutakoPeli.erakutsiInfo();

                                }

                                System.out.println(HORIA
                                        + "Baina jarraitu baino lehen, seguru zaude sarrerak erosi nahi dituzula?"
                                        + reset);
                                System.out.println(BERDEA + "BAI/" + GORRIA + "EZ" + reset);
                                sc.nextLine();
                                String baiez1 = sc.nextLine();

                                if (baiez1.contains("BAI")) {

                                    sarrerakErosi();
                                    break;
                                } else {

                                    break;
                                }

                            case 2:
                                System.out.println("Hauek dira Igandeko pelikulak:");
                                Collections.shuffle(pelikulak);
                                List<pelikula> emaitza2 = pelikulak.subList(0, 4);

                                for (int i = 0; i < emaitza2.size(); i++) {

                                    System.out.println(i + "." + emaitza2.get(i).izenaEman());

                                }

                                // PELIKULA AUKERATU

                                System.out.println(BERDEA
                                        + "Mesedez aukeratu hauetako pelikula bat haren informazioa ikusteko eta sarrerak erosteko "
                                        + reset);
                                int aukpeli2 = sc.nextInt();

                                if (aukpeli2 >= 0 || aukpeli2 <= 3) {

                                    pelikula aukeratutakoPeli = emaitza2.get(aukpeli2);

                                    aukeratutakoPeli.erakutsiInfo();

                                }

                                System.out.println(HORIA
                                        + "Baina jarraitu baino lehen, seguru zaude sarrerak erosi nahi dituzula?"
                                        + reset);
                                System.out.println(BERDEA + "BAI/" + GORRIA + "EZ" + reset);
                                sc.nextLine();
                                String baiez2 = sc.nextLine();

                                if (baiez2.contains("BAI")) {

                                    sarrerakErosi();

                                } else {

                                    break;
                                }

                                break;
                            default:
                                System.out.println(
                                        GORRIA + "ERROREA: " + reset + "Sartutako eguna ez da baliogarria");
                        }

                    }
                    break;
                case 2:
                    System.out.println(LARANJA + "---PELIKULEN INFORMAZIOA OROKORRA---" + reset);
                    System.out.println(BERDEA+"Hauek dira eskuragarri daukagun pelikulak:" +reset);

                    for (int i=0; i<pelikulak.size();i++){

                        System.out.println(i+"."+pelikulak.get(i).izenaEman());

                    }


                    System.out.println(BERDEA+"Aukeratu pelikula bat bere informazioa ikusteko:"+reset);

                    int infoaukerazenb= sc.nextInt();

                    pelikula infoAukeraPeli= pelikulak.get(infoaukerazenb);

                    infoAukeraPeli.erakutsiInfo();

                    break;
                case 3:
                    System.out.println(LARANJA + "---KOKAPENA---" + reset);
                    System.out.println(BERDEA + "De Etarte Bidea, 20160 Zubieta, Gipuzkoa" + reset);
                    break;
                case 4:
                    System.out.println(LARANJA + "---ORDUTEGIA---" + reset);
                    System.out.println("Larunbatak: " + HORIA + "10:00-21:00. " + reset +
                            "Igandeak: " + HORIA + "8:00-14:00, 16:00-23:00." + reset);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public static void sarrerakErosi() {

        System.out.println(LARANJA + "---SARRERAK EROSI---" + reset);

        System.out.println(LARANJA
                + "Behan sartu nahi dituzun sarrera kopuruak, badaezpada, hemen dituzu sarrera bakoitzaren prezioa: ");

        // PREZIOAK KALKULUA

        System.out.println(MAGENTA + "---Prezioak---");
        System.out.println(LARANJA + "Zinemako sarreraren prezioak honakoak dira:" + reset);
        System.out.println(LARANJA + "5 urtetik beherako umeek:" + HORIA + " DOAIN" + reset);
        System.out.println(LARANJA + "Gazte/Helduak:" + HORIA + " 8,40$" + reset);
        System.out.println(LARANJA + "Nagusiak(+65)" + HORIA + " 5,40$" + reset);

        System.out.println(BERDEA + "Sartu umeen kop:" + reset);

        int umekop = sc.nextInt();

        System.out.println(BERDEA + "Sartu gazte/heldu kop:" + reset);

        int heldukop = sc.nextInt();

        System.out.println(BERDEA + "Sartu nagusi kop:" + reset);

        int nagusikop = sc.nextInt();

        double preziotot = +(heldukop * 8.40) + (nagusikop * 5.40);
        int sarrerakoptot = umekop + heldukop + nagusikop;
        int koderandom = (int) (Math.random() * 9000) + 1000;

        // ESKERRIKASKO MEZUA
        if (sarrerakoptot <= 4) {

            System.out.println(URDINA
                    + "Eskerrikasko gurekin erosteagatik! Hau da zure erosketaren prezio totala: "
                    + HORIA + preziotot + "$." + LARANJA + " Zure erosketa kodea honakoa da: "
                    + HORIA + koderandom + reset);

        } else {

            System.out.println(GORRIA +
                    "Error: ezin dira 4 sarrera baino gehiago erosi.Mesedez sahiatu berriro.");

        }
    }

}
