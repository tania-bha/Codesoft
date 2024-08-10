import java.util.*;

class ATM{
    float Balance=0.00f;
    int PIN=8080;//default Pin

    void checkpin(){
        System.out.println("Enter your Four Digit Pin:");
        Scanner sc=new Scanner(System.in);
        int enteredPIN=sc.nextInt();
        if(enteredPIN==PIN)
        {
            menu();
        }
        else{
            System.out.println("Invalid pin entered");
            checkpin();
        }
    }

    
    void menu(){
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();


        if(choice ==1){
            checkBalance();
        }
        if(choice ==2){
            withdraw();
        }
        if(choice ==3){
            deposit();
        }
        if(choice ==4){
            return;
        }
    }
    void checkBalance(){
        System.out.println("Your current balance is: "+Balance);
        menu();
    }
    
    void withdraw(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn: ");
        float withdraw=sc.nextFloat();

        if(withdraw<=Balance){
            Balance-=withdraw;
            System.out.println("Sucessfully withdrawn");
            System.out.println("Your current balance is: "+Balance);
        }

        else{
            System.out.println("Insufficient fund");
        }
        menu();
    }


    void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        float deposit=sc.nextFloat();

            Balance+=deposit;
            System.out.println("Sucessfully deposited");
            System.out.println("Your current balance is: "+Balance);
        
            menu();
    }
    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkpin();
    }

}



