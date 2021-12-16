package model;

import java.util.HashSet;
import java.util.Set;

public class Model {
    Set <Record> setOfUsers = new HashSet<Record>();

    public void createUser(String surname, String nickname){
        Record user = new Record();
        user.setSurname(surname);
        user.setNickname(nickname);
        System.out.println(user);
    }


}
