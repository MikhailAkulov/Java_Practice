package Home_work_4_var2;

public class Swimming extends ObstacleCourse{
    @Override
    public String GetObstacle () {

        return "Swimming";

    }

    @Override
    public int GetPowerRequirements () {

        return 15;

    }

    @Override
    public void GoObstacle (Team team) {

        team.AfterObstacle(GetPowerRequirements());

    }
}