package Seminar_4;

public class Animal {
    private String defaultName = "animal";

    public abstract int weight();

    public abstract int legCount();

    public String name(){
        return defaultName;
    }
}
