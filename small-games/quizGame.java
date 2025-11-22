import java.util.Scanner;
public class quizGame {
    public static void main(String[] args){
        // JAVA QUIZ GAME
        String[] questions={"What is the main function of router?",
                            "Which part of the computer is consider the brain?",
                            "What year was Facebook launched",
                            "Who is known as computer father",
                            "What is the first programming language"};
        String[][] options={{"1.Storing files","2.Encrypting data","3.Directing internet traffic","4.Managing passwords"},
                            {"1.CPU","2.Hard Drive","3.RAM","4.GPU"},
                            {"1.2000","2.2004","3.2006","4.2008"},
                            {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charles Babbage"},
                            {"1.COBOL","2.C","3.Fortran","4.Assembly"}};
        Scanner scanner = new Scanner(System.in);
        int[] rightAnswer={3,1,2,4,3};
        int score=0;
        int guess;

        System.out.println("************************");
        System.out.println("Welcome to the QUIZ GAME!");
        System.out.println("************************");



        for (int i =0;i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.println("Enter your guess: ");
            guess=scanner.nextInt();
            if(guess == rightAnswer[i]){
                score+=1;
                System.out.println("*****");
                System.out.println("BINGO!");
                System.out.println("*****");
            }
            else{
                System.out.println("*****");
                System.out.println("WRONG!");
                System.out.println("*****");
            }
        }
        System.out.printf("YOUR SCORE IS %d out of 5",score);

        scanner.close();
    }
}
