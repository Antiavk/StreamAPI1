import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        List<Integer> sortedList = new ArrayList();
        for (int indexList : intList) {
            if ((indexList > 0) && (indexList % 2 == 0)) {
                sortedList.add(indexList);
            }
        }
        Collections.sort(sortedList);
        System.out.println(sortedList);
    }
}