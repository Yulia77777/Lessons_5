import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        List<String> colors = initList();
        int size = colors.size();
        System.out.println("Size of the List = " + size);
        for (String col : colors) {
            System.out.println(col);
        }
    }

    private static List<String> initList() {
        List<String> result = new ArrayList();
        result.add("blue");
        result.add("red");
        result.add("green");
        result.add("yellow");
        result.add("brown");
        return result;
    }
}
