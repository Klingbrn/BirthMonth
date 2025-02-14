import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.println("what is your birth month? enter [1-12]; ");
        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println(trash + " is not an input please restart and try again:");
            }
        }
         else
        {   trash = in.next();
            System.out.println(trash + " is not a valid input. Please restart and try again.");
        }
    }
}