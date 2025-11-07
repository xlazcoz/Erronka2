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
        
        hilabeteak.add("1.Urtarrila");
        hilabeteak.add("2.Otsaila");
        hilabeteak.add("3.Martxoa");
        hilabeteak.add("4.Apirila");
        hilabeteak.add("5.Maiatza");
        hilabeteak.add("6.Ekaina");
        hilabeteak.add("7.Uztaila");
        hilabeteak.add("8.Abuztua");
        hilabeteak.add("9.Iraila");
        hilabeteak.add("10.Urria");
        hilabeteak.add("11.Azaroa");
        hilabeteak.add("12.Abendua");

    
        System.out.println(MAGENTA + "Ongi etorri Zinema Usurbilera!" + reset);
        System.out.println("Aukeratu hilabete bat: "+hilabeteak);
        int hilabete = sc.nextInt();
      
        switch(hilabete){
            case 1:
            System.out.println("Aukeratu Urtarrilaren asteburu bat(1-4)");
            break;
            case 2:
            System.out.println("Aukeratu Otsailaren asteburu bat(1-5)");
            break;
            case 3:
            System.out.println("Aukeratu Martxoaren asteburu bat(1-5)");
            break;
            case 4:
            System.out.println("Aukeratu Apirilaren asteburu bat(1-5)");
            break;
            case 5:
            System.out.println("Aukeratu Maiatzaren asteburu bat(1-5)");
            break;
            case 6:
            System.out.println("Aukeratu Ekainaren asteburu bat(1-5)");
            break;
            case 7: 
            System.out.println("Aukeratu Uztailaren asteburu bat(1-5)");
            break;
            case 8: 
            System.out.println("Aukeratu Abuztuaren asteburu bat(1-5)");
            break;
            case 9:
            System.out.println("Aukeratu Irailaren asteburu bat(1-5)");
            break;
            case 10:
            System.out.println("Aukeratu Urriaren asteburu bat(1-5)");
            break;
            case 11:
            System.out.println("Aukeratu Azaraoaren asteburu bat(1-5)");
            break;
            case 12:
            System.out.println("Aukeratu Abenduaren asteburu bat(1-5)");
            break;
            default:
              System.out.println(GORRIA + "ERROREA: " + reset + "Sartutako hilabetea ez da baliogarria");

        }
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
