import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double total = 10.0, perKm = 2.20;

        Scanner inp = new Scanner(System.in);
        System.out.print("KM cinsinden mesafe giriniz:");
        km = inp.nextInt();
        total += (km * 2.20);
        total = (total <= 20) ? 20 : total;
        System.out.println("Toplam Tutar:" + total);

    }
}
