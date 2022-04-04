package S104N1Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsTest {

    void checkOutOfBounds() {
        int []numbers = {0, 13, 21, 37, 42, 55, 69, 74, 81, 99};

        assertThrows(ArrayIndexOutOfBoundsException.class,() ->{
            int number = numbers[10];
        });

    }



    @Test
    void getIndex() {
    }
}