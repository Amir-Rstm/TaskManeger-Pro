public class Feature extends Task {
    private String deadline;

    public Feature(String id, int priority, String title, int createdDate, String deadline) {
        super(id, priority, title, createdDate);
        this.deadline = deadline;
    }


    @Override
    public void execute() {
        System.out.println("DEVELOPING FEATURE: [" + getTitle() + "] | Deadline: " + deadline);
    }

}
