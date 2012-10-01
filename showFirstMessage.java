public class showFirstMessage
{

	private String message;
        private String messageOne;

public static void main(String[] args)
{
 System.out.println("Hello World!  Classic K & R");
}

showFirstMessage()
{
        message = "I hate coffee!  (Not Really)!";
	messageOne = "I need another cup of Chai Tea!";
}

public void displayMessage()
{
	System.out.println(message);
        System.out.println(messageOne);		// Added by Me
}

}
