import java.util.Scanner;

public class main {
    public static void main(String[]args){
        atmSoftware();
    }
    static TsBankAtm tsBankAtm = new TsBankAtm();
    public static void atmSoftware() {
        System.out.println("1.add money");
        System.out.println("2.withdraw money");
        System.out.println("3.view balance");
        System.out.println("4.exit");
        
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
          
        switch (userInput){
        case 1 -> {
            System.out.println("enter the amount to be added");
            int userMoney = scanner.nextInt();
            tsBankAtm.addMoney(userMoney);
            atmSoftware();

            }
            case 2 -> {
                System.out.println("enter the amount to be withdrawn");
                int userMoney = scanner.nextInt();
                tsBankAtm.withdrawMoney(userMoney);
                atmSoftware();

            }
            case 3 -> {
                tsBankAtm.viewBalance();
                atmSoftware();
                }
                case 4 -> {
                }
            default -> {
                System.err.println("invalid input try again");
                atmSoftware();
            }
        }
    }
}
