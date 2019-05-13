import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul temei dorite: ");
        int nrTema = input.nextInt();
        switch(nrTema){
            case 1:
                Teme.Tema1();
                break;
            case 2:
                Teme.Tema2();
                break;
            case 3:
                Teme.Tema3();
                break;
            case 4:
                Teme.Tema4();
                break;
            case 5:
                Teme.Tema5();
                break;
            case 6:
                Teme.Tema6();
                break;
            case 7:
                Teme.Tema7();
                break;
            case 8:
                Teme.Tema8();
                break;
            case 9:
                Teme.Tema9();
                break;
            case 11:
                Teme.Tema11();
                break;
            case 12:
                Teme.Tema12();
                break;
            case 13:
                Teme.Tema13();
                break;
            case 14:
                Teme.Tema14();
                break;
            case 18:
                Teme.Tema18();
                break;
            default:
                System.out.println("Tema aleasa nu exista.");
        }

    }
}
