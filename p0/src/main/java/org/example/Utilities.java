package org.example;

import java.io.IOException;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.*;

import java.lang.*;


public class Utilities {

    public static  void BacktoMain() {

        System.out.println("press 0 to go back");
        Scanner back = new Scanner(System.in);
        int Input = back.nextInt();
        if (Input == 0) {

                Menu.mainMenu();

        } else {
            System.out.println("invalid input");
        }
        back.close();
    }

    public static void Clear() {
        System.out.println("\033[H\033[2J");
        System.out.flush();

    }

    public static void intInput(int input) {
        try {
            Scanner Int = new Scanner(System.in);
            input = Int.nextInt();
        } catch (Exception e) {
            System.out.println("Numerical values only!");

        }

    }


    public static void Timer(String message, int time) {
        System.out.print(message);


        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable runnable = new Runnable() {

            int Interval = time;


            public void run() {

                System.out.print("\b" + "\b" + Interval);
                Interval--;

                if (Interval < 0) {

                    scheduler.shutdown();
                }

            }

        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
        Clear();

    }



    public static void Rest() {

        Timer("Rest: ", 10);
    }

    public static void Work() {
        Timer("Go!; ", 35);
    }

    public static void nextRound() {
        Timer("Next round in: ; ", 15);
    }

    public static void nextExercise() {
        Timer("Next exercise in: ; ", 5);
    }


}