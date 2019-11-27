import java.util.HashMap;
import java.util.Map;

public class Task_7 {

    public static void main(String[] args) {
        Map<String, String> pairs = initMap();
        for (String nextPair : pairs.keySet()) {
            System.out.println(nextPair + " - " + pairs.get(nextPair));
        }
    }

    private static Map<String, String> initMap() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("watermelon", "berry");
        result.put("banana", "fruit");
        result.put("cherry", "berry");
        result.put("pineapple", "fruit");
        result.put("melon", "vegetable");
        result.put("cranberry", "berry");
        result.put("apple", "fruit");
        result.put("iris", "flower");
        result.put("potato", "vegetable");
        result.put("carrot", "vegetable");
        return result;
    }
}
