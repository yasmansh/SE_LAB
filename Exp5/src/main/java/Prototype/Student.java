package Prototype;

public abstract class Student implements Cloneable {

    public String studentNationality;

    public abstract void addNationality();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
