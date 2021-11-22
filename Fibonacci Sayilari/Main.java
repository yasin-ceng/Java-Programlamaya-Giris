package Cozum2;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int MakarnaSonuc = 0;  //diğer sınıftan gelen metodun sonucu aktarılır
		int n = 0; //kullanıcıdan alınan değer atanır
		
		Scanner s = new Scanner(System.in);
		
		//FibonacciCan metodu çağrımı	
		System.out.print("(Fibonacci_İteratif)\n Fibonacci serisinin kaçıncı elemanını gösterilsin :");	//kullanıcıdan veri alma talebi için
		n=s.nextInt();
		MakarnaSonuc = YasinCanFibonacci.FibonacciCan(n); ////Fibonacci sınıfındaki Fibonacci1 metoduna n değişkeni gönderilir ve dönen değer sonuc'a atanır
		System.out.println(MakarnaSonuc);
		
		//Fibonacci2 metodu çağrımı
		System.out.print("(Fibonacci_Rikörsif)\n Fibonacci serisinin kaçıncı elemanını gösterilsin :");	//kullanıcıdan veri alma talebi için
		n=s.nextInt();	//kullanıcının klavyeden girdiği değeri n değişkenine atar
		s.close();	
		n-=1;	//Fibonacci serisi 0'dan başladığından fazla kısmı kırpılacak ve girilen sayı adedince ilerleyecektir
		MakarnaSonuc = YasinCanFibonacci.FibonacciYasin(n);	//Fibonacci sınıfındkai Fibonacci2 metoduna n değişkeni gönderilir ve dönen değer sonuc'a atanır
		System.out.println(MakarnaSonuc);//sonuc değişkeni ekrana yazdırılır
		}

}
