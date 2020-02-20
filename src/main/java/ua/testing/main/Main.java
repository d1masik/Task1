package main.java.ua.testing.main;

import main.java.ua.testing.controller.Controller;
import main.java.ua.testing.model.Disc;
import main.java.ua.testing.view.View;

public class Main {

    public static void main(String[] args) {
	Controller controller = new Controller(new Disc(),new View());
	controller.mainLoop();
    }
}
