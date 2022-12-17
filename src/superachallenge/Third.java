package superachallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Third {

    public void thirdChallenge() {
        int amount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite a quantidade de números que quer inserir na lista: ");
        int[] array = new int[scan.nextInt()];
        int arrayLength = array.length;
        System.out.printf("Digite o valor alvo: ");
        int targetValue = scan.nextInt();
        for (int count = 0; count < array.length; count++) {
            System.out.println("Insira agora " + array.length + " números em sua lista: ");
            array[count] = scan.nextInt();
        }
        Arrays.sort(array);
        while (arrayLength > 1) {

            for (int count = arrayLength - 1; count > 0; count--) {
                if (array[arrayLength - 1] - array[count - 1] == targetValue) {
                    amount++;
                }
            }

            arrayLength--;
        }
        System.out.println(amount);
    }
}
