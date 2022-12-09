package Prototype;

public class JapaneseStudent extends Student {
    public JapaneseStudent() {
        this.studentNationality = "Japanese";
    }

    @Override
    public void addNationality() {
        System.out.println("Japanese student added");
    }

}
