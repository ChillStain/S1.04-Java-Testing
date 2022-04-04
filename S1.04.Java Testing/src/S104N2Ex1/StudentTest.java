package S104N2Ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void studentsAreEqual(){
        Student actualStudent = new Student();
        actualStudent.setName("Charlie");
        actualStudent.getLastName("Chin");

        Student expectedStudent = new Student();
        expectedStudent.setName("Charlie");
        expectedStudent.setLastName("Chin");

    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }
}