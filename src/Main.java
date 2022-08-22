import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(kalkulator.add(x,y));
    }
}

    // kalkulator.add(2,3); --dodawanie--
       // System.out.println(kalkulator.add(2,3));

        //kalkulator.subtraction(5,2); --odejmowanie--
        //System.out.println(kalkulator.subtraction(5,2));
    //}

//}
