import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TaskManager {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Task Manager!");
        System.out.println("Type 'add <task>' to add a task, 'show' to display tasks, or 'exit' to quit.");

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();

            if (command.startsWith("add ")) {
                addTask(command.substring(4));
            } else if (command.equals("show")) {
                showTasks();
            } else if (command.equals("exit")) {
                System.out.println("Exiting Task Manager. Goodbye!");
                break;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.run();
    }
}
