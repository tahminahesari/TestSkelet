import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void nameShouldNotBeChangedDuringCreation() {
        Person person = new Person(); //arrange
        String person1 = person.getName(); // act

        assertEquals("John", person1); // assert

    }

    @Test
    void personWithoutNameShouldBeNamedJohn() {
        Person person = new Person(); // arrange
        assertEquals("John", person.getName());
    }


    @Test
    void ageShouldAddOneYear() {
        Person person = new Person(); // arrange
        person.setAge(18);

        person.age();

        int leeftijd = person.getAge(); // act

        assertEquals(19, leeftijd); //assert

    }

    @Test
    void lastNameShouldStartWithUpperCaseWhenLowercaseGiven() {
        Person person = new Person();
//        person.getLastName();
        assertEquals("Doe", person.getLastName());

    }

    @Test
    void givenAPartnerHasPartnerShouldReturnTrue() {
        // Class,
        Person person = new Person();
        Person person2 = new Person();
        person.setPartner(person2);

//        assertFalse(person.getPartner());
        assertEquals(true, person.getPartner());

    }

    @Test
    void childShouldBeAddedToList() {
        Person person = new Person();
        Person child1 = new Person("Dastan");
        person.addChild(child1);
        Person child2 = new Person("Darwin");
        person.addChild(child2);
        Person child3 = new Person("Dua");
        person.addChild(child3);
//        List<Person> bla;
//        bla.add(child1);
        assertEquals(3, person.getChildren().size());
        assertEquals(child1.getName(), person.getChildren().get(0).getName());
        assertEquals(child2.getName(), person.getChildren().get(1).getName());
        assertEquals(child3.getName(), person.getChildren().get(2).getName());
//        assertEquals(1, person.getChildren().size());
//        assertEquals(child.getName(), person.getChildren().get(0).getName());
    }

    @Test
    void childWithNonUniqueNameCannotBeAddedToList() {
        Person person = new Person();
        Person child4 = new Person("Henk");
        person.addChild(child4);
        Person child5 = new Person("Henk");
        person.addChild(child5);
        assertEquals(1, person.getChildren().size());

    }

    @Test
    void CheckOf2ChildrenOneWithCapitalLetterAndOneWithLowercase() {
        Person person = new Person();
        Person child6 = new Person("Lara");
        Person child7 = new Person("LARA");
        person.addChild(child6);
        person.addChild(child7);
        assertEquals(1, person.getChildren().size());
    }


//als ik iemand toevoeg met een lowercase voornaam en achternaam
    //wordt dat dan netjes omgezet naar een hoofdletter

    @Test
    void DoeMaarIetsAubZsm() {
//    Person person = new Person();
        Person deabak = new Person();
        deabak.setLastName("de jONG");
        assertEquals("De jong", deabak.getLastName());
    }

}