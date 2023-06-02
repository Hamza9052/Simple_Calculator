import java.util.Scanner;

public class Calculation {

    static Scanner numb1 = new Scanner(System.in);
    static Scanner numb2 = new Scanner(System.in);
    static Scanner numb3 = new Scanner(System.in);
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Enter number One:");
        System.out.println();
        double N1 = numb1.nextDouble();
        System.out.println("Enter number Two:");
        System.out.println();
        double N2 = numb2.nextDouble();
        System.out.println();
        System.out.println("choise methode calcule");
        System.out.println("************* ************** ***************");
        System.out.println("1-addition");
        System.out.println("2-subtraction operation");
        System.out.println("3-multiplication");
        System.out.println("4-division process");

        int choise = numb3.nextInt();

        switch (choise) {
            case 1:
                double M1 = N1 + N2;
                System.out.println("Ruselta is :" + M1);
                break;

            case 2:
                double M2 = N1 - N2;
                System.out.println("Ruselta is :" + M2);
                break;

            case 3:
                double M3 = N1 * N2;
                System.out.println("Ruselta is :" + M3);
                break;

            case 4:
                double M4 = N1 / N2;
                System.out.println("Ruselta is :" + M4);
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

    }
    
}
