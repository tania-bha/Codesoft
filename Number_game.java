import java.util.*;
public class Number_game{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int chances=8;
        int c=0;
        boolean OnceMore=true;
        System.out.println("Welcome!!");
        System.out.println("You have " +chances+ " chances to win");
        while(OnceMore){
            int randomNum=getRandomm(1,100);
            boolean correctGuess=false;
            for(int i=0;i<chances;i++){
                System.out.println("chance"+ (i+1)+": Enter your guess!");
                int user=sc.nextInt();
                if(user==randomNum){
                    correctGuess=true;
                    c+=1;
                    System.out.println("Hurray! You won:)");
                    break;
                }
                else if(user>randomNum){
                    System.out.println("You chose too high!");
                }
                else{
                    System.out.println("You chose too low!");
                }

            }
            if(correctGuess==false){
                System.out.println("Oops! No chances left. The number is: "+randomNum);
                System.out.println("You lost :(");
            }
            System.out.println("Do you want to play again?");
            System.out.println("Yes/No");
            String y=sc.next();
            OnceMore=y.equalsIgnoreCase("yes");
        }
        System.out.println("Hope you enjoyed the game!!Play agin later :)");
        System.out.println("Here is your score: "+c);
    }
        public static int getRandomm(int min, int max){
            return (int)(Math.random()*((max-min)+1)+min);
        }

        

       
    }