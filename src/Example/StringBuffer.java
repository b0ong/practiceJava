package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringBuffer {
    public static void main(String[] args) {
//        String[] data = {"111", "112", "113", "124"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("112", "124", "113", "111"));
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);
        }
}
