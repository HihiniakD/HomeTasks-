package model;

import view.View;

import java.util.ArrayList;
import java.util.List;


public class Model {
    private final View view = new View();
    private final RandomNumber randomNumber = new RandomNumber();
    private final List<Integer> listOfAttempts = new ArrayList<>();

    {
        System.out.println(randomNumber.getNumber());
    }


    public boolean compare(int inputNumber){
        if (inputNumber < randomNumber.getMin()|| randomNumber.getMax() > 100) view.printMessage(View.WRONG_INPUT);
        else if (inputNumber< randomNumber.getNumber()) {
            randomNumber.setMin(inputNumber+1);
            view.printHelpMessage(View.LESS, randomNumber.getMin(), randomNumber.getMax());
        }
        else if (inputNumber>randomNumber.getNumber()) {
            randomNumber.setMax(inputNumber-1);
            view.printHelpMessage(View.MORE, randomNumber.getMin(), randomNumber.getMax());
        }
        else{
            view.printMessage(View.GUESSED);
            System.out.println(listOfAttempts);
            return true;
        }
        listOfAttempts.add(inputNumber);
        return false;
    }


}
