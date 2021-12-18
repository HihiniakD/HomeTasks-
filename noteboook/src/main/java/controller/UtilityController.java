package controller;

import view.View;

import java.util.Scanner;

public class UtilityController {
    private View view;
    private Scanner scanner;

    public UtilityController(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }

    public String inputData(String message, String regex){
        String res;
        view.printInputMessage(message);
        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))){
            view.printWrongMessage(message);
        }
        return res;
    }

}
