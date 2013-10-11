package lista1;


public class LiczbaMain {

	public static void main(String[] args) {

		try {

			Liczba zamiana = new Liczba(8);
			System.out.println(zamiana.konwersjaNaInnySystem(2));
		} catch (LiczbaException e) {
			System.out.println(e.getMessage());
		}
	}
	}


