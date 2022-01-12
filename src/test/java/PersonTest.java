import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void nameShouldNotBeChangedDuringCreation() {
        Person person = new Person(); //arrange
        String person1 = person.getName(); // act

        assertEquals("John", person1); // assert

    }

    @Test
    void ageShouldAddOneYear() {
        Person person = new Person(); // arrange
        person.setAge(18);

        person.age();

        int leeftijd = person.getAge(); // act

        assertEquals(19, leeftijd); //assert



    }


}