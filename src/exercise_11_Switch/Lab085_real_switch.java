package exercise_11_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab085_real_switch {
    public static void main(String[] args) {
        // Web Automation
        // I Will ask the user to giev me the injput from browser which he wants to
        //  use to i will start the automation in that browser

        // String browser = args [0];
        // System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the browser , which you want to satrt !!");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("starting the firefox browser");
                // further the code to start the firefox
                // webdriver driver = new firefox(); // selenium code
                break;

            case  "edge":
                System.out.println("execute the edge code");
                break;
            default:
                System.out.println("i have no idea which browser is this");
                break;
        }
    }
}
