package Cozum3;

public class YasinCanArmPal {

	private static int kalan;
	private static long armstrong=0;
	private static int i=0;
	private static int j=0;
	private static boolean armstrongYok=true;
	private static boolean polindromYok=true;
	private static boolean esitlikDurumu=true;
	private static int sayininRakamlari[] = new int[8];
	private static int elemanSayisi[] = new int[10];	
	private static int baslangicDegeri[] = new int[10];
	private static int polindromDegeri[] = new int[10];
	
	//Sayı üretmek için oluşturulan metod
	public static void BandirmaSayiUret() {
		//11-1500000 arasında sayılar üretilecek ve ana sayfadaki dizide tutulacak
		for(int i=0;i<10;i++)
			Main.pizza[i]=(int)(Math.random()*500+11);//1499989+11); 
			//üretilen sayilar ekrana yansıtılıyor
		for(i=0;i<10;i++) {
			System.out.print(Main.pizza[i]+" ");
		}
		System.out.println();
	}
	
	//Armstrong sayısı tespit metodu
	public static void BalikesirArm() {
		//yapılacak rakam sayısı ve basamak değerleri ayrımı öncesi dizinin klonu alınıyor
		for(i=0;i<10;i++) 
			baslangicDegeri[i]=Main.pizza[i];
		//her sayı için armstrong durumu kontrol edilmek üzere döngü oluşturuldu
		for(int m = 0; m < 10; m++) {
		
		i = 0;			//kuvvet alınacak basamak sayısı bu değişkene atanır
		armstrong=0;  	//armstrong olan sayı bu değişkene atanır
		
		//sayıların elemanları alarak sayininRakamlari isimli değişkene atanır	
		while(Main.pizza[m] > 0) {		
				//döngüden gelen sayının 10 ile bölümünden kalan alınarak sayının sondan itibaren sırayla rakamları alınıyor
				kalan = Main.pizza[m] % 10;	
				//alınan rakamlar bir diziye atanıyor
				sayininRakamlari[i] = kalan;
				//sayı 10'a bölündüğünde int olarak son rakam alınmayacağından sayının her döngüde bir basamağı düşürülüyor
				Main.pizza[m] = Main.pizza[m] / 10;
				i++;
			}
			//döngü sayısı ile belirlenen rakam sayısı elemanSayisi değişkenine atanıyor
			elemanSayisi[m]=i;
			//elde edilen veriler ile armstrong sayısı hesaplama işlemleri yapılıyor
			for(int n=i-1; n>=0; n--){
				armstrong += (int)Math.pow(sayininRakamlari[n],i);
			}
			//eğer sayı bir armstrong sayısı ise ekrana yansıtılıyor
			if(baslangicDegeri[m] == armstrong) {
				System.out.println("\n" + baslangicDegeri[m]+" bir armstrong sayısıdır");
				armstrongYok=false;
				}
		}
		//Döngü tamamlandığında armstrongYok false etmediyse asrmstrong sayısı olmadığı bilgisi ekrana yansıtılıyor
		if(armstrongYok)
			System.out.println("\nYukarıda Armstrong sayısı yoktur");
	}
	
	//Palindrom tespit metodu
	public static void MakarnaPal() {
		
		//her bir sayının kontrolü için döngü oluşturuluyor
		for(int m = 0; m < 10; m++) {
		//rakamlarına ayrım öncesi sayılar klon diziye aktarılıyor
		polindromDegeri[m]=baslangicDegeri[m];	
		
		
		i = 0;
		esitlikDurumu=true;
				//sayıların elemanları armstrong ile aynı algoritma kullanılarak rakamlarina ayrılıyor 
				while(polindromDegeri[m] > 0) {	 
					kalan = polindromDegeri[m] % 10;
					sayininRakamlari[i] = kalan;
					polindromDegeri[m] = polindromDegeri[m] / 10;
					i++;
				}
				//sayının rakam sayısının 1 eksiği j değişkenine atanıyor
				//buradaki mantık örneğin 5 elemanlı bir sayı için sadece ilk iki ve son iki rakamın karşılaştırılmasının yeterli olmasıdır
				j=i-1;
				//eleman sayısının yarısına kadar n ile ileryene ve j ile sondan geri gelen kontrol işlemi yapılıyor
				for(int n=0; n<i/2; n++){
					//döngüden gelen sayı için rakamların her biri kontrol edilir
					if(sayininRakamlari[n]!=sayininRakamlari[j])
						esitlikDurumu=false;
					j--;
					}
					//döngü içinde esitlik olması halinde esitlikDurumu değişkeni true kalır ve ekrana sayı yansıtılır
					if(esitlikDurumu) {
						System.out.println("\n"+m + " indeksli sayı bir Palindromdur");
						polindromYok=false;
				}
						}
		//ana döngünün sonunda esitlikDurumu hiç true olmadıysa palindromYok true kalır ve ekrana polindrom olmadığı yansıtılır
		if(polindromYok)
				System.out.println("\nYukarıda Polindrom yoktur");
	}}