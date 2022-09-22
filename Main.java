import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, indeks;



      Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu (Metre cisinden) giriniz : " );
        boy = inp.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo = inp.nextDouble();

        indeks = kilo/(boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);




    }
}