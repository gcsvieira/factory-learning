package studies.factory.simple;

/**
 * This is the factory object. All the logic related to the creation of the unit of entity will be stored here.
 */
public final class CardFactory {
    public static Card getCard (final String pipeline) {
        switch (pipeline) {
            case "SALES":
                return new SaleCard();
            case "PLOOMES":
                return new PloomesCard();
            default:
                throw new IllegalStateException("Bad card type!");
        }
    }
}
