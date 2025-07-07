public class GradingSystem {
    public static void displayGrade(int mark) {
        if (mark > 100 || mark < 0) {
            System.out.println("Invalid marks enetered!");
        } else if (mark >= 90) {
            System.out.println("Grade: A");
        } else if (mark >= 80) {
            System.out.println("Grade: B");
        } else if (mark >= 70) {
            System.out.println("Grade: C");
        } else if (mark >= 60) {
            System.out.println("Grade: D");
        } else if (mark >= 50) {
            System.out.println("Grade: F");
        } else if (mark >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        int mark = 105;

        displayGrade(mark);
}
}
