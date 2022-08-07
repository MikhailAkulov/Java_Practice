package Home_work_6;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AppData data = IOstream.getReading();
        for (Map.Entry el: data.getMap().entrySet()){
            System.out.println(el);
        }

        data.addData("Value 1",100);
        data.addData("Value 2",200);
        data.addData("Value 3",123);

        data.addData("Value 1",300);
        data.addData("Value 2",400);
        data.addData("Value 3",500);

        IOstream.getWriting(data);
    }
} 