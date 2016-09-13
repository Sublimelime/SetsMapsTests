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
        MySet<Integer> mSet = new MySet<>();

        do {
            System.out.println("------------------------\nPlease select a choice:");
            byte choice = Menu(); //display menu and get choice.
            Scanner scan = new Scanner(System.in);

            switch (choice) {
                case 1: //add
                    System.out.println("Add what to the set?");
                    System.out.println((mSet.add(scan.nextInt())) ? "Added!" : "Failed to add, it already exists.");
                    break;
                case 2: //contains
                    System.out.println("Check for what value?");
                    System.out.println((mSet.contains(scan.nextInt())) ? "Yes!" : "Nope.");
                    break;
                case 3: //remove
                    System.out.println("Remove what number?");
                    mSet.remove(scan.nextInt());
                    break;
                case 4:
                    System.out.println("Printing...");
                    Object[] mArray = mSet.toArray();
                    for (Object aMArray : mArray) {
                        System.out.print(aMArray + " ");
                    }
                    System.out.println("Done.");
                    break;
                case 5: //empty
                    System.out.println((mSet.isEmpty()) ? "Yes, empty." : "Nope, something there!");
                    break;
                case 6: //clear
                    System.out.println("Clearing the set...");
                    mSet.clear();
                    break;
                case 7: //size
                    System.out.println("Size is: " + mSet.size());
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

        System.out.println("1. Add – Adds a number to the set \n" +
                "2. Contains – Allows the user to see if the set contains a number \n" +
                "3. Remove – Removes a number from the set \n" +
                "4. Print – Prints all the numbers contained in the set \n" +
                "5. Is Empty – Tells the user if the set was empty or not \n" +
                "6. Clear – Empties the set \n" +
                "7. Size – Tells the user the number of items in the set \n" +
                "8. Exit \n");

        return scanner.nextByte();
    }
}