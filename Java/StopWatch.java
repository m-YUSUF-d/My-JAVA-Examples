import java.util.Arrays;
import java.util.Random;

public class StopWatch {
    public static void main(String[] args) {

		Random r=new Random();
		// Bir Random nesnesi oluşturulur.

		int[] sayilar=new int[100000];
		// sayilar adında 100.000 elemanlı bir tamsayı dizisi oluşturulur.
		
		for(int i=0;i<sayilar.length;i++)
			sayilar[i]=r.nextInt();
			// for döngüsü ile bu dizinin her bir elemanına rastgele tamsayı değerleri atanır.
		
		StopWatch_Class sw=new StopWatch_Class();
		// Bir StopWatch nesnesi oluşturulur ve start() metodu çağrılarak zamanlama başlatılır.

		Arrays.sort(sayilar);
		// Arrays sınıfının sort() metodunu kullanarak bir diziyi sıralar.

		sw.stop();
		// stop() metodu çağrılarak zamanlama durdurulur.

		System.out.println("100.000 sayiyi siralamak "+
							sw.getElapsedTime()+" milisaniye sürdü");
		// getElapsedTime() metodu çağrılarak geçen zaman ölçülür ve ekrana yazdırılır.
	}
}
