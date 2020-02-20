package main.java.ua.testing.controller;

import main.java.ua.testing.model.Disc;
import main.java.ua.testing.controller.service.MusicService;
import main.java.ua.testing.view.TextConstant;
import main.java.ua.testing.view.View;

import java.util.Scanner;

public class Controller {
    public Disc disc;
    public View view;

    public Controller(Disc disc, View view) {
        this.disc = disc;
        this.view = view;
    }

    public void mainLoop() {
        view.printLocaleData(TextConstant.START_PLAYLIST);
        MusicService musicService = disc.burnDisc();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            runApp(scanner, musicService);

        }
    }

    public void runApp(Scanner scanner, MusicService musicService) {
        view.printLocaleData(TextConstant.MENU_VALUE);
        switch (inputNumber(scanner)) {
            case 1: {
                view.printLocaleData(TextConstant.CHECK_PLAYLIST);
                view.printList(musicService.trackInfo());
                break;
            }
            case 2: {
                view.printLocaleData(TextConstant.SORT_BY_STYLE);
                musicService.sortByStyle();
                view.printList(musicService.trackInfo());
                break;
            }
            case 3: {
                view.printLocaleData(TextConstant.ALL_DURATION);
                view.printData(String.valueOf(musicService.trackListDuration()) + "s");
                break;
            }
            case 4: {
                view.printLocaleData(TextConstant.START_LISTEN);
                view.printList(musicService.playMusic());
                break;
            }
            case 5: {

                view.printLocaleData(TextConstant.GET_DURATION);
                int min, max;
                do {
                    view.printLocaleData(TextConstant.MIN_DIAPASON);
                    min = inputNumber(scanner);
                    view.printLocaleData(TextConstant.MAX_DIAPASON);
                    max = inputNumber(scanner);
                } while (min > max);
                view.printList(musicService.findByRange(min, max));
                break;
            }
            case 6: {
                System.exit(0);
            }
            default: {
                view.printLocaleData(TextConstant.WRONG_INPUT);
            }

        }
    }

    public int inputNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            view.printLocaleData(TextConstant.WRONG_INPUT);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
