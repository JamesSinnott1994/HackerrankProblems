package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(productOfArray(list));
    }

    private static int productOfArray(List<Integer> list) {

        if (list.size() == 1) {
            return list.get(0);
        }

        return list.get(0) * productOfArray(list.subList(1, list.size()));
    }

}
