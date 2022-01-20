import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bulls and Cows game!");
        System.out.println("This is a logical mind games" +
                "\n Here B means one of your guessing number is inside the hidden number and in the right place"
                + "\n Here C means one of your guessing number is inside the hidden number and in the Wrong place ");

        Random random = new Random();
        int intRandom = random.nextInt(99);

        while(intRandom<11){
            intRandom++;
        }

        String s = String.valueOf(intRandom);
        char charRandom1 = s.charAt(0);
        char charRandom2 = s.charAt(1);

        while(true)
        {
            if(charRandom1==charRandom2)
            {
                charRandom1++;
            }
            System.out.println("Enter your guess");
            String strRandom = scanner.nextLine();

            int input = Integer.parseInt(strRandom);
            if(input<10)
            {
                System.out.println("you entered one level number, please enter two level number");
                continue;
            }
            char charInput = strRandom.charAt(0);
            char charInput2 = strRandom.charAt(1);

            if(input==intRandom)
            {
                System.out.println("Congratulations");
                return;
            }
            else if(charRandom1==charInput || charRandom2==charInput2)
            {
                System.out.println("1B,0C");
            }
            else if(charRandom1==charInput2 || charRandom2==charInput)
            {
                System.out.println("0B,2C");
            }
            else if(charRandom1==charInput2 || charRandom2==charInput)
            {
                System.out.println("0B,1C");
            }
            else
            {
                System.out.println("0B,0C");
            }
        }
    }
}
