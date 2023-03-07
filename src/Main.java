import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int basNumber=0, toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi=input.nextInt();
        int tempnumber=sayi;
        while (tempnumber != 0) {
            tempnumber /= 10;
            basNumber++;
        }
        for (int i=1; i<=basNumber; i++){
            toplam+=sayi%10;
            sayi=sayi/10;

        }
        System.out.println("Toplam :"+toplam);
    }
}