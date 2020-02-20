package main.java.ua.testing.view;


import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    // static String BUNDLE_NAME = "resource";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle("resource",
                    new Locale("ua", "UA"));


    public void printData(String data) {
        System.out.println(data);
    }


    public void printList(List<String> stringList) {
        for (String strings : stringList) {
            System.out.println(strings);
        }
    }

    public void printLocaleData(String data) {
        System.out.println(View.bundle.getString(data));
    }
}

