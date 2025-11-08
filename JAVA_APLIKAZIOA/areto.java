package JAVA_APLIKAZIOA;

public class areto {

    private String izena;
    private int edukiera;

    public areto(String izena, int edukiera) {

        this.izena = izena;
        this.edukiera = edukiera;
    }

    public void aretoInfo() {

        System.out.println("Izena: " + izena);
        System.out.println("Edukiera: " + edukiera + " pertsona.");

    }
}
