# TaskMaster Pro (Core Java Task Management System)

TaskMaster Pro is a robust, console-based task management system designed to demonstrate **Object-Oriented Programming (OOP)** principles and the effective use of the **Java Collections Framework**.

This project simulates a real-world scenario where tasks (Bugs, Features, Meetings) are prioritized, queued, and executed based on specific business logic.

## Key Technologies & Concepts

* **Core Java (SE):** Built entirely using standard Java libraries.
* **OOP Principles:**
    * **Polymorphism:** Handling different task types (`Bug`, `Feature`, `Meeting`) uniformly via the `Task` abstract class.
    * **Abstraction:** Using abstract classes to define a blueprint for task execution.
    * **Encapsulation:** Protecting data integrity with private fields and constructor logic.
* **Data Structures (Collections):**
    * **`Queue (LinkedList)`:** Manages task execution order (FIFO).
    * **`Map (HashMap)`:** Enables O(1) constant-time complexity for task lookups by ID.
    * **`List (ArrayList)`:** Stores the execution history.
    * **`Comparable Interface`:** Custom sorting logic based on task priority.
