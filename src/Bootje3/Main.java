package Bootje3;

import Bootje3.Models.MenuHandler;

/**
 * Entry point of the program
 */
public class Main {
    public static void main(String[] args) {
        MenuHandler menuHandler = new MenuHandler();

        while (true) {
            // The menuHandler has an exit option to shutdown the program
            menuHandler.printDefaultMenu();
        }
    }
}
