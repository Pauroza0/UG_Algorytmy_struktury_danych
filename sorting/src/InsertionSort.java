import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class InsertionSort {
    public static List<Integer> sort(List<Integer> list){
        for(int i = 1; i < list.size(); i++){
            int key = list.get(i);
            int j = i-1;

            while(j >= 0 && list.get(j) > key){
                list.set(j+1, list.get(j));
                j = j-1;
            }

            list.set(j+1, key);
        }
        return list;
    }
}
