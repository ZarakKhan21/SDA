class TaskController {
    private TaskManager taskManager;
    private TaskDisplay taskDisplay;

    public TaskController() {
        taskManager = new TaskManager();
        taskDisplay = new TaskDisplay();
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
                String taskDescription = command.substring(4);
                taskManager.addTask(taskDescription);
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