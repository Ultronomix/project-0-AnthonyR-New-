package org.example;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.*;

public class Utilities {

    public static void BacktoMain() {

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

    public static void Clear(){
        System.out.println("\033[H\033[2J");
        System.out.flush();

    }
public int intInput(int input){
        Scanner Int = new Scanner(System.in);
        input = Int.nextInt();
        return input;
}
public String stringInput(String input){
        Scanner Sc = new Scanner(System.in);
        input = Sc.nextLine();
        return input;
    }
    public static void Timer() {

        System.out.println("Enter time Value(seconds): ");
        Scanner input = new Scanner(System.in);
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable runnable = new Runnable(){

            int countdownStarter = input.nextInt();
            public void run(){


                System.out.print("\b"+"\b"+countdownStarter);
                countdownStarter--;






                if (countdownStarter < 0) {
                    System.out.println("Time!");
                    scheduler.shutdown();
                }

            }

        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);



    }


}