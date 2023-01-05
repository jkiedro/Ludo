import java. util. Random;
public class dice {

    Random rzut = new Random();
    int rzut(){
        int wynik;

        wynik = rzut.nextInt(6)+1;
        System.out.println("wylosowano: "+ wynik);
        return wynik;
    }



    /*int start(int, int[][], int[], int[]){
        int liczba_graczy, kolor_pozycja,
        System.out.println("Podaj liczbę graczy:");
        return 0;
    }*/

    char plansza(){
        String plansza_druk = ("" +
            "               0"+                     "\n"+
            "    d  d       x  x  x       a  a"+    "\n"+
            "    d  d       x     x       a  a"+    "\n"+
            "               x     x "+              "\n"+
            "               x     x "+              "\n"+
            "30 x  x  x  x  x     x  x  x  x  x"+   "\n"+
            "   x                             x"+   "\n"+
            "   x  x  x  x  x     x  x  x  x  x 10"+"\n"+
            "               x     x"+               "\n"+
            "               x     x"+               "\n"+
            "    c  c       x     x       b  b"+    "\n"+
            "    c  c       x  x  x       b  b"+    "\n"+
            "               20"+                    "\n"


        );
        System.out.println(plansza_druk);
        return 0;
    }

}


