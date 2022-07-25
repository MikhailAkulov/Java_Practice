package Home_work_4;

public class Main {
    public static void main(String[] args) {
        Teams.commandInformation(Teams.command_1);
        Teams.commandInformation(Teams.command_2);
        System.out.println("Команда 'Snails' по результатам трех испытаний набрала: "
                + ObstacleCourse.GoObstacle(Teams.command_1) + " баллов.");
        System.out.println("Команда 'Turtles' по результатам трех испытаний набрала: "
                + ObstacleCourse.GoObstacle(Teams.command_1) + " баллов.");
    }
}