package Home_work_4;

public class main {
    public static void main(String[] args) {
        Teams.commandInformation(Teams.command_1);
        Teams.commandInformation(Teams.command_2);
        System.out.println("Команда 'Tiger' по результатам трех испытаний набрала "
                + Trouble_Line.GoTroubleLine(Teams.command_1) + " баллов.");
        System.out.println("Команда 'Wolf' по результатам трех испытаний набрала "
                + Trouble_Line.GoTroubleLine(Teams.command_1) + " баллов.");

    }
}