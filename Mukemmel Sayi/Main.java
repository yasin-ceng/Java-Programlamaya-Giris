package Cozum1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ustLimit = new Scanner(System.in); 
		
		System.out.print("Aralığın Üst Limitini Giriniz: ");	
		int kacAdet = ustLimit.nextInt();	//kullanıcıdan alınan değer kacAdet isimli değişkene atanıyor
		YasinCanMukemmelSayi.AdetSay(kacAdet);		//1'den, üst sınırı kullanıcıdan alınan değere kadar olan sayılar için mükemmel sayı kontrol metodu çağrılıyor
		
		ustLimit.close();
	}
}
