import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //reading String input as in qustion
        String input = scanner.nextLine();

        //checking if the input String contains any scientific notation
        if(input.contains("e"))
        {
            System.out.println("The number is scientific notation");
//exiting the execution from here as we dont need to process furthur
System.exit(0);
        }

        //now we need to check if the string contains either integer or real number
        //this would be easy for us if we implemented it in exception handling

       try{
            //Integer.parse int converts the String value to int throws exception if String contains other than integer
            int inputInt = Integer.parseInt(input);
            if(inputInt>0 && inputInt%1 == 0)
            {
                System.out.println("Positive Integer");

            }
            else {

                System.out.println("Negeative integer");
            }

       }
catch (NumberFormatException e)
{

    float stringToFloat=Float.parseFloat(input);
    if(stringToFloat>0&&stringToFloat%1!=0)
    {

        System.out.println("Positive real number");
    }
    else {

        System.out.println("Neageative Real Number");
    }

}






    }





}
