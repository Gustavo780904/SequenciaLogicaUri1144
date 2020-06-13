import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, expoente = 0, cubo = 0, coluna2, coluna3;

		N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int x = 0; x < 2; x++){
				if(x == 0) {
				expoente = (int) Math.pow(i, 2);
				cubo = (int) Math.pow(i, 3);
				System.out.println(i + " " + expoente + " " + cubo);
				}else {
				coluna2 = expoente + 1;
				coluna3 = cubo + 1;
				System.out.println(i + " " + coluna2 + " " + coluna3);
				}
			}
		}

		sc.close();

	}

}
