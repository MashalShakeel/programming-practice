// This program performs various operations like insertion, display and deletion on a String[] array.

import java.util.Scanner;

public class Arrays {

    public static String[] insertAtStart (String[] array, String data) {
        String[] newArray = new String[array.length+1];
        newArray[0] = data;

        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = array[i-1];
        }
        System.out.println("Data inserted successfully\n");
        return newArray;
    }

    public static String[] insertAtEnd (String[] array, String data) {
        String[] newArray = new String[array.length+1];
        newArray[newArray.length-1] = data;

        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        System.out.println("Data inserted successfully\n");
        return newArray;
    }

    public static String[] insertAfterValue(String[] array, String data, String value) {
        String[] newArray = new String[array.length + 1];

        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found) {
            for (int i = 0; i <= foundIndex; i++) {
                newArray[i] = array[i];
            }

            newArray[foundIndex + 1] = data;

            for (int i = foundIndex + 1; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
        } else {
            System.out.println("Value not found in the array.");
            return array;
        }

        return newArray;
    }

    public static void display (String[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Current Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public static String[] deleteFirst (String[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return array;
        } else {
            String[] newArray = new String[array.length-1];

            for (int i = 0; i < newArray.length; ++i) {
                newArray[i] = array[i+1];
            }
            System.out.println("Data deleted successfully\n");
            return newArray;
        }
    }

    public static String[] deleteEnd (String[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return array;
        }

        String[] newArray = new String[array.length-1];

        for (int i = 0; i < newArray.length; ++i) {
            newArray[i] = array[i];
        }
        System.out.println("Data deleted successfully\n");
        return newArray;
    }

    public static String[] deleteSpecific (String[] array, String value) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return array;
        }

        String[] newArray = new String[array.length-1];

        boolean found = false;
        int foundIndex=-1;
        for (int i = 0; i< array.length; i++){
            if (array[i].equalsIgnoreCase(value)) {
                found = true;
                foundIndex = i;
                break;
            }
        }


        if (found) {
            for (int i = 0; i < foundIndex; ++i) {
                newArray[i] = array[i];
            }

            for (int i = foundIndex+1; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            System.out.println("Data deleted successfully\n");
        } else {
            System.out.println("Value entered not found in array.");
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] myArray = new String[] {"hi", "i", "love", "Data", "Structures"};

        int choice;

        do {
            System.out.println("Chose an option: ");
            System.out.println("1. Insert at start");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at specific value");
            System.out.println("4. Display array");
            System.out.println("5. Delete first");
            System.out.println("6. Delete last");
            System.out.println("7. Delete specific value");
            System.out.println("8. Delete whole list");
            System.out.println("9. Exit");

            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at start: ");
                    String data1 = scanner.nextLine();
                    myArray = insertAtStart(myArray, data1);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    String data2 = scanner.nextLine();
                    myArray = insertAtEnd(myArray, data2);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    String data3 = scanner.nextLine();
                    System.out.print("Enter value to insert after: ");
                    String value3 = scanner.nextLine();
                    myArray = insertAfterValue(myArray, data3, value3);
                    break;
                case 4:
                    display(myArray);
                    break;
                case 5:
                    myArray = deleteFirst(myArray);
                    break;
                case 6:
                    myArray = deleteEnd(myArray);
                    break;
                case 7:
                    System.out.print("Enter value to delete: ");
                    String value = scanner.nextLine();
                    myArray = deleteSpecific(myArray, value);
                    break;
                case 8:
                    myArray = new String[0];
                    System.out.println("Array contents deleted.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);
    }
}
