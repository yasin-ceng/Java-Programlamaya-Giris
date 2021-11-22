package Cozum1;
public class YasinCanMukemmelSayi {
	
	public static boolean MukemmelSayiMi(int MakarnaGelenSayi) {
		int ElmaToplam = 0;	//bölenlerin toplamının atanacağı değişken tanımlanıyor
		
		for(int i=1; i<MakarnaGelenSayi; i++) {	//kullanıcıdan alınan değere kadar olan sayılar için bölenlerinin olup olmadığına bakılıyor
			if(MakarnaGelenSayi%i==0)				//bölenleri var ise bunlar sırayla toplam değişkenine atanıyor
				ElmaToplam += i;
		}
		
		if(ElmaToplam==MakarnaGelenSayi)	//toplam değişkeni ile bölenlerinin kontrol edildiği sayı karşılaştırılıyor
		return true;			//eğer birbirlerine eşit ise mükkemmel sayı olması durumuna true değeri dönüyor
		else
		return false;
	}
	
	public static void AdetSay(int gelenDeger) {
		
		System.out.print("1 ile "+ gelenDeger + " arasındaki Mükemmel Sayılar: ");	//kullanıcıya bilgi veriliyor
		for(int i=1; i<gelenDeger; i++) {	//kullanıcıdan alınan her değer için sırasıyla 1'den gelen değere kadar olan mükemmel sayı kontrolü yapılıyor
		if(MukemmelSayiMi(i)==true)		//eğer kontrol edilen sayı mükemmel sayı ise ekrana yazdırılıyor
		System.out.print(i + " ");
		}
	}
}
