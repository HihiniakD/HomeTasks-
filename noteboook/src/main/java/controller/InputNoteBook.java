package controller;

import model.Model;
import view.View;
import static controller.RegexData.*;
import static view.TextConstants.*;

import java.util.Scanner;


public class InputNoteBook {
    private View view;
    private Scanner scanner;
    private Model model;

    private String surname;
    private String nickname;


    InputNoteBook(View view, Model model, Scanner scanner){
        this.view = view;
        this.model = model;
        this.scanner = scanner;
    }
    public void inputNote(){
        UtilityController utilityController = new UtilityController(view, scanner);
        String regex = (String.valueOf(View.bundle.getLocale()).equals("ua"))? REGEX_SURNAME_UKR : REGEX_SURNAME_LAT;
        this.surname = utilityController.inputData(SURNAME, regex);
        this.nickname = utilityController.inputData(NICKNAME, REGEX_NICKNAME);
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

}
