package Home_work_4_mfc;

public class MarriageŠ”ertificate extends Tasks {
    public int thisNumber;

    public MarriageŠ”ertificate() {
        thisNumber = num();
    }

    @Override
    public int prioritet() {
        return 8;
    }

    @Override
    public int time() {
        return 20;
    }

    @Override
    public String toString() {
        return "Task: Marriage Certificate, Number: " + thisNumber + ", priority: " + prioritet() + ", time: " + time();
    }
}