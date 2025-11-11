package JAVA_APLIKAZIOA;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static final Scanner sc = new Scanner(System.in);

    /* KOLORAK TERMINALERAKO */

    public static final String BERDEA = "\u001B[32m";
    public static final String URDINA = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String HORIA = "\u001B[33m";
    public static final String reset = "\u001B[0m";
    public static final String GORRIA = "\u001B[31m";
    public static final String LARANJA = "\u001B[38;5;208m";

    public static void main(String[] args) {

        /* hemen hilabeteak gordetzeko arrayList bat sortuko dugu 0-tik */
        ArrayList<String> hilabeteak = new ArrayList<>();
        hilabeteak.add("0.Urtarrila");
        hilabeteak.add("1.Otsaila");
        hilabeteak.add("2.Martxoa");
        hilabeteak.add("3.Apirila");
        hilabeteak.add("4.Maiatza");
        hilabeteak.add("5.Ekaina");

        /* hau aretoak gordetzeko erabiliko dugu beste arrayList bat */
        ArrayList<String> areto = new ArrayList<String>();
        areto.add(0, null);
        areto.add("1. Umeen areto");
        areto.add("2. Superheroien areto");
        areto.add("3. Thriller areto");
        areto.add("4. Zientzia fikziozko areto");
        areto.add("5. Komedia areto");

        /* pelikula objektuak gordetzeko beste arrayList */

        ArrayList<pelikula> pelikulaLista = new ArrayList<>();
        pelikulaLista.add(objektuak.p1);
        pelikulaLista.add(objektuak.p2);
        pelikulaLista.add(objektuak.p3);
        pelikulaLista.add(objektuak.p4);
        pelikulaLista.add(objektuak.p5);
        pelikulaLista.add(objektuak.p6);
        pelikulaLista.add(objektuak.p7);
        pelikulaLista.add(objektuak.p8);
        pelikulaLista.add(objektuak.p9);
        pelikulaLista.add(objektuak.p10);
        pelikulaLista.add(objektuak.p11);
        pelikulaLista.add(objektuak.p12);

        /* kartelera objektua sortu */
        kartelera nireKartelera = new kartelera(pelikulaLista);
        pelikula azkenAukeratutakoPeli = null;

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
                    /* HILABETE AUKERATU */
                    System.out.println(BERDEA + "Aukeratu hilabete bat: " + hilabeteak + reset);
                    int aukhilabete = sc.nextInt();

                    /* ASTEBURU AUKERATU */
                    System.out.println(BERDEA + "Aukeratu " + aukhilabete + "-ren asteburu bat (1-5):" + reset);
                    int aukasteburua = sc.nextInt();

                    if (aukasteburua >= 6 || aukasteburua <= 0) {
                        System.out.println(GORRIA + "ERROREA: " + reset + "Sartutako asteburua ez da baliogarria");
                    } else {
                        /* ARETO AUKERATU */
                        System.out.println(BERDEA + "Aukeratu nahi duzun areto(1-5):" + reset);

                        for (int i = 1; i < areto.size(); i++) {

                            System.out.println(areto.get(i));
                        }

                        int aukareto = sc.nextInt();

                        System.out.println(LARANJA + "--AUKERATUTAKO GELAREN INFORMAZIOA--" + reset);

                        /*
                         * Aukeratutako zenbakiaren arabera orduan eta beste dokumentuan sortutako areto
                         * baten
                         * informazioa emango du, funztio baten bitartez, hau da, izena eta edukiera
                         * erakutsiko dira. 1
                         */

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
                                break;
                        }
                        /* LARUNBATA EDO IGANDEA AUKERATU */
                        System.out.println(BERDEA + "Aukeratu asteburuko egun bat(1.Larunbata edo 2.Igandea)" + reset);
                        int aukeguna = sc.nextInt();

                        /* TXANDA AUKERATU */
                        System.out.println(BERDEA + "Aukeratu txanda bat(1=Goiza, 2=Arratsaldea, 3=Gaua):" + reset);

                        int auktxanda = sc.nextInt();

                        /*
                         * hemen proiekzioa bilatu eta erakutsi egingo du eta gero sarrerakErosi()
                         * funtzioa exekutatuko da
                         */

                        proiekzioa aurkitutakoProiekzioa = nireKartelera.bilatuProiekzioa(aukhilabete, aukasteburua,
                                aukareto, aukeguna, auktxanda);

                        if (aurkitutakoProiekzioa != null) {
                            System.out.println(LARANJA + "\n---AURKITUTAKO PELIKULA---" + reset);

                            aurkitutakoProiekzioa.proiekzioInfo();

                            azkenAukeratutakoPeli = aurkitutakoProiekzioa.getPelikula();

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

                        }
                    }
                    break;
                case 2:

                    /*
                     * Hemen pelikulen informazioa azalduko da, pelikulen lista guztia eta gero
                     * pelikula baten informazioa ikusteko aukera agertuko da. Menuko lehenengo
                     * aukeran (hau da,pelikulen erosketa opzioan) aurretik pelikula bat aukeratu
                     * baldin badugu, pelikula horren informazioa azalduko da ere.
                     */
                    System.out.println(LARANJA + "---PELIKULEN INFORMAZIOA OROKORRA---" + reset);

                    System.out.println(BERDEA + "Hauek dira eskuragarri dauzkagun pelikulak:" + reset);

                    for (int i = 0; i < pelikulaLista.size(); i++) {
                        System.out.println(i + "." + pelikulaLista.get(i).izenaEman());
                    }

                    if (azkenAukeratutakoPeli != null) {
                        System.out.println("\n" + BERDEA + "--- AZKEN AUKERATUTAKO PELIKULA ---" + reset);
                        azkenAukeratutakoPeli.erakutsiInfo();
                        System.out.println(BERDEA + "------------------------" + reset);
                    }

                    System.out.println(BERDEA + "Aukeratu pelikula bat bere informazioa ikusteko (0-"
                            + (pelikulaLista.size() - 1) + "):" + reset);
                    int infoaukerazenb = sc.nextInt();

                    if (infoaukerazenb >= 0 && infoaukerazenb < pelikulaLista.size()) {
                        pelikula infoAukeraPeli = pelikulaLista.get(infoaukerazenb);
                        infoAukeraPeli.erakutsiInfo();
                    } else {
                        System.out.println(GORRIA + "Aukera okerra." + reset);
                    }
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

                    System.out
                            .println(URDINA + "Eskerrikasko gure zerbitzua aukeratzeagatik. Agur!" + reset);
                    System.exit(0);
            }
        }
    }

    public static void sarrerakErosi() {

        /*
         * funtzio hau erabiliko dugu aurreko kodigoan espazioa aurresteko eta hemen
         * bertan agertuko da pelikulen sarrerak erosteko kodigoa.
         */

        System.out.println(LARANJA + "---SARRERAK EROSI---" + reset);

        System.out.println(LARANJA
                + "Behan sartu nahi dituzun sarrera kopuruak, badaezpada, hemen dituzu sarrera bakoitzaren prezioa: ");

        /*PREZIOAK KALKULUA*/ 

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

        double preziotot = (heldukop * 8.40) + (nagusikop * 5.40);
        int sarrerakoptot = umekop + heldukop + nagusikop;
        int koderandom = (int) (Math.random() * 9000) + 1000;

        /* ESKERRIKASKO MEZUA*/
        if (sarrerakoptot <= 4) {

            System.out.println(URDINA
                    + "Eskerrikasko gurekin erosteagatik! Hau da zure erosketaren prezio totala: "
                    + HORIA + preziotot + "$." + LARANJA + " Zure erosketa kodea honakoa da: "
                    + HORIA + koderandom + reset);

        } else {

            System.out.println(GORRIA +
                    "Error: ezin dira 4 sarrera baino gehiago erosi.Mesedez sahiatu berriro." + reset);

        }
    }

}
