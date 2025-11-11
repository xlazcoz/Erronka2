package JAVA_APLIKAZIOA;

import static org.junit.Assert.*;
import org.junit.Test;


public class javatest {

    @Test

    public void izenaEmanTest() {
      
        pelikula peli = new pelikula("Maspalomas", "Drama", 115);
        
        assertEquals("Maspalomas", peli.izenaEman());
      
    }
    public void proiekzioInfo(){



        proiekzioa proiekzioBerria = new proiekzioa(1, 2, 3, 1, objektuak.p1, 2);
        assertEquals(1, proiekzioBerria.hilabetea_k);
        assertEquals(2, proiekzioBerria.astea_k);

    }

   
    

    
}
