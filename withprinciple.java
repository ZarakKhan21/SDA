import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

class TaskDisplay {
    public void showTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (Task task : tasks) {
                System.out.println("- " + task.getDescription());
            }
        }
    }
}

class TaskController {
    private TaskManager taskManager;
    private TaskDisplay taskDisplay;

    public TaskController() {
        this.taskManager = new TaskManager();
        this.taskDisplay = new TaskDisplay();
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
                taskManager.addTask(command.substring(4));
            } else if (command.equals("show")) {
                taskDisplay.showTasks(taskManager.getTasks());
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
        TaskController controller = new TaskController();
        controller.run();
    }
}
