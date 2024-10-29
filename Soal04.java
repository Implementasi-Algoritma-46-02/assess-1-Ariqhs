import java.util.Scanner;

public class Soal04 {
public static double gajian (int lamaKerja, int honorJam) {
	int gaji = lamaKerja * honorJam;
	return gaji;
}
	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner scanner = new Scanner(System.in);
		String kerjaan = scanner.nextLine();
		int lamaKerja = scanner.nextInt();
		int honorJam = 30000;
		
		switch (kerjaan) {
			case "DES":
				double uang = honorJam * lamaKerja;
				System.out.println(uang);
				break;

			case "PRG":
				double gajiPrg = honorJam * lamaKerja + 1200000;
				System.out.println(gajiPrg);
				break;
			
			case "WRT":
				double gajiWrt = honorJam * lamaKerja + 400000;
				System.out.println(gajiWrt);
				break;
			
			case "MKT":
				double gajiMkt = honorJam * lamaKerja + 500000;
				System.out.println(gajiMkt);
				break;
			default:
				break;

		}


	}
}
