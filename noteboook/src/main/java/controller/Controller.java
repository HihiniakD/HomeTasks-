package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view, model, scanner);
        inputNoteBook.inputNote();

    }
}
