package studies.factory.method.factories;

import studies.factory.method.issues.Issue;

/**
 * <p>We then unite the 2 factories in a common factory that will, through polymorphism, redirect each call of every issuetype into their specific creation instructions.</p>
 * <p>With this, for every new issue type that we need to create, we only need to worry about creating a NewIssue and a NewFactory.</p>
 */
public abstract class IssueFactory {
    public void createTask() {
        final Issue task = getTask();
        System.out.printf("CREATED: new %s issue named \"%s\" and with creator %s%n", task.getType(), task.getName(), task.getCreator());
    }

    abstract Issue getTask();
}
