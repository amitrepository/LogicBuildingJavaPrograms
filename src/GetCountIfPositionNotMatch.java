import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetCountIfPositionNotMatch {

    public static void main(String[] args) {
        // List<Integer> list= Arrays.asList(new Integer[]{1, 2, 2, 1, 3, 4, 3});  out put 4
        List<Integer> list = Arrays.asList(new Integer[]{4, 4, 6, 2, 4, 6, 7, 1, 5, 5});
        int count = GetCount(list);
        System.out.println(count);
    }

    private static int GetCount(List<Integer> list) {
        Object[] temp = list.toArray();
        int count = 0;
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (temp[i] != list.get(i)) {
                count++;
            }
        }
        return count;
    }
}

