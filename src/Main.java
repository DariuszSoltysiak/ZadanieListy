import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> nazwyMiast = new LinkedList<>();
        System.out.println("Wprowadz nazwe miasta (znak \"/\" przerywa dodawanie do listy)");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("/")) {
            nazwyMiast.add(input);
            input = scan.nextLine();
            if (input.equals("/")) {
                System.out.println("Bledny znak, zakonczenie programu");
                System.out.println();
            }
        }
        System.out.println("Podane miasta to : ");
        for (String x : nazwyMiast) {
            System.out.println(x);
        }
        System.out.println("Ilosc podanych miast: " + nazwyMiast.size());
    }
}
