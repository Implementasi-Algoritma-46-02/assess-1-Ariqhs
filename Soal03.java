import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner bil = new Scanner(System.in);

		int bil1 = bil.nextInt();
		int bil2 = bil.nextInt();
		int bil3 = bil.nextInt();

		int menit = bil2 + bil3;

		if (menit > 60) {
			int menit2 = menit - 60;
			int H = bil1 + 1;
			System.out.println("0" + H + ":" + menit2);
		} else {
			System.out.println(bil1 + ":" + (bil2 + bil3));
	}
	}
}
