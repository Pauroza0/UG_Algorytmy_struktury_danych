import java.util.List;

public class SelectionSort {
    public static List<Integer> sort(List<Integer> list) {
        var lenght = list.size();
        for(int i = 0; i < lenght - 1; i++){
            int index = i;

            for(int j = i+1; j < lenght; j++){
                if(list.get(j) < list.get(index)){
                    index = j;
                }
            }
            int smallestNumber = list.get(index);
            list.set(index, list.get(i));
            list.set(i, smallestNumber);
        }
        return list;
    }
}
