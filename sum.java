import java.util.Scanner; //Scanner reads user input


//sums integers from 1 to n
public class sum {
    public static void main(String[] args) {
        //input number
        Scanner choice = new Scanner(System.in);
        System.out.println("Choose n");
        String n = choice.nextLine();
        System.out.println("Choice of n is " + n);
        int choicen = Integer.parseInt(n);

        int sum = 1;
        for (int index = 1; index <= choicen; index++) {
            sum = sum + index;
        }
        System.out.println(sum);
     }
}