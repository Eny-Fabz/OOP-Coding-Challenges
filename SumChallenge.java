
public class SumChallenge {
    public static int sum(int x) {
        if ( x == 2) {
            return 2;
        } 
        else {
            return x + sum(x-1);
        }
    }

    public static void main(String[] args) {
        int answer = sum(7);
        System.out.println("Answer: " + answer);
    }
}