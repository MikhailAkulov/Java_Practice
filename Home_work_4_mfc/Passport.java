package Home_work_4_mfc;

public class Passport extends Tasks {

    public int thisNumber;

    public Passport() {
        thisNumber = num();
    }

    @Override
    public int prioritet() {
        return 10;
    }

    @Override
    public int time() {
        return 10;
    }

    @Override
    public String toString() {
        return "Task: Passport, Number: " + thisNumber + ", priority: " + prioritet() + ", time: " + time();
    }
}