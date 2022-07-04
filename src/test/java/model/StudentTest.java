package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void toStringPass(){
        // given
    Student kai=new Student("Kai","Voss");
    kai.setBirthYear(2005);
    kai.setCity("Kleinstadt");
    kai.setPostalCode("D-50555");
    kai.setStreet("Strassenname 14");

    // when

    String actual=kai.toString();

    // then
        Assertions.assertEquals(actual,"Name:Kai Voss Strasse:Strassenname 14 Postleitzahl D-50555 Stadt:Kleinstadt Geburtsjahr:2005");
    }

    @Test
    void studentEquals(){
        // given
        Student s1=new Student("A","B");
        Student s2=new Student("A","B");

        //when
        boolean actual= s1.equals(s2);
        //then
        Assertions.assertEquals(actual,true);
    }

    @Test
    void studentEqualsFail(){
        // given
        Student s1=new Student("A","B");
        Student s2=new Student("A","CB");

        //when
        boolean actual= s1.equals(s2);
        //then
        Assertions.assertEquals(actual,false);
    }


}