import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) throws InterruptedException  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TIME?");
        int time;
        time = scanner.nextInt();
        for(int a=1;a<=time;a++){
            System.out.println(a);
            Thread.sleep(1000);


        }
        System.out.println("TIME UP");















        scanner.close();
        }









    }

