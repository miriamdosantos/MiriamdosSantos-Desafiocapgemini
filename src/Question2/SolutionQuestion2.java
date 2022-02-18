package Question2;
import java.util.Scanner;
public class SolutionQuestion2 {
	// Question 2
	
	
	    public static void main(String args[]) {

	        // taking password from user in runtime
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter Your Password : ");
	        String password = input.nextLine();

	        boolean validPassword = isValidPassword(password);
	        System.out.println(password + " : is Valid & Strong Password > > > " + validPassword);

	    }
	 
	    // this method is taking password as a parameter and it will return that the password is valid or not
	    public static boolean isValidPassword(String password)
	    {
	            // code for checking lenght of password 
	            boolean isValid = true;
	            if (password.length() < 6)
	            {
	                System.out.println("Error : Password must be at least 6 character length.");
	                isValid = false;
	            }


	            // code for checking at least 1 uppercase character
	            String upperCaseChars = "(.*[A-Z].*)";
	            if (!password.matches(upperCaseChars ))
	            {
	                System.out.println("Error : Password must have atleast one uppercase character");
	                isValid = false;
	            }


	            // code for checking at least 1 lowercase character
	            String lowerCaseChars = "(.*[a-z].*)";
	            if (!password.matches(lowerCaseChars ))
	            {
	                System.out.println("Error : Password must have atleast one lowercase character");
	                isValid = false;
	            }


	            // code for checking at least 1 numeric digit 
	            String numbers = "(.*[0-9].*)";
	            if (!password.matches(numbers ))
	            {
	                System.out.println("Error : Password must have atleast one number");
	                isValid = false;
	            }


	            // code for checking at least 1 special character
	            String specialChars = "(.*[@,#,$,%,-,+,(,),*,/,!].*$)";
	            if (!password.matches(specialChars ))
	            {
	                    System.out.println("Error : Password must have atleast one special character among !@#$%^&*()-+");
	                    isValid = false;
	            }
	            return isValid; 
	    
	    
	}
}

