import java.util.Scanner;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter 12 digit barcode to receive check digit");
        int[] barcode = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("input digit number " + (i + 1));
            barcode[i] = input.nextInt();

        }


    }



}


