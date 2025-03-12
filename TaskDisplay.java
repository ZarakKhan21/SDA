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