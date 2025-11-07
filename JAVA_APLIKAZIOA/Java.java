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

        ArrayList<String> aretoa = new ArrayList<String>();
        aretoa.add("1. Umeen aretoa");
        aretoa.add("2. Superheroien aretoa");
        aretoa.add("3. Thriller aretoa");
        aretoa.add("4. Zientzia fikziozko aretoa");
        aretoa.add("5. Komedia aretoa");

        ArrayList<String> pelikulak = new ArrayList<>();
        pelikulak.add("Maspalomas");
        pelikulak.add("Chainsaw Man");
        pelikulak.add("Crepúsculo");
        pelikulak.add("Springsteen");
        pelikulak.add("La Casa De Muñecas");
        pelikulak.add("Guerreras Kpop");
        pelikulak.add("Tom Y Jerry");
        pelikulak.add("Tron: Ares");
        pelikulak.add("El Cautivo");
        pelikulak.add("Caza De Brujas");
        pelikulak.add("Exit 8");
        pelikulak.add("A Pesar De Ti");

        System.out.println(MAGENTA + "Ongi etorri Zinema Usurbilera!" + reset);

        System.out.println("Aukeratu hauetako opzio bat:");
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
                System.out.println("Aukeratu hilabete bat: " + hilabeteak);
                String hilabete = sc.nextLine();

                System.out.println("Aukeratu " + hilabete + "-ren asteburu bat (1-5)");

                int asteburua = sc.nextInt();

                if (asteburua >= 6 || asteburua <= 0) {
                    System.out.println(GORRIA + "ERROREA: " + reset + "Sartutako asteburua ez da baliogarria");
                } else {
                    System.out.println("Aukeratu asteburuko egun bat(1.Larunbata edo 2.Igandea)");
                    int eguna = sc.nextInt();
                    switch (eguna) {
                        case 1:
                            System.out.println("Hauek dira Larunbateko pelikulak:");
                            Collections.shuffle(pelikulak);
                            List<String> emaitza1 = pelikulak.subList(0, 4);
                            for (String pelikulenIzenak : emaitza1) {
                                System.out.println(pelikulenIzenak);
                            }
                            break;
                        case 2:
                            System.out.println("Hauek dira Igandeko pelikulak:");
                            Collections.shuffle(pelikulak);
                            List<String> emaitza2 = pelikulak.subList(0, 4);
                            for (String pelikulenIzenak : emaitza2) {
                                System.out.println(pelikulenIzenak);
                            }
                            break;
                        default:
                            System.out.println(GORRIA + "ERROREA: " + reset + "Sartutako eguna ez da baliogarria");
                    }
                }
                break;
            case 2:
                System.out.println(LARANJA + "---PELIKULEN INFORMAZIOA OROKORRA---" + reset);
                System.out.println("Aukeratu pelikula bat bere informazioa ikusteko:" + pelikulak);
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
        }
    }
}
