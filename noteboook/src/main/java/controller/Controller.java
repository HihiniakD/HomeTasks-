package controller;

import model.Model;
import model.entity.NotUniqueNicknameException;
import model.entity.Record;
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
        Record record = getRecord(inputNoteBook);
        System.out.println(record);

    }
    private Record getRecord(InputNoteBook inputNoteBook){
        Record record = null;
        try {
            record = new Record(inputNoteBook.getSurname(), inputNoteBook.getNickname());
        }catch (NotUniqueNicknameException e){
            view.printNotUniqueNickname(e.getMessage());
        }
        return record;
    }
}
