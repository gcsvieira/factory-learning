package studies.factory;

import studies.factory.method.factories.IssueFactory;
import studies.factory.method.factories.ProblemFactory;
import studies.factory.method.factories.TaskFactory;
import studies.factory.simple.CardCreator;

public class Main {
    public static void main(String[] args) {
        final IssueFactory issue1 = new TaskFactory();
        final IssueFactory issue2 = new ProblemFactory();
        issue1.createTask();
        issue2.createTask();

        final CardCreator card = new CardCreator();
        card.createCard("SALES");
        card.createCard("PLOOMES");

    }
}