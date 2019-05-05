import java.util.Arrays;
import java.util.Scanner;

public class Teme {

    public static void Tema1(){
        /*String s = " ";
        for(int i = 0; i < 4; i++){
            s = s + "#";
            System.out.print(s);
        }*/

        String[] array = {"#", "##", "###", "####", "###", "##", "#"};
        for (String sir : array) {
            System.out.print(sir + " ");
        }

        System.out.println();
    }

    public static void Tema2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul dorit: ");
        int n = input.nextInt();
        int nrPasi = 0;

        while(n!=1) {
            if(n % 2 == 0){
                n /= 2;
                nrPasi += 1;
            } else{
                n = 3 * n + 1;
                nrPasi += 1;
            }
        }

        System.out.println("Nr. de pasi este: " + nrPasi);
    }

    public static void Tema3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente al array-ului: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Introduceti numarul pentru pozitia " + i + ": ");
            array[i] = input.nextInt();
        }
        boolean toatePare = false;

        for(int i = 0; i < n; i++) {
            if(array[i] % 2 == 0) {
                toatePare = true;
            }
        }

        int maxImpar = 0;
        for(int i = 0; i < n; i++){
            if(array[i] % 2 !=0 && maxImpar < array[i]){
                maxImpar = array[i];
            }
        }

        if(toatePare && maxImpar == 0) {
            System.out.println("no");
        } else {
            System.out.println("Cel mai mare numar impar din array este " + maxImpar);
        }

    }

    public static void Tema4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente al array-ului: ");
        int n = input.nextInt();
        int[] array = new int[n];
        int nrPare = 0;
        int nrImpare = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Introduceti numarul pentru pozitia " + i + ": ");
            array[i] = input.nextInt();
            if(array[i] % 2 ==0) {
                nrPare += 1;
            } else {
                nrImpare += 1;
            }
        }
        System.out.println("Avem " + nrPare + " numere pare si " + nrImpare + " numere impare.");


    }

}
