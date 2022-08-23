import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int x;
        int y;
        int wybraneDzialanie;


        System.out.println("Czesc, jakie chcesz wykonac dzialanie? Wybierz: 1-dodawanie, 2-odejmowanie, 3-mnozenie, 4-dzielenie");
        Scanner scanner = new Scanner(System.in);
        wybraneDzialanie = scanner.nextInt();

          // if (wybraneDzialanie == 1){
            System.out.println("Wpisz pierwsza cyfre/liczbe");
            x = scanner.nextInt();
            System.out.println("Wpisz druga cyfre/liczbe");
            y = scanner.nextInt();
            //System.out.println("Wynik wynosi " +kalkulator.dodawanie(x,y));
        //}
          // if (wybraneDzialanie == 2)
           //{
             //  System.out.println("Wybrales metode odejmowania, wpisz pierwsza cyfre/liczbe");
               //x = scanner.nextInt();
               //System.out.println("Wpisz druga cyfre/liczbe");
               //y = scanner.nextInt();
               //System.out.println("Wynik wynosi " +kalkulator.odejmowanie(x,y));
           //}
        //if (wybraneDzialanie == 3)
        //{
          //  System.out.println("Wybrales metode mnozenia, wpisz pierwsza cyfre/liczbe");
            //x = scanner.nextInt();
            //System.out.println("Wpisz druga cyfre/liczbe");
            //y = scanner.nextInt();
            //System.out.println("Wynik wynosi " +kalkulator.mnozenie(x,y));
        //}
        //if (wybraneDzialanie == 4)
        //{
          //  System.out.println("Wybrales metode dzielenia, wpisz pierwsza cyfre/liczbe");
            //x = scanner.nextInt();
            //System.out.println("Wpisz druga cyfre/liczbe");
            //y = scanner.nextInt();
            //System.out.println("Wynik wynosi " +kalkulator.dzielenie(x,y));
        //}
          // else {
            //System.out.println("Wybrano blednie, wpisz ponownie");
        //}

           switch (wybraneDzialanie){
               case 1:
                   System.out.println(kalkulator.dodawanie(x,y));
                   break;
               case 2:
                   System.out.println(kalkulator.odejmowanie(x,y));
                   break;
               case 3:
                   System.out.println(kalkulator.mnozenie(x,y));
                   break;
               case 4:
                   System.out.println(kalkulator.dzielenie(x,y));
                   break;
               default:
                   System.out.println("wybrales blednie, wpisz ponownie");
                   break;
                          }
    }}












    // kalkulator.add(2,3); --dodawanie--
       // System.out.println(kalkulator.add(2,3));

        //kalkulator.subtraction(5,2); --odejmowanie--
        //System.out.println(kalkulator.subtraction(5,2));
    //}

//}
