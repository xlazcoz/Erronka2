package JAVA_APLIKAZIOA;


import java.util.Scanner;
import java.util.ArrayList;

public class Java {
    public static final Scanner sc = new Scanner(System.in);

    public static final String BERDEA = "\u001B[32m";
    public static final String URDINA = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String HORIA = "\u001B[33m";
    public static final String reset = "\u001B[0m";
    public static final String GORRIA = "\u001B[31m";
    public static final String LARANJA = "\u001B[38;5;208m";

    public static final ArrayList<String> aukeratutakopeli = new ArrayList<>();
    public static final ArrayList<String> aukeratutakogela = new ArrayList<>();
    public static final ArrayList<String> aukeratutakoeguna = new ArrayList<>();

    public static void main(String[] args) {


        String[] egunak = { "1.Astelehena", "2.Asteartea", "3.Asteazkena", "4.Osteguna", "5.Ostirala", "6.Larunbata", };
        String[] gelak = { "1.Umeen gela", "2.Superheroien gela", "3.Thriller gela", "4.Zientzia fikziozko gela",
                "5.Komedia gela" };
        String[] pelikulak = { "1.Lilo y Stitch", "2.Una película de Minecraft", "3.Mufasa: El rey león",
                "4.Cómo entrenar a tu dragón", "5.Capitán América: Brave New World", "6.Conclave",
                "7.Sonic 3: La película", "8.Misión: Imposible. Sentencia Final", "9.Blancanieves",
                "10.Thunderbolt", "11.Padre no hay más que uno 5", "12.Wolfgang (Extraordinario)", "13.El casoplón",
                "14.Un funeral de locos", "15.Sirat" };

        while (true) {

            System.out.println(MAGENTA + "---MENUA---" + reset);

            // MENUA//
            System.out.println(BERDEA
                    + "Ongi etorri ZinemaUsurbil-ko aplikaziora, mesedez hauetako bat aukeratu zenbakia ipiniz:");
            System.out.println(URDINA + "1.Aste eguna");
            System.out.println("2.Kokapena");
            System.out.println("3.Irekiera ordutegia");
            System.out.println("4.Informazio orokorra");
            System.out.println("5.Irten" + reset);
            int aukera1 = sc.nextInt();

            // ASTE EGUNA AUKERA//
            switch (aukera1) {
                case 1:
                    System.out.println(LARANJA + "Mesedez aste eguna aukeratu:" + reset);

                    for (int i = 0; i < egunak.length; i++) {

                        System.out.println(URDINA + egunak[i] + reset);

                    }

                    int eguna = sc.nextInt();

                    aukeratutakoeguna.add(egunak[eguna - 1]);

                    System.out.println(HORIA + "Gelak eta pelikulak ikusi nahi dituzu sarrerak erosteko?" + reset);
                    System.out.println(BERDEA + "1.BAI");
                    System.out.println(GORRIA + "2.EZ" + reset);

                    sc.nextLine();
                    String baiez = sc.nextLine();

                    if (baiez.contains("BAI")) {

                        // GELAK AUKERATU//

                        System.out.println(LARANJA + "Mesedez gela aukeratu:" + reset);

                        for (int i = 0; i < gelak.length; i++) {

                            System.out.println(URDINA + gelak[i] + reset);

                        }

                        int aukgela = sc.nextInt();
                        aukeratutakogela.add(gelak[aukgela - 1]);

                        switch (aukgela) {

                            // UMEEN GELA//
                            case 1:
                                System.out.println(MAGENTA + "---UMEEN GELA---");

                                System.out.println(LARANJA
                                        + "Gela honetan pelikula hauek daude,mesedez bat aukeratu(zenbakia idatziz):");

                                for (int i = 0; i < 4; i++) {

                                    System.out.println(URDINA + pelikulak[i] + reset);
                                }

                                int aukpeli1 = sc.nextInt();

                                aukeratutakopeli.add(pelikulak[aukpeli1 - 1]);

                                // SARRERAK EROSI//

                                sarrerakerosi();

                                break;

                            // SUPERHEROIEN GELA//

                            case 2:

                                System.out.println(MAGENTA + "---SUPERHEROIEN GELA---");

                                System.out.println(LARANJA
                                        + "Gela honetan pelikula hauek daude,mesedez bat aukeratu(zenbakia idatziz):");

                                System.out.println(URDINA + pelikulak[4] + reset);
                                System.out.println(URDINA + pelikulak[9] + reset);
                                System.out.println(URDINA + pelikulak[6] + reset);

                                int aukpeli2 = sc.nextInt();

                                aukeratutakopeli.add(pelikulak[aukpeli2 - 1]);
                                // SARRERAK EROSI//

                                  sarrerakerosi();



                                break;

                            case 3:
                                System.out.println(MAGENTA + "---THRILLER GELA---");

                                System.out.println(LARANJA
                                        + "Gela honetan pelikula hauek daude,mesedez bat aukeratu(zenbakia idatziz):");

                                System.out.println(URDINA + pelikulak[5] + reset);
                                System.out.println(URDINA + pelikulak[7] + reset);
                                System.out.println(URDINA + pelikulak[9] + reset);
                                System.out.println(URDINA + pelikulak[14] + reset);

                                int aukpeli3 = sc.nextInt();

                                aukeratutakopeli.add(pelikulak[aukpeli3 - 1]);

                                // SARRERAK EROSI//
                                  sarrerakerosi();

                                break;

                            case 4:
                                System.out.println(MAGENTA + "---ZIENTZIA FIKZIOZKO GELA---");

                                System.out.println(LARANJA
                                        + "Gela honetan pelikula hauek daude,mesedez bat aukeratu(zenbakia idatziz):");

                                System.out.println(URDINA + pelikulak[8] + reset);
                                System.out.println(URDINA + pelikulak[11] + reset);

                                int aukpeli4 = sc.nextInt();

                                aukeratutakopeli.add(pelikulak[aukpeli4 - 1]);

                                // SARRERAK EROSI//
                                sarrerakerosi();

                                break;

                            case 5:
                                System.out.println(MAGENTA + "---KOMEDIA GELA---");

                                System.out.println(LARANJA
                                        + "Gela honetan pelikula hauek daude,mesedez bat aukeratu(zenbakia idatziz):");

                                System.out.println(URDINA + pelikulak[10] + reset);
                                System.out.println(URDINA + pelikulak[12] + reset);
                                System.out.println(URDINA + pelikulak[13] + reset);

                                int aukpeli5 = sc.nextInt();

                                aukeratutakopeli.add(pelikulak[aukpeli5 - 1]);

                                // SARRERAK EROSI//
                                sarrerakerosi();

                                break;

                        }

                    }

                    else if (baiez.contains("EZ")) {

                        break;

                    }

                    break;

                case 2:

                    // KOKAPENA//
                    System.out.println(MAGENTA + "---KOKAPENA---" + reset);

                    System.out.println(LARANJA
                            + "Gure zinema Usurbilen kokatuta dago bereziki, Kale Nagusia 12n. Eroso irits zaitezke trenez, autobusez edo autoz (aparkalekua dago).  "
                            + reset);

                    break;

                // ORDUTEGIA//
                case 3:
                    System.out.println(MAGENTA + "---ORDUTEGIA---" + reset);

                    System.out.println(LARANJA + "Hau da gure zinemako ordutegia:" + reset);
                    System.out.println(URDINA + "Astelenetik-Ostiralera:" + HORIA + "10:00 am" + reset);
                    System.out.println(URDINA + "Larunbatak:" + HORIA + "11:30 am" + reset);
                    System.out.println(URDINA + "Igandeak:" + HORIA + "ITXITA" + reset);

                    break;
                // INFORMAZIO OROKORRA//
                case 4:
                    System.out.println(MAGENTA + "---INFORMAZIO OROKORRA---" + reset);

                    System.out.println(LARANJA + "Gure zineman " + pelikulak.length
                            + " pelikula eskuragarri ditugu momentu honetan eta " + gelak.length
                            + " gela daude aukeratzeko. Galdera bat izanez gero edo kexa bat jarri nahi baduzu telefono honera deitu mesedez:"
                            + HORIA + "+34 943 12 34 56" + reset);

                    System.out.println(LARANJA + "Zinemako sarreraren prezioak honakoak dira:" + reset);
                    System.out.println(LARANJA + "5 urtetik beherako umeek:" + HORIA + " DOAIN" + reset);
                    System.out.println(LARANJA + "Gazte/Helduak:" + HORIA + " 8,40€" + reset);
                    System.out.println(LARANJA + "Nagusiak(+65)" + HORIA + " 5,40€" + reset);

                    break;
                // IRTETZEKO AUKERA//
                case 5:

                    System.out.println(MAGENTA + "---IRTEN---" + reset);

                    System.out.println(HORIA + "KONTUZ:" + LARANJA + " Seguru zaude aplikaziotik atera nahi duzula?");

                    System.out.println(BERDEA + "1.BAI");
                    System.out.println(GORRIA + "2.EZ" + reset);

                    sc.nextLine();

                    String irten = sc.nextLine();

                    if (irten.contains("BAI")) {

                        System.exit(0);

                    }

                    else if (irten.contains("EZ")) {

                        break;
                    }
                    break;

            }

        }

    }

