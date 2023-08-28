import java.util.Scanner; //Scanner reads user input

public class product {

    //sums integers from 1 to n
        public static void main(String[] args) {
            //input number
            Scanner choice = new Scanner(System.in);
            System.out.println("Choose n");
            String n = choice.nextLine();
            System.out.println("Choice of n is " + n);
            int choicen = Integer.parseInt(n);

            int product = 1;
            for (int tuple_index = 1; tuple_index <= choicen; tuple_index++) {
                product = product * tuple_index;
            }
            System.out.println(product);
        }
    }