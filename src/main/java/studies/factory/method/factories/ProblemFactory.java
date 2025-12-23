package studies.factory.method.factories;

import studies.factory.method.issues.Issue;
import studies.factory.method.issues.ProblemIssue;

/**
 * Factory of the problem issue type. In this case, we use the constructor of the ProblemIssue class to easily instruct how the issue will be created.
 */
public class ProblemFactory extends IssueFactory {
    @Override
    Issue getTask() {
        return new ProblemIssue();
    }
}
