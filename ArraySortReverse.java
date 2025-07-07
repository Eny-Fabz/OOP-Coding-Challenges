import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        String[] alphs = {"G45", "K12", "X82", "F24"};

        System.out.println("Sorted ....");
        Arrays.sort(alphs);
        for (String alph : alphs) {
            System.out.println("-- " + alph);
        }

        System.out.println("\nReversed ....");
        List<String> alpnList = Arrays.asList(alphs);
        Collections.reverse(alpnList);
        for (String alph : alpnList) {
            System.out.println("-- " + alph);
        }
    }
}
