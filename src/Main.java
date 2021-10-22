import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int evenNum = 0;
        int oddNum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("please enter 12 digit barcode to receive check digit");
        int[] barcode = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("input digit number " + (i + 1));
            barcode[i] = input.nextInt();
        }
        // adds the even numbers together then multiplies by 3
        for (int j = 1; j <= 12; j = j + 2) {
            evenNum = evenNum + barcode[j];
        }
        evenNum = (evenNum * 3);

        // adds odd numbers together
        for (int k = 0; k <= 11 ; k = k + 2){
            oddNum = oddNum + barcode[k];
        }
        System.out.println("your check digit is " + (10 - ((evenNum + oddNum) % 10)));
    }
}