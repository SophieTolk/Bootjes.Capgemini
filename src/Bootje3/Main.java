package Bootje3;

import Bootje3.Models.MenuHandler;

/**
 * Entry point of the program
 */
public class Main {
    public static void main(String[] args) {
        MenuHandler menuHandler = new MenuHandler();

        while (true) {
            menuHandler.printDefaultMenu();
        }
    }
}
