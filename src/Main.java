import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Lütfen Matematik notunu giriniz: ");
        matematik = input.nextInt();

        System.out.println("Lütfen Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Lütfen Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Lütfen Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Lütfen Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Lütfen Müzik notunu giriniz: ");
        muzik = input.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;

        String str = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(ortalama);
        System.out.println(str);

    }
}