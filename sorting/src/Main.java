import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(2, 4, 9, 7, 8, 1);
            var sorted = InsertionSort.sort(list);
            var selection = SelectionSort.sort(list);
        System.out.println(selection);

    }
    }
