package model.entity;

import java.util.Objects;

public class Record {
    private String surname;
    private String nickname;

    public Record(String surname, String nickname) throws NotUniqueNicknameException{
        if (DBNoteBook.checkNickname(nickname)){
            throw new NotUniqueNicknameException(nickname);
        }
        this.surname = surname;
        this.nickname = nickname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    @Override
    public int hashCode(){
        return Objects.hash(surname, nickname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(surname, record.surname) && Objects.equals(nickname, record.nickname);
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
