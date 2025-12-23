package studies.factory.simple;

/**
 * This is the object that is going to be responsible to call the Factory. それだけだ。
 */
public class CardCreator {
    public void createCard(final String cardType) {
        final Card card = CardFactory.getCard(cardType);
        System.out.printf("CREATED: new %s card named \"%s\" and with creator %s%n", card.getOrigin(), card.getTitle(), card.getOwner());
    }
}
