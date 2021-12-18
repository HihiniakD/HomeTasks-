package model.entity;

import static view.TextConstants.*;

public class NotUniqueNicknameException extends Exception{
    NotUniqueNicknameException(String nickname){
        super(BUSY);
    }
}
