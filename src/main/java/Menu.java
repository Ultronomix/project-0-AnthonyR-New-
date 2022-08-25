package com.github.anthonyrosado;
import java.util.*;
public class Menu {
    public static void mainMenu() {
        System.out.println("The CLI HIIT Trainer");
        System.out.println("Select option using numpad");

        String[] Options = {
                "1.Build Workout Session",
                "2.Start Workout Session",
                "3.Exit"

        };
        for (String option : Options) {
            System.out.println(option);
        }
        Scanner Sc = new Scanner(System.in);
        int Input = Sc.nextInt();

        switch (Input) {
            case 1:
                BuildWorkout.Builder();

                break;

            case 2:
                StartWorkout.startWorkout();

                break;

            case 3:
                System.out.println("Good Bye");
                System.exit(0);

                break;
            default:
                System.out.println("Invalid Input");
                System.out.println("\033[H\033[2J");
                System.out.flush();
                mainMenu();
        }
        Sc.close();
    }

}
