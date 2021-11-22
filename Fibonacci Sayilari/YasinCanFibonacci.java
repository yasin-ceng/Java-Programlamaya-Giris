package Cozum2;

public class YasinCanFibonacci {	//Fibonacci serisini oluşturur ve SarmaSonuc değerini döndürür

	private static int ElmaEskiSayi=0;	//	Serideki ilk sayı ElmaEskiSayi değişkeni olarak tanımlanmıştır Finoacci serisinin ilk elemanı 0'dır.
	private static int MakarnaYeniSayi=1;	// Serinin ikinci sıradaki elemanı MakarnaYeniSayi değerine atanır ve bu değer başlangıçta 1'dir.
	private static int SarmaSonuc=0;		// Serideki son eleman SarmaSonuc değişkenine atanır
	
	public static int FibonacciCan(int n) {

	
	for(int i=0; i < n-2; i++) {   //İlk iki değer 0 ve 1 olarak zaten mevcut old.dan Main sınıfından gelen n değerinin 2 eksiğine kadar olan döngüyü gerçekleştirir.
		SarmaSonuc=ElmaEskiSayi+MakarnaYeniSayi;	// ilk sayi ve sıradaki ikinci sayının toplamlarını SarmaSonuc değişkenine atar.
		ElmaEskiSayi=MakarnaYeniSayi;		//İkinci gelen sayı artık bir sonraki döngü için ilk eleman olur
		MakarnaYeniSayi=SarmaSonuc;			//Son durumda SarmaSonuc değişkenindeki sayı bir sonraki döngü için ikinci elemandır
	}
	if(n==1)   //eğer girilen sayi 1 ise sonuç 0 olsun
		SarmaSonuc = 0;
	else if(n==2)	//eğer girilen sayi 2 ise SarmaSonuc 1 olsun 
		SarmaSonuc = 1;
	
	return SarmaSonuc;	//döngü tamamlandığında en son gelen SarmaSonuc değeri serinin son elemanıdır
	}
	
	public static int FibonacciYasin(int n) {
		if(n != 1 && n != 0)	//Girilen sayı 0 ve 1 değil ise fibonacci değerleri hesaplansın
		return FibonacciYasin(n - 1) + FibonacciYasin(n - 2);	//fibonacci serisindeki ardı sıra iki değeri toplar ve döndürür 
		else if (n==1) 	//eğer gelen değer 1 ise 1 döndür
			return 1;
		else 	//gelen değer formülasyondan arta kalan son sayı olan 0 ise fonksiyon 0 döndürür
			return 0;
	}
}
