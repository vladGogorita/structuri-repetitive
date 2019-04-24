
public class Main {

    public static void main(String[] args) {

        //Exercise 1: sa se scrie un program folosind o structura repetitiva, care sa afiseze urmatorul rezultat # ##
        // ###   ####   ###  ##  #
        //Main.Ex1(1);

        String symbol = "";

        for(int s = 0; s < 4; s++) {
            System.out.print(symbol);
            symbol = " " + symbol + "#";
        }

        for(int s = 3; s > 0; s--) {
            System.out.print(symbol);
            symbol = " " + symbol;
        }

        System.out.println(symbol);

        //Exercise 2: se da un numar natural n, (alegeti un int la intamplare). Acestuia i se vor aplica urmatoarele transformari:
        //- daca n este par el devine n/2
        //- daca n este impar, devine 3*n+1

        int n = 7;

        if (n % 2 == 0){
            n = n / 2;
        } else {
            n = 3 * n +1;
        }

        System.out.println("Exercise 2: " + n);





        // Exercise 14: scrieti o bucla infinita care va afisa de n ori "going".

        String infGo = "going";

        /*while(true) {
            System.out.println(infGo);
        }*/

    }
}
