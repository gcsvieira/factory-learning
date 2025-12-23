package studies.factory.method.issues;

/**
 * <p>One application of the abstract Issue class. Its an issue of the task type.</p>
 * <p>Will need to have its own factory class later detailing how tasks will be created.</p>
 */
public class TaskIssue extends Issue {
    public TaskIssue() {
        super.name = "This is a Task Issue";
        super.type = "task";
        super.creator = "gcs.vieira";
    }
}
