import java.util.*;

public class student_grade {
    double totalmarks, percentage;
    double marks[];
    char grade;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n=sc.nextInt();
        marks=new double[n];


        for(int i=0;i<n;i++){
            System.out.println("Enter mark "+(i+1)+ " out of 100 :");
            marks[i]=sc.nextDouble();

        }



    }
    void calculate(){

        for(int i=0;i<marks.length;i++){
            totalmarks+=marks[i];
        }
        percentage=totalmarks/marks.length;
        if(percentage>=90 && percentage<=100)
        grade='A';
        else if(percentage>=80 && percentage<90 )
        grade='B';
        else if(percentage>=70 && percentage<80)
        grade='C';
        else if(percentage>=60 && percentage<70)
        grade='D';
        else if(percentage>=50 && percentage<60)
        grade='E';
        else
        grade='F';
        
    }


    void display()
    {
        input();
        calculate();

        System.out.println("Total marks obtained : " +totalmarks);
        System.out.println("Average percentage obtained : " +percentage);
        System.out.println("Grade obtained : " +grade);
    }


    public static void main(String args[]){
        student_grade ob=new student_grade();
        ob.display();
    }
}
