package org.example;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Collectors;
import java.io.FileWriter;
import java.io.IOException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Crud {


  static  LinkedList<Exercise> AllExercises = new LinkedList<>();

    static void CrudMenu() {


        {
            System.out.println("Builder menu: ");
            String[] Options = {
                    "1.Display Exercises",
                    "2.Add Exercises",
                    "3.Remove Exercises",
                    "4.Back"};

            for (String option : Options) {
                System.out.println(option);
            }
            Scanner Sc = new Scanner(System.in);
            int Input = Sc.nextInt();
            switch (Input) {
                case 1:
                    Display();
                    Utilities.BacktoMain();

                    break;

                case 2:
                   AddExercise();
                    CrudMenu();
                   break;

                case 3:
                    RemoveExercise();
                    CrudMenu();
                    break;

                case 4:

                        Menu.mainMenu();

                    break;


                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }

    //

     static void Display() {


        for (Exercise exercise : AllExercises) {
            System.out.println(exercise.name);

                Save();
            }
        }


    //

      static Exercise AddExercise() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter exercise name: ");
        String exerciseName = input.nextLine();
        Exercise e = new Exercise(exerciseName);
          AllExercises.add(e);
          return e;

    }



    //
     static void RemoveExercise() {
         Display();

             Scanner sc = new Scanner(System.in);
            System.out.println("Enter Exercise to remove");
            String input = sc.nextLine();

            if (input.equals(AddExercise().name)){
                AllExercises.remove();


            }
        }

        static void Save() {
            try {
                FileWriter writer = new FileWriter("output.txt");
                for (Exercise ex : AllExercises) {
                    writer.write(ex + System.lineSeparator());
                }
                writer.close();
            }catch (Exception e){throw new RuntimeException(e);}

        }

     public static void readOut(){
        try {

            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String s;
            Utilities.Work();
            while((s = reader.readLine()) != null){
                System.out.println(s);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void workout(){

        readOut();


    }








}









