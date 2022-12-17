package superachallenge;

import java.util.Scanner;

public class Fourth {

    public void fourthChallenge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira quantas frases você quer decifrar: ");
        int number = scan.nextInt();
        String[] array = new String[number];
        for (int count = 0; count < number; count++) {
            System.out.printf("Insira a frase número %d: \n", count + 1);
            String phrase = readScan(scan);
            StringBuilder firstPhrasePart = new StringBuilder(phrase.substring(0, phrase.length() / 2));
            StringBuilder secondPhrasePart = new StringBuilder(phrase.substring(phrase.length() / 2, phrase.length()));
            firstPhrasePart.reverse();
            secondPhrasePart.reverse();
            array[count] = firstPhrasePart.toString() + secondPhrasePart.toString();
        }
        System.out.printf("----------------------------------\n");
        System.out.printf("Resultado: \n");
        for (int count = 0; count < array.length; count++) {
            System.out.println(array[count] + "\n");
        }
    }

    public static String readScan(Scanner reader) {
        String line = reader.nextLine();
        while (line.isEmpty()) {
            line = reader.nextLine();
        }
        return line;
    }

}
