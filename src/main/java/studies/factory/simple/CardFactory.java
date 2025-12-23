package studies.factory.simple;

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
