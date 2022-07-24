package Home_work_4;

public class Teams {

    String command_name;
    Peoples[] players;

    public Teams(String command_name, Peoples[] players) {
        this.command_name = command_name;
        this.players = players;

    }

    static Peoples[] players_1 = new Peoples[] { Peoples.people1, Peoples.people2, Peoples.people3 };
    static Peoples[] players_2 = new Peoples[] { Peoples.people4, Peoples.people5, Peoples.people6 };

    static Teams command_1 = new Teams("Tiger", players_1);
    static Teams command_2 = new Teams("Wolf", players_2);

    static void commandInformation(Teams command) {
        System.out.println("Команда: " + command.command_name);
        for (int i = 0; i < command.players.length; i++) {
            System.out.println("\tИмя: " + command.players[i].name);
            System.out.println("\t\tНавыки пловца:\t" + command.players[i].float_skill);
            System.out.println("\t\tНавыки бегуна:\t" + command.players[i].running_skill);
            System.out.println("\t\tНавыки прыгуна:\t" + command.players[i].spring_skiil);
        }
    }
}