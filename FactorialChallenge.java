public class FactorialChallenge {
    public static int factorial(int y) {
        if(y==0 || y==1){
            return 1;
        }
        else {
            return y * factorial(y-1);
        }
    }
    public static void main(String[] args) {
        int answer = factorial(9);
        System.out.println("The factorial of 9 is " + answer);
    }
}
