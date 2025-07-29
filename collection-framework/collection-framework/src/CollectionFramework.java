import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        collection.add("String");
        collection.add(7899);
        collection.add(false);
        collection.add(8.8);

        System.out.println(collection);
        collection.remove("String");
    }
}