    public static void sarrerakerosi() {

        System.out.println(MAGENTA + "---SARRERAK EROSI---");

        System.out.println(LARANJA
                + "Behan sartu nahi dituzun sarrera kopuruak, badaezpada, hemen dituzu sarrera bakoitzaren prezioa: ");

        // PREZIOAK KALKULUA//

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

        // ESKERRIKASKO MEZUA//
        if (sarrerakoptot <= 4) {

            System.out.println(URDINA
                    + "Eskerrikasko gurekin erosteagatik! Hau da zure erosketaren prezio totala: "
                    + HORIA + preziotot + "$." + LARANJA + " Zure kodea honakoa da: "
                    + HORIA + koderandom + reset);

            for (String p : aukeratutakopeli) {
                System.out.println(BERDEA + "Aukeratutako pelikula hau da: " + HORIA + p + reset);

            }
            for (String g : aukeratutakogela) {
                System.out.println(BERDEA + "Aukeratutako gela hau da: " + HORIA + g + reset);

            }
            for (String e : aukeratutakoeguna) {
                System.out.println(BERDEA + "Aukeratutako eguna hau da: " + HORIA + e + reset);

            }
            System.exit(0);

        } else {

            System.out.println(GORRIA +
                    "Error: ezin dira 4 sarrera baino gehiago erosi.Mesedez sahiatu berriro.");
            aukeratutakopeli.clear();
            aukeratutakogela.clear();
            aukeratutakoeguna.clear();
        }

    }

}
