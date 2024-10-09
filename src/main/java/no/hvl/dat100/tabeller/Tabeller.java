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
				a += tabell[i] + ",";
			else
				a += tabell[i];
		}
		a += "]";
		return a;
	}


	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;

	}

	// d)
//	public static boolean finnesTall(int[] tabell, int tall) {
//
//		for (int i : tabell) {
//          if (i == tall) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//	}
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
			return false;
		}
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {

            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;  

		}

	// f)
	public static int[] reverser(int[] tabell) {


		int[] tab = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {

			tab[i] = tabell[tabell.length - 1 - i];

		}
		return tab;
	}


	// g)
	public static boolean erSortert(int[] tabell) {

/*
		for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                return false;
            }
        }
        return true;
*/
       
		for (int i = 0; i < tabell.length - 1; i++) {

			if (tabell[i + 1] < tabell[i]) {
				return false;
			}
		}
		return true; 
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tab = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			tab[i] = tabell1[i];
		}

		for (int p = 0; p < tabell2.length; p++) {
			tab[tabell1.length + p] = tabell2[p];

		}

		return tab;
	}
}
