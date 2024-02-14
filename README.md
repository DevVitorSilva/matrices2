# Matrices 2

Crie um programa para ler dois números inteiros M e N,
 e depois ler uma matriz de M linhas por N colunas contendo 
números inteiros, podendo haver repetições. Em seguida, 
ler um número inteiro X que pertence à matriz. Para 
cada ocorrência de X, mostrar os valores à esquerda, à direita e abaixo de X,
 quando houver, conforme exemplo.

```java
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
        System.out.println("Enter values: ");
        int[][] matrix = new int[lines][columns];
        for(int il = 0; il < lines; il++){
            for(int ic = 0; ic < columns; ic++){
                matrix[il][ic] = sc.nextInt();
            }
        }
        System.out.print("Enter a number to check for repeats in the array: ");
        int repeatNumber = sc.nextInt();
        Integer right = null;
        Integer left = null;
        Integer down = null;
        for (int il = 0; il < lines; il++) {
            for (int ic = 0; ic < columns; ic++) {
                if (matrix[il][ic] == repeatNumber) {
                    try {
                        right = matrix[il][ic + 1];
                    } catch (Exception e) {
                        right = null;
                    }
                    try {
                        left = matrix[il][ic - 1];
                    } catch (Exception e) {
                        left = null;
                    }
                    try {
                        down = matrix[il + 1][ic];
                    } catch (Exception e) {
                        down = null;
                    }
                    System.out.println("Position: line " + il + ", column " + ic);
                }
            }
        }
        if(left != null){
            System.out.println("Left: " + left);
        }

        if (right != null) {
            System.out.println("Right: " + right);
        }

        if(down != null){
            System.out.println("Down: " + down);
        }
        sc.close();
    }
}
```