package Home_work_4;

public class ObstacleCourse {

    public static Integer GoObstacle(Teams command) {
        int count = 0;
        for (int i = 0; i < command.players.length; i++) {
            count += Swim(command.players[i]) + Run(command.players[i]) + Jump(command.players[i]);
        }
        return count;
    }

    public static Integer Swim(Sportsmens man) {
        if (Math.random() * 10 < man.swimming_skill) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Integer Run(Sportsmens man) {
        if (Math.random() * 10 < man.running_skill) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Integer Jump(Sportsmens man) {
        if (Math.random() * 10 < man.jumping_skill) {
            return 1;
        } else {
            return 0;
        }
    }
}