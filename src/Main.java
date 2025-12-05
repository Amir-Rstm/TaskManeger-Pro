
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task bug = new Bug("B-101", 1, "Login Crash", 1402, "Critical");
        Task feature = new Feature("F-200", 2, "Dark Mode", 1403, "Next Week");
        taskManager.addTask(bug);
        taskManager.addTask(feature);

        System.out.println("Starting Execution ... ");
        taskManager.executeNextTask();
        taskManager.executeNextTask();
        taskManager.executeNextTask();

    }
}