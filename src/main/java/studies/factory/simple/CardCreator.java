package studies.factory.simple;

public class CardCreator {
    public void createCard(final String cardType) {
        final Card card = CardFactory.getCard(cardType);
        System.out.printf("CREATED: new %s card named \"%s\" and with creator %s%n", card.getOrigin(), card.getTitle(), card.getOwner());
    }
}
