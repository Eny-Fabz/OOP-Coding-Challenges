public class Variables {
    void displayInterest() {
        double initialValue;
        double interest;

        initialValue = 5600.00;
        System.out.println("Initial amount: " + initialValue);

        interest = 7.00;
        initialValue = initialValue * (100 + interest)/100;
        System.out.println("After 1 year, your amount is: " + initialValue);

        initialValue = initialValue * (100 + interest)/100;
        System.out.println("After the 2nd year, your amount is: " + initialValue);
    }

    public static void main(String[] args){
        (new Variables()).displayInterest();
    } 
    }
