package AbstractFactory;

import org.junit.Test;
import org.junit.Assert;


public class TestAbstractFactory {
    @Test
    public void TestCreateIranianGardenWithIranianTrees() {
        Garden garden = GardenCreator.creatGarden(GardenType.Tree, Location.Iranian);
        Assert.assertEquals(garden.getLocation(), Location.Iranian);
        Assert.assertEquals(garden.getModel(), GardenType.Tree);

        System.out.println("AbstractFactory First Test: Passed");
    }

    @Test
    public void TestCreateIranianGardenWithIranianFlowers() {
        Garden garden = GardenCreator.creatGarden(GardenType.Flower, Location.Iranian);
        Assert.assertEquals(garden.getLocation(), Location.Iranian);
        Assert.assertEquals(garden.getModel(), GardenType.Flower);
        System.out.println("AbstractFactory Second Test: Passed");
    }

    @Test
    public void TestCreateJapaneseGardenWithJapaneseTrees() {
        Garden garden = GardenCreator.creatGarden(GardenType.Tree, Location.Japanese);
        Assert.assertEquals(garden.getLocation(), Location.Japanese);
        Assert.assertEquals(garden.getModel(), GardenType.Tree);
        System.out.println("AbstractFactory Third Test: Passed");
    }

    @Test
    public void TestCreateJapaneseGardenWithJapaneseFlowers() {
        Garden garden = GardenCreator.creatGarden(GardenType.Flower, Location.Japanese);
        Assert.assertEquals(garden.getLocation(), Location.Japanese);
        Assert.assertEquals(garden.getModel(), GardenType.Flower);
        System.out.println("AbstractFactory Fourth Test: Passed");
    }
}
