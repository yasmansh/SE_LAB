package Prototype;

import org.junit.Test;
import org.junit.Assert;

public class TestPrototype {
    @Test
    public void TestPrototypeForIranian() {
        Student a = Prototype.getStudent("Iranian");
        Assert.assertEquals(a.studentNationality, "Iranian");
        System.out.println("CarBuilder First Test: Passed");

    }

    @Test
    public void TestPrototypeForJapanese() {
        Student a = Prototype.getStudent("Japanese");
        Assert.assertEquals(a.studentNationality, "Japanese");
        System.out.println("CarBuilder Second Test: Passed");

    }
}


