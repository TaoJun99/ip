package duke;

/**
 * The commands supported by Duke
 */
public enum Command {
    LIST("list"), DONE("done"), DELETE("delete"), FIND("find"),
    TODO("todo"), DEADLINE("deadline"), EVENT("event"), BYE("bye");

    public final String command;

    Command(String command) {
        this.command = command;
    }
}
