package Home_work_4_var2;

public abstract class Team {

    private String teamName;
    private People[] team = new People[3];

    public Team(String teamName, People[] team) {
        this.teamName = teamName;
        this.team = team;
    }

    public String GetTeamName() {
        return teamName;
    }

    public void InfoTeam() {
        System.out.println(teamName);
        for (int i = 0; i < team.length; i++) {
            System.out.printf("%s is %d years old and with %d power\n", team[i].GetName(), team[i].GetAge(),
                    team[i].GetPower());
        }
    }

    public void AfterObstacle(int PowerRequirements) {
        for (int i = 0; i < team.length; i++) {
            team[i].DecreasePower(PowerRequirements);
        }
    }

    public int HowManyPoints() {
        int pointsTeam = 0;
        for (int i = 0; i < team.length; i++) {
            if (team[i].GetPower() >= 0) {
                pointsTeam = pointsTeam + 1;
            }
        }
        return pointsTeam;
    }
}