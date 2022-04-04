package S104N1Ex1;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;


class MainTest {

    @Test
    void checkLength() {
        Months months = new Months();
        assertEquals(months.getSize(),12);
    }

    @Test
    void noNullArrayList() {
        Months months = new Months();
        assertNotNull(months.getList());
    }

    @Test
    void augustPosition() {
        Months months = new Months();
        assertEquals(months.getElement(7),"August");
    }

}