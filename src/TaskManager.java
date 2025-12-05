import java.util.*;

public class TaskManager {
    private Queue<Task> taskQueue;
    private Map<String, Task> taskLookup;
    private List<Task> history;

    public TaskManager() {
        taskQueue = new LinkedList<>();
        taskLookup = new HashMap<>();
        history = new ArrayList<>();
    }

    public void addTask(Task t) {
        taskQueue.add(t);
        taskLookup.put(t.getId(), t);
    }

    public Task findTask(String id) {
        return taskLookup.get(id);
    }


    public void executeNextTask() {
        Task t = taskQueue.poll();

        if (t != null) {
            t.execute();
            history.add(t);
            taskLookup.remove(t.getId());
            System.out.println("Task completed and moved to history.");
        } else {
            System.out.println("Queue is empty!");
        }
    }
}
