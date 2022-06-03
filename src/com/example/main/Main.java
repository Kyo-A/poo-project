package com.example.main;

import java.util.ArrayList;
import java.util.List;

import com.example.classes.Adresse;
import com.example.classes.Bureau;
import com.example.classes.Chercheur;
import com.example.classes.Laboratoire;

public class Main {

	public static void main(String[] args) {
		
		// 1- Cr�er une adresse dans la classe Test en utilisant le constructeur C1 .
		// 2- Affecter des valeurs � l�objet adresse cr��e.
		Adresse adr = new Adresse("Rue Massena", "Nice", 2000);
		// 3- Afficher l�objet adresse cr�e.
		adr.afficher();
		// 4- Modifier le code postal de cette adresse.
		adr.modifierCodePostal(1987);
		// 5- Afficher l�objet adresse modifi�.
		adr.afficher();
		// 6- Cr�er une adresse dans la classe Test en utilisant le constructeur C2
		Adresse adr2 = new Adresse("Place de la liberte", "Toulon", 1500);
		// 7- Modifier la ville de cette adresse.
		adr2.modifierVille("La ciotat");
		// 8- Afficher l�objet adresse modifi�.
		adr2.afficher();
		// 9- Ecrivez la classe Chercheur en ajoutant ses attributs.
		// 10- Cr�er un Chercheur dans la classe Test en utilisant le m�me type de constructeur dans la classe Adresse C1.
		// 11- Affecter des valeurs � ce chercheur.
		Chercheur C = new Chercheur("Francis", "Developpeur", 121651);
		// 12- Afficher toutes les informations relatives � ce chercheur.
		C.afficher();
		// 13- D�clarer dans la classe Chercheur un deuxi�me constructeur param�tr�.
		Chercheur C2 = new Chercheur("Julien", "Integrateur");
		// 14- Afficher toutes les informations relatives � ce chercheur.
		// NB : Vous pouvez utiliser la m�thode toString() .
		System.out.println(C2);
		// 15- Afficher le nombre de chercheurs cr��s.
		System.out.println("Nombre de chercheurs = " + Chercheur.getNbrPersonnes());
		// 16- Ajouter dans la classe Chercheur la m�thode comparer() qui permet de tester l��galit� entre deux chercheurs
		Boolean tes = C2.comparer2(C2);
		if (tes == true)
			System.out.println("les deux chercheurs sont identiques");
		else
			System.out.println("les deux chercheurs sont DIFFERENTS");
		// 17- Modifier le num�ro de l�ordinateur de l�objet chercheur1
		C2.modifierNmac(777777);
		System.out.println(C2);
		// 18- Cr�er un objet chercheur3 sans param�tres
		Chercheur C3 = new Chercheur();
		// 19- Ajouter un nom, un poste et un num�ro de l�ordinateur � l�objet chercheur3
		C3.ajouter("Jean", "techlead", 55555);

		// Cr�er deux Bureaux bureau1 et bureau2, chaque bureau contient 3 chercheurs
		List<Chercheur> staff = new ArrayList<>();
		staff.add(C);
		staff.add(C2);
		staff.add(C3);
		
		Bureau B1 = new Bureau(111, "bur1", staff);
		Bureau B2 = new Bureau(222, "bur2", staff);
		List<Bureau> bureaux = new ArrayList<>();
		
		bureaux.add(B1);
		bureaux.add(B2);
		
		// Cr�er un Laboratoire laboratoire1 qui contient deux bureaux.
		Laboratoire L = new Laboratoire("lab1", "spce1", adr, bureaux);
		System.out.println("------------------------------------------------");
		// 22- Afficher les caract�ristiques de l�objet laboratoire1.
		L.afficher();
		

	}

}
