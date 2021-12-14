package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void userProcess() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        boolean result;
        view.printMessage(View.WELCOME_MESSAGE);
        do {
            inputNumber = scanner.nextInt();
            result = model.compare(inputNumber);
        } while (!result);
    }

}
