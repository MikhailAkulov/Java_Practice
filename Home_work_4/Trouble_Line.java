package Home_work_4;

public class Trouble_Line {

    public static Integer GoTroubleLine(Teams command) {
        int count = 0;
        for (int i = 0; i < command.players.length; i++) {
            count += Float(command.players[i]) + Run(command.players[i]) + Spring(command.players[i]);
        }
        return count;
    }

    public static Integer Float(Peoples man) {
        if (Math.random() * 10 < man.float_skill) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Integer Run(Peoples man) {
        if (Math.random() * 10 < man.running_skill) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Integer Spring(Peoples man) {
        if (Math.random() * 10 < man.spring_skiil) {
            return 1;
        } else {
            return 0;
        }
    }
}