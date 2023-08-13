


public class StrengthofPass {
    
    public static void main(String[] args) {
        String userPassword = "1234567890abcdAEA";
        System.out.println(passwordStrength(userPassword));
    }

    public static int passwordStrength(String password)
    {
        int score = 0;

        int length = password.length();

        if (length >= 8 && length <= 15)
        {
            score +=1;
        }
        else if (length >= 11 && length <= 15)
        {
            score += 2;
        }
        else if (length >= 16)
        {
            score +=3;
        }
        
        // for checking lower case letter
        if (password.matches ("(?=.*[a-z]).*"))
        {
            score++;
        }
        // for checking upper case letter
        if (password.matches("(?=.*[A-Z]).*"))
        {
            score++;
        }
        // for checking if there is a number
        if (password.matches("(?=.*[0-9]).*"))
        {
            score++;
        }
        if (password.matches("(?=.*[!@#$%^&*]).*"))
        {
            score++;
        }
        return length;
    }
    
}
