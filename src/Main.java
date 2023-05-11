/**
 * @author fazliberkordek
 */
//Harmonica series:
    /*
                            to infinite
    1 + 1/2 + 1/3 + 1/4 ... sum(1/n)
                            from zero
     */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double total = 0;
        System.out.print("N : ");
        n = input.nextInt();

        for (double i = 1;i<=n;i++){
            total+=(1/i);
        }
        System.out.println("total :" + total );
    }
}