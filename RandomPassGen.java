import java.util.Scanner;

public class RandomPassGen {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //Ask the user for how many passwords they want and the length of the passwords

        System.out.println("How Many random Passwords do you want to generated? ");

        int total = in.nextInt();

        System.out.println("How many characters long do you want your random passwords to be? ");
        int length = in.nextInt();

        //Create array to store random Password
        String[] randomPasswords = new String[total];


        // Loop through total number of password
        for (int i=0; i<total; i++){
            
            //Generate one random password

            String randomPassword = "";

            for (int j=0; j< length; j++){
                
                //Generate one random character
               randomPassword += randomCharacter();
            }

            //Add our random password in the array
             randomPasswords[i] = randomPassword;
            
        }
            // Print our array of Passwords
            printPasswords(randomPasswords);

            //print our password password strength
            System.out.println(getPasswordStrength(length));


        
            }

            public static String getPasswordStrength(int length) {
                if (length < 5) {
                    return "Weak";
                }
                else if (length < 10){
                    return "Medium";
                }
                else{
                    return "Strong";
                }
                
            }
            public static void printPasswords(String[] arr) {
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr[i]);
        }
    }

    //'0' - '9' <> 48-57 in ASCII
    //'A' - 'Z' <> 65-90 in ASCII
    //'a' - 'z' <> 97-122 in ASCII

    public static char randomCharacter() {

        //Generate a random number that repsents all possible characters in our password 
        //10 digits + 26 uppercase letters + 26 lowercase letters + 62 possible characters

        int rand = (int) (Math.random() * 62);

        // Break up rand into intervals to represent numbers, 
        //  uppercase letters, and lowercase letters.
        // rand is between 0-61 inclusive.
        // If rand is between 0-9 -> number,
        // If rand is between 10-35 -> uppercase,
        // If rand is between 36-61 -> Lowercase.
        
        if(rand <= 9){
            //number rand is between 0-9 -> 48-57 in ASCII
        
            int ascii = rand + 48; 
            return (char)(ascii);
        }
        else if (rand <= 35) {
           //uppercase letter : rand is between 10-35 -> 65-90 in ASCII 
            int ascii = rand + 55; //65 - 10 = 55
            return (char)(ascii);
        }
        else{
            //lowercase letter : rand is between 35-61 -> 97-122 in ASCII 
            int ascii = rand + 61; // 97-36 = 61
            return (char)(ascii);
        }

    
    }
}
