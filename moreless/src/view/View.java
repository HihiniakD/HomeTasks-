package view;

public class View {
    public static final String WRONG_INPUT = "Out of range. Make sure that your number in the range from 0 to 100";
    public static final String LESS = "Less than you need";
    public static final String MORE = "More than you need";
    public static final String GUESSED = "Congrats! You have guessed the number";
    public static final String WELCOME_MESSAGE = "Hi! Try to guess the number in range from 0 to 100";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printHelpMessage(String message, int min, int max){
        System.out.printf("%s. Current range is %d - %d %n", message, min, max);
    }
}
