import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            Main mainObj = new Main();
            mainObj.checkVotingEligibility(age);
        }
        scanner.close();
    }

    void checkVotingEligibility(int age) {
        boolean isEligible = age >= 18;
        
        if (isEligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
