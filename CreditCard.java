import java.util.Scanner;
 
class CreditCard {
   
 
    static public void main (String[] args)
    {
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 14 - 19 digit credit card number: ");
		String num = input.next();

        if (Validate(num))
            System.out.println("This is a valid card");
        else
            System.out.println("This is not a valid card");
     
    }
    
    
    static boolean Validate(String num)
    {
    	boolean valid = false;
        int init = 0;
        int length = num.length(); 
        //remove last digit & reverse order
        for (int i = length - 1; i >= 0; i--)
        {
            int digits = num.charAt(i) - '0';
        		// doubling digits
            	if (valid == true)
            	digits = digits * 2; 
            	// adding digits
            	init += digits / 10;
            	init += digits % 10;
            	valid = !valid;
        }
        //test if number is equal to 0, if it is its valid
        return (init % 10 == 0);
    }
}
 
