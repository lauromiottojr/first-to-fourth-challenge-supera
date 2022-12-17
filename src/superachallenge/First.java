package superachallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class First {

    public void firstChallenge() {
        List<Integer> allNumbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        Integer number = 0;

        while (number != 1) {
            System.out.printf("Insira uma número maior que 1 na lista ou digite 1 para parar: ");
            number = scan.nextInt();
            if (number != 0 && number != 1) {
                allNumbers.add(number);
            }
        }

        Collections.sort(allNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                /* here I'm sorting my list on this way:
                    even numbers is showed first  in ascending order
                    odd numbers is showed after descending order
                 */

                // If both numbers are even,
                // smaller number should
                // be placed at lower index
                if (a % 2 == 0 && b % 2 == 0) {
                    return (a - b);
                }

                // If both numbers are odd larger number
                // should be placed at lower index
                if (a % 2 != 0 && b % 2 != 0) {
                    return (b - a);
                }

                // If a is even and b is odd,
                // a should be placed before b
                if (a % 2 == 0) {
                    return -1;
                }

                // If b is odd and a is even,
                // b should be placed before a
                return 0;
            }
        });
        for (int count = 0; count < allNumbers.size(); count++) {
            System.out.println(allNumbers.get(count));
        }
    }
}
