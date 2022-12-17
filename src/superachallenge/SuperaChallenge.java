package superachallenge;

import java.util.Scanner;

public class SuperaChallenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite o desafio que quer acessar de 1 até 4: ");
        int challenge = scan.nextInt();
        System.out.printf("----------------------------------\n");

        if (challenge == 1) {
            First first = new First();
            first.firstChallenge();
        }
        if (challenge == 2) {
            Second second = new Second();
            second.secondChallenge();
        }
        if (challenge == 3) {
            Third third = new Third();
            third.thirdChallenge();
        }
        if (challenge == 4) {
            Fourth fourth = new Fourth();
            fourth.fourthChallenge();
        }
    }

}
