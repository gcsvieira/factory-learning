package studies.factory.method.issues;

/**
 * <p>One application of the abstract Issue class. Its an issue of the problem type.</p>
 * <p>Will need to have its own factory class later detailing how problems will be created.</p>
 */
public class ProblemIssue extends Issue{
    public ProblemIssue() {
        super.name = "This is a Problem issue";
        super.type = "problem";
        super.creator = "gcs.vieira";
    }
}
