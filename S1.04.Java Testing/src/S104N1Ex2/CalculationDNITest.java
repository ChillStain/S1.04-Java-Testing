package S104N1Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationDNITest {
    @Test
    void checkLetter(){
        CalculationDNI dni = new CalculationDNI(43185424);
        assertEquals(dni.getLetter(),"A");
    }

    @Test
    void getLetter() {
    }
}