import java.util.Arrays;
public class ArraysClear {
    public static void main(String[] args) {
        String[] alphs = { "G45", "K12", "X82", "F24" };

        System.out.println();

        System.out.println("Before: " + alphs[0].toLowerCase());

        Arrays.fill(alphs, 0, 3, null);

        if (alphs[0] != null) {
            System.out.println("After: " + alphs[0].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        System.out.println("Clearing 3 ... count: " + alphs.length);
        for (String alph : alphs) {
            System.out.println("-- " + alph);
        }
    }
}
