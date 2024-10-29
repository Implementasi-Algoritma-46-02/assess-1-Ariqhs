import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner syarat = new Scanner(System.in);

		double lulus = syarat.nextDouble();
		double ipk = syarat.nextDouble();
		int eprt = syarat.nextInt();
		String hki = syarat.next();
		String lomba = syarat.next();

		if (lulus <= 3.0 && ipk >= 3.5) {
			if  (eprt >= 450){
				if (hki.equals("ada")){
					if (lomba.equals("ada"))
					System.out.println("Cumlaude");
		} else {
			System.out.println("Tidak cumlaude");
		}
	}
}
	}
}
			