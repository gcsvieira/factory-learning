package studies.factory.simple;

/**
 * <p>A type of Card.</p>
 */
public class SaleCard extends Card{
    public SaleCard() {
        super.title = "This is a sale type of card";
        super.origin = "ActiveCampaign";
        super.owner = "gcs.vieira";
    }
}
