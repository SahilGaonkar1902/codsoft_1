import java.util.*;

class guessingGame 
{
    public static void Guess() 
    {
        Random rand = new Random();
        int attempts = 1;
        int randNum = rand.nextInt(1, 100);
        System.out.println(randNum);
        int guessedNum = 0;
        while (randNum != guessedNum) 
        {
            System.out.println("-------------------\nGuess The Number In Least Attempts!\nEnter Your Guess:");
            Scanner obj = new Scanner(System.in);
            guessedNum = obj.nextInt();
            System.out.println("Your Guess:" + guessedNum);
            if (randNum == guessedNum) 
            {
                System.out.println("-------------------");
                System.out.println("You Guessed It Right!\nYour Score:" + attempts);
            } 
            else if (guessedNum < randNum)
            {
                System.out.println("Low!\nTry Again!");
                attempts++;
                System.out.println("Number Of Attempts:" + attempts);
            } 
            else if (guessedNum > randNum) 
            {
                System.out.println("High!\nTry Again!");
                attempts++;
                System.out.println("Number Of Attempts:" + attempts);
            }
        }
    }

    public static void main(String[]args)
    {            
        while(true)
        {
            int select;
            System.out.println("-------------------");
            System.out.println("Menu:\n1.Play Game\n2.Exit\nEnter Choice:");
            Scanner choice = new Scanner(System.in);
            select = choice.nextInt();
            switch(select)
            {
                case 1:
                Guess();
                    break;
                case 2:
                System.exit(0);
            }    
        }
    }
}
