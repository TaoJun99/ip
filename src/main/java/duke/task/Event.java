package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents an event
 */
public class Event extends Task {
    protected LocalDateTime at;
    private final DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("E, dd MMM yyyy HHmm");

    /**
     * Class Constructor
     *
     * @param description description of event
     * @param at time of event
     */
    public Event(String description, String at) {
        super(description);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HHmm");
        this.at = LocalDateTime.parse(at, inputFormatter);
    }

    /**
     * Class Constructor
     *
     * @param description description of event
     * @param at time of event
     */
    public Event(String description, LocalDateTime at) {
        super(description);
        this.at = at;
    }

    /**
     * Modifies the string representation of an event object
     *
     * @return string representation of the event
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at.format(outputFormatter) + ")";
    }

    @Override
    public void setDateTime(LocalDateTime dateTime) {
        this.at = dateTime;
    }
}
