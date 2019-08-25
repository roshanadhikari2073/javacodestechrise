import java.util.Scanner;

public class QuestionOne {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //scanning string from user as question says
        String input=scanner.nextLine();


        String filteredBinaryInput="";

        for(int i=0;i<input.length();i++)
        {


            //taking only 0 And 1 From user Input
            if(input.charAt(i)=='1'||input.charAt(i)=='0')
            {

                filteredBinaryInput+=input.charAt(i);
            }


        }

        //converting the binary to decimal , The radix '2' on below code specifies what value is in the String(for our current case 0 And 1)
        int binaryToDecimal=Integer.parseInt(filteredBinaryInput,2);
        if(binaryToDecimal%4==0)
        {

            System.out.println("The Number is Divisible By 4 ");
        }
        else {

            System.out.println("The Number Is Not Divisible by 4 ");
        }


    }
}
