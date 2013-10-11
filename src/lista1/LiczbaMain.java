package lista1;

public class LiczbaMain {

	public static void main(String[] args) {

		try {
			for (int liczbaDoKonwerji = 2; liczbaDoKonwerji < 17; liczbaDoKonwerji++) {

				Liczba zamiana = new Liczba(liczbaDoKonwerji);
				System.out.println(zamiana.konwersjaNaInnySystem(2));
			}
		} catch (LiczbaException e) {
			System.out.println(e.getMessage());
		}
	}
}
