package JAVA_APLIKAZIOA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class kartelera {

    /*kartelera klasea proiekzioak gordetzeko eta bilatzeko erabiliko duguna */

    HashMap<String, proiekzioa> karteleraMap = new HashMap<>();

    public kartelera(ArrayList<pelikula> pelikulak) {
        Collections.shuffle(pelikulak);
        int pelikulaZenbat = 0;

        for (int hilaaa = 0; hilaaa <= 7; hilaaa++) {

            for (int asteee = 0; asteee <= 5; asteee++) {

                for (int arettt = 0; arettt <= 6; arettt++) {

                    for (int egunnn = 0; egunnn <= 2; egunnn++) {

                        for (int txandaaa = 0; txandaaa <= 3; txandaaa++) {

                            pelikula aukeratutakoPeli = pelikulak.get(pelikulaZenbat);

                            proiekzioa proiekzioBerria = new proiekzioa(hilaaa, asteee, arettt, egunnn,
                                    aukeratutakoPeli, txandaaa);

                            String kodea = hilaaa + "_" + asteee + "_" + arettt + "_" + egunnn + "_" + txandaaa;

                            karteleraMap.put(kodea, proiekzioBerria);

                            pelikulaZenbat++;

                            if (pelikulaZenbat >= pelikulak.size()) {
                                pelikulaZenbat = 0;
                            }

                        }

                    }

                }

            }

        }
    }

    public proiekzioa bilatuProiekzioa(int hilaaa, int asteee, int arettt, int egunnn, int txandaaa) {

        String kodea = hilaaa + "_" + asteee + "_" + arettt + "_" + egunnn + "_" + txandaaa;

        return karteleraMap.get(kodea);
    }
}
