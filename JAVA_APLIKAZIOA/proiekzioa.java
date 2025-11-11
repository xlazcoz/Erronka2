package JAVA_APLIKAZIOA;

public class proiekzioa {

    /*proiekzioa klasea bere atributuekin  */

    public int hilabetea_k;
    public int astea_k;
    public int areto_k;
    public int eguna_k;
    public pelikula pelikulak_k;
    public int txanda_k;

    public proiekzioa(int hilabetea, int astea, int areto, int eguna, pelikula pelikulak, int txanda) {

        hilabetea_k = hilabetea;
        astea_k = astea;
        areto_k = areto;
        eguna_k = eguna;
        pelikulak_k = pelikulak;
        txanda_k = txanda;

    }

    public void proiekzioInfo() {

        System.out.println("Hilabetea: " + hilabetea_k);
        System.out.println("Asteburua: " + astea_k);
        System.out.println("Aretoa: " + areto_k);
        System.out.println("Eguna: " + (eguna_k == 1 ? "Larunbata" : "Igandea"));
        System.out.println("Txanda: " + (txanda_k == 1 ? "Goiza" : (txanda_k == 2 ? "Arratsaldea" : "Gaua")));
        System.out.println("--- PELIKULAREN INFORMAZIOA ---");
        pelikulak_k.erakutsiInfo();

    }

      public pelikula getPelikula() {
        return pelikulak_k;
    }

}
