package duke.task;

import java.time.LocalDateTime;

/**
 * Represents the task object
 */
public class Task {
    protected String description;
    protected boolean isDone;
    protected LocalDateTime dateTime;
    /**
     * Class Constructor
     *
     * @param description the description of the task
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns the completion status of task
     *
     * @return "X" or " "
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Returns the description of the task
     *
     * @return description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Changes the description of the task
     *
     * @param description the description of the task
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    /**
     * Marks the task as done
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Modifies the string representation of the task
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return String.format("[%s] %s", this.getStatusIcon(), this.getDescription());
    }
}
