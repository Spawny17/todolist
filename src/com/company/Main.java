package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please select what you wish to do: \n" +
                    "Select 1 to view list.\n" +
                    "Select 2 to add to list.\n" +
                    "Select 3 to delete from list\n" +
                    "Select 4 to close the application\n");
            int input = Integer.valueOf(scanner.nextLine());

            if(input == 1){
                System.out.println("\nYou currently have " + list.listSize() + " tasks to complete.");
                for(int i = 0; i < list.listSize(); i++){
                    System.out.println(list.listIndex(i));
                }
                System.out.println("");
            } else if(input == 2){
                while(true) {

                    System.out.println("Please write the task you wish to add to the list or press Q to exit.");
                    String newInput = scanner.nextLine();

                    if (newInput.equals("Q")) {
                        System.out.println("You have opted to finish adding tasks.\n");
                        break;
                    }

                    list.addItem(newInput);
                }
            } else if (input == 3){
                while(true) {
                    if(list.listSize() == 0){
                        System.out.println("There are no more tasks to delete.\n");
                        break;
                    } else {
                        System.out.println("Please select the number that corresponds to the task you wish to delete (or press Q to quit.\n");
                        for (int i = 0; i < list.listSize(); i++) {
                            System.out.println(i + " - " + list.listIndex(i));
                        }

                        String deletedInput = scanner.nextLine();

                        if (deletedInput.equals("Q")) {
                            System.out.println("You have opted to quit.");
                            break;
                        }

                        int deletedNumber = Integer.valueOf(deletedInput);

                        System.out.println("\nYou have successfully deleted the task " + list.listIndex(deletedNumber) + ".");
                        list.removeItem(deletedNumber);

                    }
                }
            } else if (input == 4){
                System.out.println("Thank you for using the application, please use it again soon!");
                break;
            } else {
                System.out.println("Please press a correct number.");
            }
        }
    }
}


