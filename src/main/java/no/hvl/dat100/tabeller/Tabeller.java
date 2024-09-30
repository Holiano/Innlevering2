package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)

	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for (int i : tabell) {
			System.out.print(i + ",");
		}
		System.out.print("] ");
	}

	// b) sjå pdf om objekt
	public static String tilStreng(int[] tabell) {
		String a = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i < tabell.length - 1)
				a += String.valueOf(tabell[i] + ",");
			else
				a += String.valueOf(tabell[i]);
		}
		a += "]";
		System.out.println(a);
		return a;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		System.out.println(sum + " er summen av alle tall i tabellen");
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				System.out.println(tall + " finnes i tabellen");
				funnet = true;
				return (true);
			}
		}
		if (!funnet)
			System.out.println(tall + " finnes ikkje");
		return (false);

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				System.out.println("tallet " + tall + " finnes i posisjon " + tabell[i]);
				return i;
			}
		}
		System.out.println(tall + " finnes ikkje");
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] tab = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {

			tab[i] = tabell[tabell.length - 1 - i];

		}
		skrivUt(tabell);
		System.out.print(" reversert er: ");
		skrivUt(tab);
		System.out.println();
		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {

			if (tabell[i + 1] < tabell[i]) {
				System.out.println("tabellen er ikkje sortert");
				return false;
			}
		}
		System.out.println("tabellen er sortert");
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tab = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			// i = 0; i = 2
			tab[i] = tabell1[i];
		}
		
		for (int p = 0; p < tabell2.length; p++) {
			// p = 0; p < 1
			tab[tabell1.length + p] = tabell2[p];
			//3
		}

		return tab;

	}
}
