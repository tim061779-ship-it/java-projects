import java.util.Scanner;
public class calculator {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result;
        result=0;
        System.out.println("Enter number1");
        num1 = scanner.nextDouble();
        System.out.println("Enter operator(+,-,*,/)");
        operator = scanner.next().charAt(0);
        System.out.println("Enter number2");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if(num2 ==0){
                    System.out.println("Cannnot devide by 0");
                }
                else{
                    result = num1/num2;
                }
             }

            case '*'-> result = num1*num2;
            case '^'-> result = Math.pow(num1,num2);
            default ->{
                System.out.println("Invalid");
                scanner.close();
                return;
            }
        }

            System.out.println(result);

        scanner.close();








        }



    }
