package tan;
public class ToDo extends Task {

    private final String toDoIcon = "T";

    public ToDo(String description) {
        super.setTaskName(description);
    }

    /**
     * Returns the icon for todo tasks.
     *
     * @return Returns the String "T"
     */
    @Override
    public String getIcon() {
        return toDoIcon;
    }

    /**
     * This will return the whole string
     * including its icon, status & task name.
     *
     * @return The task icon, status & name in String.
     */
    @Override
    public String toString() {
        return ("[" + getIcon() + "]"
                + "[" + getStatusIcon() + "] " + getTaskName());
    }
}
