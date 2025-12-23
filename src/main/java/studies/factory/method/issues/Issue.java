package studies.factory.method.issues;

/**
 * <p>Basis of everything. The entity that will be produced through the factory.</p>
 * <p>It's abstract because it is the common parameters of a group of elements (on this case, common issue parameters of different issue types.</p>
 */
public abstract class Issue {
    public String name;
    public String type;
    public String creator;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCreator() {
        return creator;
    }
}

