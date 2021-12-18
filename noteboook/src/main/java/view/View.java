package view;

import java.util.Locale;
import java.util.ResourceBundle;
import static view.TextConstants.*;

public class View {
    private static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en")); //Ukrainian locale


    private String concatenateStrings(String... strings){
        StringBuilder concatString = new StringBuilder();
        for (String string: strings){
            concatString.append(string);
        }
        return new String(concatString);
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printWrongMessage(String message){
        printMessage(concatenateStrings(bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA), bundle.getString(message)));

    }
    public void printInputMessage(String message){
        printMessage(concatenateStrings(bundle.getString(INPUT_STRING_DATA), bundle.getString(message)));
    }
    public void printNotUniqueNickname(String message){
        printMessage(bundle.getString(message));
    }
}
