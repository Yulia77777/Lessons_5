import java.util.HashMap;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {
        Map<String, Integer> vehicles = initMap();
        System.out.println("Total vehicles: " + vehicles.size());
        for (String key : vehicles.keySet()) {
            System.out.println(key + " - " + vehicles.get(key));
        }
    }

    private static Map<String, Integer> initMap() {
        Map<String, Integer> vehicles = new HashMap<String, Integer>();
        vehicles.put("BMW", 5);
        vehicles.put("Zvezda", 7);
        vehicles.put("Slavuta", 4);
        vehicles.put("Focus", 8);
        return vehicles;
    }
}
