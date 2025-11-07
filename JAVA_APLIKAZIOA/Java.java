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

        System.out.println(MAGENTA + "Ongi etorri Zinema Usurbilera!" + reset);
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
                    // Array Listeko 3 pelikula aleatorioak aterako dira
                    break;
                case 2:
                    System.out.println("Hauek dira Igandeko pelikulak:");
                    // Array Listeko 3 pelikula aleatorioak aterako dira
                    break;
                default:
                    System.out.println(GORRIA + "ERROREA: " + reset + "Sartutako eguna ez da baliogarria");

            }
        }
    }
}
