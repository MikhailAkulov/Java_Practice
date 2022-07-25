package Home_work_4;

public class Teams {

    String command_name;
    Sportsmens[] players;

    public Teams(String command_name, Sportsmens[] players) {
        this.command_name = command_name;
        this.players = players;
    }

    static Sportsmens[] players_1 = new Sportsmens[] { Sportsmens.people1, Sportsmens.people2, Sportsmens.people3, Sportsmens.people4 };
    static Sportsmens[] players_2 = new Sportsmens[] { Sportsmens.people5, Sportsmens.people6, Sportsmens.people7, Sportsmens.people8 };

    static Teams command_1 = new Teams("Snails", players_1);
    static Teams command_2 = new Teams("Turtles", players_2);

    static void commandInformation(Teams command) {
        System.out.println("Команда: " + command.command_name);
        for (int i = 0; i < command.players.length; i++) {
            System.out.println("\tИмя: " + command.players[i].name);
            System.out.println("\t\tПлавание:\t" + command.players[i].swimming_skill);
            System.out.println("\t\tБег:\t\t" + command.players[i].running_skill);
            System.out.println("\t\tПрыжок:\t\t" + command.players[i].jumping_skill);
        }
    }
}