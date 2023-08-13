import java.net.Socket;
import java.util.Scanner; //Scanner class For Input the Marks 
public class GradeCalci {
    public static void main(String[] args) {
       Scanner input =new Scanner (System.in); //this is how we name our scanner , our scanner name has been given an input , we can name it anything . 
     //input the marks that are going to be added 
      int mark; // integer marks variable
       System.out.println("Enter Mark: ");  
       mark = input.nextInt(); // Allow the user to input/Enter the marks  Input = Scanner name

       // Now start out If/else Statement
    if (mark>=80 && mark<=100)
       {
        System.out.println("Grade A");
       }
    else if (mark>=75 && mark<=79)
       {
        System.out.println("Grade B+");
       }
    else if (mark>=70 && mark<=74)
       {
        System.out.println("Grade B");
       }
    else if (mark>=65 && mark<=69)
       {
        System.out.println("Grade C+");
       }
    else if (mark>=60 && mark<=64)
       {
        System.out.println("Grade C");
       }

    else if (mark>=55 && mark<=59)
       {
        System.out.println("Grade D+");
       }
    
    else if (mark>=50 && mark<=54)
       {
        System.out.println("Grade D");
       }
    
    else if (mark<49)
    {
        System.out.println("Faild");
    }
    
}
}
