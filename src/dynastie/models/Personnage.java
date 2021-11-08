package dynastie.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Personnage {
	protected Dynastie dynastie;
	protected List<Personnage> enfants;
	protected Homme pere;
	protected Femme mere;

	private String nom;
	private String surnom;
	private int naissance;
	private int deces;

	public Personnage(String nom, String surnom) {
		this.nom = nom;
		this.surnom = surnom;
		this.enfants = new ArrayList<Personnage>();
	}

	public Personnage(){}

	public String getNom() {
		return this.nom;
	}

	public Personnage setNom(String nom) {
		this.nom = nom;
		return this;
	}

	public String getSurnom() {
		return this.surnom;
	}

	public Personnage setSurnom(String surnom) {
		this.surnom = surnom;
		return this;
	}

	public int getNaissance() {
		return this.naissance;
	}

	public Personnage setNaissance(int naissance) {
		this.naissance = naissance;
		return this;
	}

	public int getDeces() {
		return this.deces;
	}

	public Personnage setDeces(int deces) {
		this.deces = deces;
		return this;
	}

	public void naitre(int annee) {
		this.naissance = annee;
	}

	public void mourir(int annee) {
		this.deces = annee;
	}

	public Dynastie getDynastie() {
		return dynastie;
	}

	public void setDynastie(Dynastie dynastie) {
		this.dynastie = dynastie;
	}

	public List<Personnage> getEnfants() {
		return enfants;
	}

}
