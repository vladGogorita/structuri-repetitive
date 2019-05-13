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


    public static void Tema5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul dorit: ");
        int n = input.nextInt();
        for(int i = n; i >= 0; i--) {
            if(i != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Tema6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul dorit: ");
        int n = input.nextInt();
        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void Tema7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti exponentul: ");
        int n = input.nextInt();
        int x = 2 * ((int)Math.pow(3, n));

        int firstDigit = x % 10;
        int remainder = x / 10;
        int secondDigit = remainder % 10;
        int sum = firstDigit + secondDigit;

        System.out.println("The sum of the resulted number's digits is: " + sum);
    }


    public static void Tema8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int a = input.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int b = input.nextInt();

        int x = (int)Math.pow(a, b);

        System.out.println(a + " la puterea a " + b + "-a este " + x);
    }


    public static void Tema9() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul dorit: ");
        int n = input.nextInt();
        int i = 0;

        while (i != n){
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
            i += 1;
        }
    }


    public static void Tema11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti nr. solutiei dorite (1 sau 2): ");
        int solutie = input.nextInt();

        if(solutie == 1){
            System.out.print("Introduceti numarul dorit: ");
            int n = input.nextInt();

            if(n == 0){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 1){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 2){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 3){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 4){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 5){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 6){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 7){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 8){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 9){
                System.out.println("Numarul introdus este " + n);
            }
            else if(n == 10){
                System.out.println("Numarul introdus este " + n);
            }
            else{
                System.out.println("Numar gresit.");
            }
        }
        else if(solutie == 2){
            System.out.print("Introduceti numarul dorit: ");
            int n = input.nextInt();

            switch(n){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Numarul introdus este " + n);
                    break;
                default:
                    System.out.println("Numar gresit din nou.");
                    break;
            }
        }
    }


    public static void Tema12() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti nr. solutiei dorite (1 sau 2): ");
        int solutie = input.nextInt();

        if(solutie == 1) {
            System.out.print("Introduceti numarul lunii dorite: ");
            int month = input.nextInt();

            boolean isSpring = month >= 2 && month < 5;
            boolean isSummer = month >= 5 && month < 8;
            boolean isAutumn = month >= 8 && month < 11;

            if(isSpring){
                System.out.println("Luna " + month + " a anului se incadreaza in anotimpul primavara.");
            }
            else if(isSummer){
                System.out.println("Luna " + month + " a anului se incadreaza in anotimpul vara.");
            }
            else if(isAutumn){
                System.out.println("Luna " + month + " a anului se incadreaza in anotimpul toamna.");
            }
            else{
                System.out.println("Luna " + month + " a anului se incadreaza in anotimpul iarna.");
            }
        }
        else{
            System.out.print("Introduceti numarul lunii dorite: ");
            int month = input.nextInt();

            switch(month){
                case 0:
                case 1:
                case 11:
                    System.out.println("Luna " + month + " a anului se incadreaza in anotimpul iarna.");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Luna " + month + " a anului se incadreaza in anotimpul primavara.");
                    break;
                case 5:
                case 6:
                case 7:
                    System.out.println("Luna " + month + " a anului se incadreaza in anotimpul vara.");
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println("Luna " + month + " a anului se incadreaza in anotimpul toamna.");
                    break;
                default:
                    System.out.println("Luna " + month + " a anului nu exista.");
            }
        }
    }


    public static void Tema13() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul dorit: ");
        int n = input.nextInt();
        for(int i = 0; i <= n; i++){
            if(i < n){
                System.out.println("go");
            }
            else{
                System.out.println("gata");
            }
        }
    }


    public static void Tema14() {
        while(true){
            System.out.println("going");
        }
    }

    public static void Tema18() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti caracterul dorit: ");
        char n = input.next().charAt(0);
        switch(n){
            case 'N':
                System.out.println("N reprezinta punctul cardinal Nord.");
                break;
            case 'E':
                System.out.println("E reprezinta punctul cardinal Est.");
                break;
            case 'S':
                System.out.println("S reprezinta punctul cardinal Sud.");
                break;
            case 'V':
                System.out.println("V reprezinta punctul cardinal Vest.");
                break;
            default:
                System.out.println("Caracterul ales nu reprezinta niciun punct cardinal.");
                break;
        }

    }

}
