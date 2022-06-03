package com.example.classes;

public class Chercheur {
	private int id;
	private String nom;
	private String poste;
	private int nmac;
	private static int count;
	private static int nbrPersonnes;

	public Chercheur(String nom, String poste, int nmac) {
		super();
		this.id = ++count;
		this.nom = nom;
		this.poste = poste;
		this.nmac = nmac;
		nbrPersonnes++;
	}

	public Chercheur(String nom, String poste) {
		super();
		this.id = ++count;
		this.nom = nom;
		this.poste = poste;
		nbrPersonnes++;
	}

	public Chercheur() {
		super();
		nbrPersonnes++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public int getNmac() {
		return nmac;
	}

	public void setNmac(int nmac) {
		this.nmac = nmac;
	}

	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}

	@Override
	public String toString() {
		return "Chercheur [id=" + id + ", nom=" + nom + ", poste=" + poste + ", nmac=" + nmac + "]";
	}

	public void afficher() {
		System.out.println("Nom: " + nom + " Poste: " + poste + " Nmac: " + nmac);
	}

	public Boolean comparer(Chercheur C) {
		if (this.nmac == C.nmac) {
			if (this.nom == C.nom) {
				if (this.poste == C.poste) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Boolean comparer2(Chercheur C) {
		if (this.nmac == C.nmac && this.nom == C.nom && this.poste == C.poste) {
			return true;
		}
		return false;
	}


	public boolean equals(Chercheur o) {
		return nom.equals(o.nom) && poste.equals(o.poste) && nmac == o.nmac;
	}


	public void modifierNmac(int c) {
		nmac = c;
	}

	public void ajouter(String nom, String poste, int nmac) {
		this.id = ++count;
		this.nom = nom;
		this.poste = poste;
		this.nmac = nmac;
	}
}