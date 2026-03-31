import java.util.*;

class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int credit_score = sc.nextInt();
        int income = sc.nextInt();
        int emi = sc.nextInt();
        String employment = sc.next();

        // Step 1: Credit Score Check
        if (credit_score < 600) {
            System.out.println("Rejected");
            return;
        }

        if (credit_score >= 600 && credit_score <= 749) {
            System.out.println("Review");
            return;
        }

        // Step 2: Income & EMI Check
        if (income < 25000) {
            System.out.println("Rejected");
            return;
        }

        if (emi > income * 0.5) {
            System.out.println("Rejected");
            return;
        }

        // Step 3: Employment Check
        if (!(employment.equals("Salaried") || employment.equals("Self-Employed"))) {
            System.out.println("Rejected");
            return;
        }

        // Step 4: Approved + Interest Rate
        if (credit_score >= 800) {
            System.out.println("Approved");
            System.out.println("Interest Rate: 7%");
        } else {
            System.out.println("Approved");
            System.out.println("Interest Rate: 8%");
        }
    }
}