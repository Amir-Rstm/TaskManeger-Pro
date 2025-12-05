public abstract class Task implements Comparable<Task> {
    private String id;
    private int priority;
    private String title;
    private int createdDate;

    public Task(String id, int priority, String title, int createdDate) {
        this.id = id;
        this.priority = priority;
        this.title = title;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public int getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Task{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", priority=" + priority + '}';
    }


    public abstract void execute();


    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}
