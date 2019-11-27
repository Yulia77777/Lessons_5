import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_9 {

    public static void main(String[] args) {
        List<Integer> list = initList();
        System.out.println("Size of list with duplicates = " + list.size());
        Set<Integer> set = new HashSet(list);
        System.out.println("Size of set without duplicates = " + set.size());
    }

    private static List<Integer> initList() {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            Integer nextInt = (int) (Math.random() * 100);
            list.add(nextInt);
        }
        return list;
    }
}

