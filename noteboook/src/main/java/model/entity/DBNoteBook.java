package model.entity;

public enum DBNoteBook {
    FIRST_RECORD("Petrov", "Petya100"),
    SECOND_RECORD("Alexeev", "Alex_top"),
    THIRD_RECORD("Stepanenko", "Stepa228");

    private final String firstName;
    private final String nickname;

    DBNoteBook(String firstName, String nickname){
        this.firstName = firstName;
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNickname() {
        return nickname;
    }
    public static boolean checkNickname(String nickname){
        for (DBNoteBook noteBook: DBNoteBook.values()){
            if (noteBook.getNickname().equals(nickname)) return true;
        }
        return false;
    }
}
