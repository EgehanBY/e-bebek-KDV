import java.util.Scanner;
public class KdvHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani, kdvTutari, kdvliTutar;
        System.out.println("Tutarı giriniz: ");
        tutar= input.nextDouble();
        kdvOrani= (tutar>1000) ? 0.08 : 0.18;
        kdvTutari=tutar*kdvOrani;
        kdvliTutar=tutar+kdvTutari;
        System.out.println("Kdv Oranı: " + kdvOrani);
        System.out.println("Kdv Tutarı: " + kdvTutari);
        System.out.println("Kdv'li Tutar: "+ kdvliTutar);

    }
}

