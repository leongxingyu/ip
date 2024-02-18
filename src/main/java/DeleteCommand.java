public class DeleteCommand implements Command {
    public final int DELETE_INDEX;

    public DeleteCommand (int taskIndex) {
        this.DELETE_INDEX = taskIndex;
    }

    @Override
    public void execute (String taskName, TaskList taskList) {
        int indexToDelete = DELETE_INDEX - 1;
        Ui.printDeleteTask(indexToDelete, taskList);
        taskList.taskList.remove(indexToDelete);
        Ui.printTaskCount(taskList.getTaskCount());
    }
}