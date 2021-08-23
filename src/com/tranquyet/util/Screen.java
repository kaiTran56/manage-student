package com.tranquyet.util;

/**
 * common information which is used to show for client, such as: options and error messages
 */
public class Screen {
    /**
     * show main screen of application
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
     * show message to client
     *
     * @param message receive the message string to print
     */
    public static void showError(String message) {
        System.err.println(message);
    }
}
