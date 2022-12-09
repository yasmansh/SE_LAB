package Prototype;

public class IranianStudent extends Student {
    public IranianStudent() {
        this.studentNationality = "Iranian";
    }

    @Override
    public void addNationality() {
        System.out.println("Iranian student added");
    }

}
