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
        MyMap<Integer, String> mMap = new MyMap<>(); //Integers as keys, strings as values

        do {
            System.out.println("------------------------\nPlease select a choice:");
            byte choice = Menu(); //display menu and get choice.
            Scanner scan = new Scanner(System.in);

            switch (choice) {
                case 1:
                    mMap.clear();
                    break;
                case 2:
                    System.out.println("Search for what key?");
                    System.out.println("Found: " + mMap.containsKey(scan.nextInt()));
                    break;
                case 3:
                    System.out.println("Search for what value?");
                    System.out.println("Found: " + mMap.containsValue(scan.next()));
                    break;
                case 4:
                    System.out.println("Get from what key?");
                    String tempGetVal = mMap.findValueFromKey(scan.nextInt());
                    if(tempGetVal == null)
                        System.out.println("Key not found.");
                    else
                        System.out.println(tempGetVal);
                    break;
                case 5:
                    System.out.println("What key?");
                    Integer tempKey = scan.nextInt();
                    System.out.println("What value?");
                    String tempVal = scan.next();
                    String returnedVal = mMap.put(tempKey, tempVal);

                    if (returnedVal == null)
                        System.out.println("Added.");
                    else
                        System.out.println("Added, replaced value is: " + returnedVal);
                    break;
                case 6:
                    System.out.println("What key?");
                    String returnedValRemoved = mMap.remove(scan.nextInt());

                    if (returnedValRemoved == null)
                        System.out.println("Key not found.");
                    else
                        System.out.println("Key removed, value was: " + returnedValRemoved);
                    break;
                case 7:
                    System.out.println("The size is: " + mMap.size());
                    break;
                case 8:
                    System.out.println("Printing...");
                    System.out.println(mMap);
                    break;
                case 9:
                    System.out.println("The map is currently empty: " + mMap.isEmpty());
                    break;
                case 0: //Exit
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
        System.out.println("1. Clear \n" +
                "2. Contains key \n" +
                "3. Contains value \n" +
                "4. Get \n" +
                "5. Put \n" +
                "6. Remove \n" +
                "7. Size \n" +
                "8. Print all entries \n" +
                "9. Is empty \n" +
                "0. Exit");

        return scanner.nextByte();
    }
}