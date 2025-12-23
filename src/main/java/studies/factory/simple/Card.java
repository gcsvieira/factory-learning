package studies.factory.simple;

/**
 * <p>The basis of everything. Here you'll configure the parameters of the single unit of entity</p>
 */
public abstract class Card {
    public String title;
    public String origin;
    public String owner;

    public String getTitle() {
        return title;
    }

    public String getOrigin() {
        return origin;
    }

    public String getOwner() {
        return owner;
    }
}
