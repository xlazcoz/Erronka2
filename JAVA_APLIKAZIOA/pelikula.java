package JAVA_APLIKAZIOA;

public class pelikula {

    private String izena;
    private String generoa;
    private int iraupena;

public pelikula(String izena, String generoa, int iraupena){

    this.izena=izena;
    this.generoa=generoa;
    this.iraupena=iraupena;
}

public void erakutsiInfo(){

        System.out.println("Izena: " + izena);
        System.out.println("Generoa: " + generoa);
        System.out.println("Iraupena: " + iraupena + " min");

}

public String izenaEman(){

   return izena;
}

}