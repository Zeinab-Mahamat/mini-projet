/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionp;

/**
 *
 * @author ADMIN
 */
public abstract class Employe {
	private String nom;
	private String prenom;
	private int age;
	private String date;
	
	
	public Employe(String prenom, String nom, int age, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

	public abstract double calculerSalaire();

	public String getTitre()
		{
			return "L'employé " ;
		}
	
	public String getNom() {
		return getTitre() + prenom + " " + nom;
	}
}

/* **********************************************************************
 *  La classe Commercial (regroupe Vendeur et ReprÃ©sentant)
 * **********************************************************************/
abstract class Commercial extends Employe {
	private double chiffreAffaire;

	public Commercial(String prenom, String nom, int age, String date,
			   double chiffreAffaire) {
		super(prenom, nom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	public double getChiffreAffaire()
		{
			return chiffreAffaire;
		}
	
}
