# Video Link
https://drive.google.com/file/d/1zAmaJaNZGx5U96ZLRIDsXPYyhn2aRP2u/view?usp=drive_link

# Task Manager

## Definition of Single Responsibility Principle (SRP)

The **Single Responsibility Principle (SRP)** states that a class should have only one reason to change. This means that each class should focus on a single responsibility, making the system easier to maintain, modify, and scale.

## Without SRP (Bad Example)

### Issues with this code (Violation of SRP)

- The `TaskManager` class handles multiple responsibilities:
  - **Managing tasks** (storing and adding tasks).
  - **Displaying tasks**.
  - **Handling user input** (running the program and interpreting commands).
- If we need to modify how tasks are displayed, we have to change `TaskManager`, which also handles business logic.
- The code is less maintainable because multiple concerns are in one class.

## With SRP (Good Example)

### Advantages of SRP in this code

- **Each class has a single responsibility:**
  - `TaskManager` → Manages tasks.
  - `TaskDisplay` → Handles displaying tasks.
  - `TaskController` → Manages user input and application flow.
  - `Task` → Represents a single task.
- **Easier to modify:**
  - If we want to change how tasks are displayed, we modify `TaskDisplay` without affecting task management.
  - If we want to store tasks in a database instead of a list, we modify `TaskManager` without affecting user interaction.
- **Improves code readability and maintainability.**
