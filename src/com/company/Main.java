package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();

        while(true){
            System.out.println("Please select what you wish to do: \n" +
                    "Select 1 to view list.\n" +
                    "Select 2 to add to list.\n" +
                    "Select 3 to delete from list\n" +
                    "Select 4 to close the application\n");
            int input = Integer.valueOf(scanner.nextLine());

            if(input == 1){ // View the list of tasks within the To-Do List table
                list.returnRows();
                System.out.println("");
            } else if(input == 2){ // Adds to the task list
                while(true) {
                    System.out.println("Please write the task you wish to add, the date it is due by and the priority or press Q to exit.");
                    System.out.println("The task name: ");
                    String newTask = scanner.nextLine();
                    if (newTask.equals("Q")) {
                        System.out.println("You have opted to finish adding tasks.\n");
                        break;
                    }
                    System.out.println("The date it is due by (in YYYY-MM-DD format).");
                    String newDate = scanner.nextLine();

                    System.out.println("Is this a priority? (1 = true or 0 = false)");
                    int newPriority = Integer.valueOf(scanner.nextLine());

                    list.addRows(newTask, newDate, newPriority);

                    System.out.println("Task completed");
                }
            } else if (input == 3) {//Remove rows from todolist table
                while (true) {
                    System.out.println("Please select the number that corresponds to the task you wish to delete (or press Q to quit.\n");
                    list.returnRows();

                    String deletedInput = scanner.nextLine();

                    if (deletedInput.equals("Q")) {
                        System.out.println("You have opted to quit.");
                        break;
                    }

                    int deletedNumber = Integer.valueOf(deletedInput);
                    System.out.println("\nYou have successfully deleted the task");
                    list.deleteRows(deletedNumber);
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


