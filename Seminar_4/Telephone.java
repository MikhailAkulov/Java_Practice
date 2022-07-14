package Seminar_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telephone {
    private Map<People, String> telephoneMap = new HashMap<>();

    public void addNewPeople(People people, String number){
        telephoneMap.put(people,number);
    }

    public List<People> getNumber(String name) throws MyFirstException {

        List<People> peopleList = new ArrayList<>();
        for (People people :  telephoneMap.keySet()) {

            if(people.getName().equals(name)){
               peopleList.add(people);
            }

        }
        return peopleList;
    }
}
