package studies.factory.method.factories;

import studies.factory.method.issues.Issue;
import studies.factory.method.issues.TaskIssue;

/**
 * Factory of the task issue type. In this case, we use the constructor of the TaskIssue class to easily instruct how the issue will be created.
 */
public class TaskFactory extends IssueFactory {
    @Override
    Issue getTask() {
        return new TaskIssue();
    }
}
