import java.util.ArrayList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        List<String> colors = initList();
        List<String> colorOfMaxLength = new ArrayList();
        int maxLength = 0;
        for (String col : colors) {
            if (col.length() > maxLength) {
                maxLength = col.length();
                colorOfMaxLength.clear();
                colorOfMaxLength.add(col);
            } else if (col.length() == maxLength) {
                colorOfMaxLength.add(col);
            }
        }
        for (String col : colorOfMaxLength) {
            System.out.println(col);
        }
    }

    private static List<String> initList() {
        List<String> result = new ArrayList();
        result.add("blue");
        result.add("red");
        result.add("green");
        result.add("brown");
        result.add("white");
        result.add("cyan");
        result.add("black");
        result.add("gold");
        result.add("gray");
        result.add("beige");
        return result;
    }
}
