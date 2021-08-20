package com.tranquyet.util;

/**
 * @overview common information which is used to show for client, such as: options and error messages
 */
public class Screen {
    /**
     * @overview show main screen of application
     */
    public static void showScreen() {
        System.out.println("");
        System.out.println("-----------Manage Student------------");
        System.out.println("Choose the option:");
        System.out.println("1. Add Student");
        System.out.println("2. Show Student");
        System.out.println("3. Exit");
        System.out.println("Enter the option: ");
    }

    /**
     * @param message
     * @overview show message to client
     */
    public static void showError(String message) {
        System.err.println(message);
    }
}
