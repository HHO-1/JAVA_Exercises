package Exercises_Habip.Udemy.OOPs.ATMProjesi;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Mustafa Murat", "12345", 2000);

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor.");
    }


}
