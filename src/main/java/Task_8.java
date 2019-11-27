import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task_8 {

    private static final String VEGETABLE = "vegetable";
    private static final String FRUIT = "fruit";
    private static final String BERRY = "berry";
    private static final String FLOWER = "flower";

    public static void main(String[] args) {
        Map<String, String> pairs = initMap();
        Set<Map.Entry<String, String>> s = pairs.entrySet();
        for (Map.Entry<String, String> it : s) {
            if (VEGETABLE.equals(it.getValue())) {
                System.out.println(it.getKey());
            }
        }
    }

    private static Map<String, String> initMap() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("watermelon", BERRY);
        result.put("banana", FRUIT);
        result.put("cherry", BERRY);
        result.put("pineapple", FRUIT);
        result.put("melon", VEGETABLE);
        result.put("cranberry", BERRY);
        result.put("apple", FRUIT);
        result.put("iris", FLOWER);
        result.put("potato", VEGETABLE);
        result.put("carrot", VEGETABLE);
        return result;
    }
}
