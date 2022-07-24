package Home_work_4;

public class Peoples {
    String name;
    Integer number;
    Integer float_skill;
    Integer running_skill;
    Integer spring_skiil;

    public Peoples(String name, Integer number, Integer float_skill, Integer running_skill, Integer spring_skill) {
        this.name = name;
        this.number = number;
        this.float_skill = float_skill;
        this.running_skill = running_skill;
        this.spring_skiil = spring_skill;
    }

    static Peoples people1 = new Peoples("Alex", 1, 9, 8, 8);
    static Peoples people2 = new Peoples("Yuriy", 2, 5, 3, 5);
    static Peoples people3 = new Peoples("Sergey", 3, 7, 9, 6);
    static Peoples people4 = new Peoples("Ivan", 4, 3, 5, 8);
    static Peoples people5 = new Peoples("Valentin", 5, 6, 7, 4);
    static Peoples people6 = new Peoples("Mark", 6, 2, 4, 9);
}