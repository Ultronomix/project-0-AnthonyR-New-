
import java.io.IOException;
import java.util.*;
public class Menu {

    public static void mainMenu() {

        System.out.println("The CLI HIIT Trainer");
        System.out.println("Select option using numpad");

        String[] Options = {
                "1.Plan Workout",
                "2.Workout",
                "3.Exit"

        };
        for (String option : Options) {
            System.out.println(option);
        }
        Scanner Sc = new Scanner(System.in);
        int Input = Sc.nextInt();

        switch (Input) {
            case 1:
                Crud.CrudMenu();

                break;

            case 2:
               Crud.workout();
                Utilities.BacktoMain();
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

