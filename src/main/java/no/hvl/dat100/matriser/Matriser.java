package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {
			System.out.print("[");

			for (int plass : rad) {

				System.out.print(plass + ",");
			}
			System.out.print("] ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String a = "";
		for (int[] rad : matrise) {
			for (int plass : rad) {
				a += plass + " ";
			}
			a += "\n";
		}
		return a;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] tab = new int[matrise.length][];

		for (int r = 0; r < matrise.length; r++) {

			tab[r] = new int[matrise[r].length];

			for (int p = 0; p < matrise[r].length; p++) {
				tab[r][p] = (matrise[r][p] * tall);

			}

		}
		return tab;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (b.length != a.length) {
			return false;
		} else {
			for (int r = 0; r < b.length; r++) {

				for (int p = 0; p < a[r].length; p++) {

					if (a[r].length != b[r].length) {
						return false;
					} else if (a[r][p] != b[r][p]) {
						return false;
					}
				}

			}
			return true;

		}
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] tab = new int[matrise.length][matrise[0].length];

		for (int r = 0; r < matrise.length; r++) {

			for (int p = 0; p < matrise.length; p++) {

				tab[r][p] = matrise[p][r];

			}
		}

		return tab;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] tab = new int[a.length][b[0].length];

		
			for (int i = 0; i < a.length; i++) {
				
				for (int j = 0; j < b[0].length; j++) {

					for (int x = 0; x < b[0].length; x++) {
						tab[i][j] += (a[i][x] * b[x][j]);
					}
				
					
				}
			}
		return tab;
			}
		}
	