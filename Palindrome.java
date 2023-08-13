 public class Palindrome{
 
public static void main(String[] args) {
    String str = "leveL";

    String rstr = "";  //reverse string and ("")it is not contaning space.
    char ch;

   // Lets, Declaring a For Loop.
   for(int i=0; i<str.length(); i++){  //0 to length of string 
    
    ch= str.charAt(i); //for every loop you will get the index position.
    rstr = ch + rstr;
   }
    System.out.println(rstr); //print the index position 

    //Applying Condition here-

    if(str.toLowerCase().equals(rstr.toLowerCase())){  //converting both the string in lower case.
        
        System.out.println("String is Palindrome");

    }
    else{
       
        System.out.println("String is not Palindrome");
    }
   
}
}