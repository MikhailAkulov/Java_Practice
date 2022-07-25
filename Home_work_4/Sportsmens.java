package Home_work_4;

public class Sportsmens {
    String name;
    Integer number;
    Integer swimming_skill;
    Integer running_skill;
    Integer jumping_skill;

    public Sportsmens(String name, Integer number, Integer swimming_skill, Integer running_skill, Integer jumping_skill) {
        this.name = name;
        this.number = number;
        this.swimming_skill = swimming_skill;
        this.running_skill = running_skill;
        this.jumping_skill = jumping_skill;
    }

    static Sportsmens people1 = new Sportsmens("Sergey", 1, 9, 8, 8);
    static Sportsmens people2 = new Sportsmens("Yaroslav", 2, 5, 3, 5);
    static Sportsmens people3 = new Sportsmens("Mikhail", 3, 7, 9, 6);
    static Sportsmens people4 = new Sportsmens("Denis", 4, 3, 5, 7);
    static Sportsmens people5 = new Sportsmens("Igor", 5, 6, 7, 4);
    static Sportsmens people6 = new Sportsmens("Oleg", 6, 2, 4, 9);
    static Sportsmens people7 = new Sportsmens("Igor", 7, 4, 6, 2);
    static Sportsmens people8 = new Sportsmens("Oleg", 8, 8, 2, 3);
}