package pack1;

import java.util.Scanner;

/**
 * Created on 9/12/2016, 2:01 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project SetAndTester
 */

@SuppressWarnings("WeakerAccess")
public class Mainfile {
    public static void main(String[] args) {
        MySet<Integer> mset = new MySet<>();

        do {
            System.out.println("------------------------\nPlease select a choice:");
            byte choice = Menu(); //display menu and get choice.
            Scanner scan = new Scanner(System.in);

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8: //exit game
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (true);
    }

    /**
     * Displays a menu of choices and returns the choice.
     *
     * @return a byte, the choice of the user
     */
    private static byte Menu() {
        Scanner scanner = new Scanner(System.in);

        //todo list options

        return scanner.nextByte();
    }
}