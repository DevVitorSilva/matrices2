import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of lines: ");
        int lines = sc.nextInt();
        System.out.print("Enter a number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[lines][columns];
        for(int il = 0; il < lines; il++){
            for(int ic = 0; ic < columns; ic++){
                matrix[il][ic] = sc.nextInt();
            }
        }
        sc.close();
    }
}