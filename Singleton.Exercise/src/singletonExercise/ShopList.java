package singletonExercise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ShopList {
    private static ShopList instance = null;
    private static Set<String> list = null;

    private ShopList() {
        if (list != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
    public static ShopList getInstance() {
        if (instance == null) {
            synchronized (ShopList.class) {
                if (instance == null) {
                    instance = new ShopList();
                    list = new HashSet<>();
                }
            }
        }
        return instance;
    }

    public Boolean addItem (String item) {
        return list.add(item);
    }

    public List<String> getFood () {
        return list.stream().filter( f -> f.startsWith("Food")).collect(Collectors.toList());
    }

    public List<String> getOther() {
        return list.stream().filter( f -> f.startsWith("Other")).collect(Collectors.toList());
    }

}
