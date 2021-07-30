import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
 ID: breakd1
 LANG: JAVA
 TASK: milk
*/
/**
 * Soluci&oacute;n al Problema: Mezclando Leche
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 24-jun-2021
 *
 */

// All tests OK. xD
public class milk {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("milk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		Scanner Read = new Scanner(in);
//		Scanner Read = new Scanner(System.in);

		//// leyendo los datos
		int n, m;
		Farmer[] farmers;
		int cost = 0; // costo total

		n = Read.nextInt();
		m = Read.nextInt();
		farmers = new Farmer[m];

		for (int i = 0; i < m; i++)
			farmers[i] = new Farmer(Read.nextInt(), Read.nextInt());
		Read.close();

		Arrays.sort(farmers); // ordenando de menor a mayor
		for (int i = 0; i < m && n > 0; i++) {
			if (farmers[i].getQuantity() < n) {
				n -= farmers[i].getQuantity();
				cost += farmers[i].getQuantity() * farmers[i].getPrice();
			} else {
				cost += n * farmers[i].getPrice();
				n = 0;
			}
		}
//		System.out.println(cost);
		out.println(cost);
		out.close();
	}
}

//clase Granjero
class Farmer implements Comparable<Farmer> {

	private int price;
	private int quantity;

	public Farmer(int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public int compareTo(Farmer otherFarmer) {
		return this.price - otherFarmer.price;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}