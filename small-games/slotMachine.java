import java.util.Scanner;
import java.util.Random;
public class slotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        String[] SpinRow;
        String[] row;


        System.out.println("*********************");
        System.out.println("Welcome to java slots");
        System.out.println("symbols:🍋 🍎 🍒 🍉 🍓");
        System.out.println("*********************");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (balance > 0) {
            System.out.println("*********************");
            System.out.printf("Your current balance is $%d\nPlace your bet amount:", balance);

            bet = scanner.nextInt();
            if (bet < 0) {
                System.out.println("bet amount must more than 0");
                continue;
            } else if (bet > balance) {
                System.out.println("not sufficient balance");
                continue;
            } else {
                balance -= bet;
            }
            System.out.println("spinning...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            row = spinRow();
            if(row[0].equals(row[1])&&row[1].equals(row[2])){
                balance+=bet*2;
            }
            else if(row[0].equals(row[1])||row[1].equals(row[2])){
                balance+=bet;
            }
            else{
                System.out.println("maybe next time");
            }
            System.out.println(balance);






        }

    }

static String[] spinRow(){
         String[] symbols={"🍋"," 🍎"," 🍒 ","🍉 ","🍓"};
         String[] row = new String[3];
         Random random = new Random();
    for(int i =0;i<3;i++) {
        row[i] = symbols[random.nextInt(symbols.length)];
    }
    System.out.println(row[0]+row[1]+row[2]);
    return row;
    }












}
