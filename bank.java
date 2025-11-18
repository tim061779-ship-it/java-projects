import java.util.Scanner;
public class bank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //JAVA BANKING
        boolean iSRunning = true;

       double balance=1000;
       boolean isRunning = true;
       int choice;

        while(isRunning){System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1.Show balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("***************");

        System.out.println("Enter your choice(1-4): ");
        choice = scanner.nextInt();

        switch(choice){
            case 1-> showBalance(balance);
            case 2 ->deposit(balance);
            case 3-> withdraw(balance);
            case 4 -> System.out.println("Thank you");




        }
        }







        //showBalance()

        //deposit()

        //withdraw()

        //EXIT






        scanner.close();


        }
        static void showBalance(double balance){
        System.out.printf("$%.2f",balance);
    }
        static void deposit(double balance){
        double amount;
            do {
                System.out.println("Enter an amount to be deposit");
                amount = scanner.nextDouble();
            }while (amount<0);
            balance += amount;
            System.out.printf("Now your balance is %.2f",balance);
            }
        static void withdraw(double balance){
            double withdraw;
            System.out.println("Withdraw:");
            withdraw = scanner.nextDouble();
            balance -=withdraw;
            System.out.printf("Now your balance is %.2f",balance);

    }



        }















