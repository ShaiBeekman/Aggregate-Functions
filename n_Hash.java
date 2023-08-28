import java.util.Scanner; //Scanner reads user input

public class n_Hash {

    //sums integers from 1 to n
    public static void main(String[] args) {
        //input number
        Scanner choice = new Scanner(System.in);
        System.out.println("Choose n");
        String n = choice.nextLine();
        System.out.println("Choice of n is " + n);
        int choicen = Integer.parseInt(n);
        int nHash = (choicen*(choicen+1))/2;
        System.out.println(nHash);
    }
}