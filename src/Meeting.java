public class Meeting extends Task {
    private int roomNumber;

    public Meeting(String id, int priority, String title, int createdDate, int roomNumber) {
        super(id, priority, title, createdDate);
        this.roomNumber = roomNumber;
    }

    @Override
    public void execute() {
        System.out.println("HOLDING MEETING: [" + getTitle() + "] | Room: " + roomNumber);
    }
}


