package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class InputNoteBook {
    private View view;
    private Scanner scanner;
    private Model model;

    private String surname;
    private String nickname;

    private final String regexSurname = "^[A-Z][a-z]{1,14}";
    private final String regexNickname = "^[A-Z][a-z_0-9]{6,9}";

    private final String surnameMessage = "\tInput your surname.\nRequirements: First letter is capital. " +
            "Length - 2 to 15 letters.";
    private final String nicknameMessage = "\tInput your nickname.\nRequirements: First letter is capital. " +
            "Length - 7 to 10 symbols. Underscores and numbers are allowed.";

    InputNoteBook(View view, Model model, Scanner scanner){
        this.view = view;
        this.model = model;
        this.scanner = scanner;
    }
    public void inputNote(){
        UtilityController utilityController = new UtilityController(view, scanner);
        this.surname = utilityController.inputData(surnameMessage, regexSurname);
        this.nickname = utilityController.inputData(nicknameMessage, regexNickname);
        model.createUser(surname, nickname);
    }
}
