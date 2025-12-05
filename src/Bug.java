public class Bug extends Task {
    private String severity;

    public Bug(String id, int priority, String title, int createdDate, String severity) {
        super(id, priority, title, createdDate);
        this.severity = severity;
    }

    @Override
    public void execute() {
        System.out.println("Debugging: " + getTitle() + " | Severity: " + severity);
    }

}
