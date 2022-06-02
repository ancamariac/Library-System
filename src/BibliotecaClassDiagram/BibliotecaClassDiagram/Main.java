package BibliotecaClassDiagram.BibliotecaClassDiagram;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {

		Bibliotecar b1 = new Bibliotecar("Ivan", "Raul", "076856455", "raul.ivan@gmail.com");
		List<Carte> listCarti = new ArrayList<>();
		Biblioteca biblioteca = new Biblioteca(listCarti, b1);

		Autor autor1 = new Autor("Marin", "Radu", "07273238", "radu.marin@gmail.com", "12/02/1995");
		List<Autor> listAutori = new ArrayList<>();
		listAutori.add(autor1);

		Carte carte1 = new Carte(1, "Abecedar", Editura.Corint, Limba.Franceza, 900, 2005, 50, GenCarte.Copii, listAutori);
		Carte carte2 = new Carte(2, "Casa Bantuita", Editura.Booklet, Limba.Engleza, 200, 2000, 10, GenCarte.Horror, listAutori);

		// Adaugare carte in gestiune
		biblioteca.adaugaCarte(carte1);
		biblioteca.adaugaCarte(carte2);
//		biblioteca.afisare();

		// Stergere carte din gestiune
		biblioteca.stergeCarte(carte2);
//		biblioteca.afisare();


		List<Imprumut> listImprumuturi = new ArrayList<>();
		Cititor cititor1 = new Cititor(122, "Savu", "Ion", "03/03/1990", "4322343432", "3ccsdc", "Unirii", "60066438436", listImprumuturi);
		Cititor cititor2 = new Cititor(123, "Anghel", "Marin", "07/09/1978", "4322343432", "3ccsdc", "Independentei", "60066438436", null);

		List<Cititor> listCititori = new ArrayList<>();
		listCititori.add(cititor1);
		
		Imprumut imprumut1 = new Imprumut("30/02/2021", " - ", "20/03/2021", b1, cititor1 , listCarti);

		// Adaugare cititor in gestiune
		biblioteca.adaugaCititor(cititor1);
		biblioteca.adaugaCititor(cititor2);
//		biblioteca.afisare();

		// Stergere cititor din gestiune
		biblioteca.stergeCititor(cititor2);
		biblioteca.afisare();

		// Efectuare un imprumut
		biblioteca.adaugaImprumut(imprumut1, cititor1);
		cititor1.afisare();
//		biblioteca.afisare();


		// Efectuare retur
		biblioteca.incheieImprumut(imprumut1, cititor1, "30/03/2021");
//		cititor1.afisare();
//		biblioteca.afisare();

		//Pierdere carte
		biblioteca.cartePierduta(carte1, cititor1);
//		biblioteca.afisare();

	}

}