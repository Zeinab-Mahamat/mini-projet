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
class Technicien extends Employe {
	//private final static double FACTEUR_UNITE = 65.0;
	

	private int unites;

	public Technicien(String prenom, String nom, int age, String date, int unites) {
		super(prenom, nom, age, date);
		this.unites = unites;
	}

	public double calculerSalaire() {
		return 5* unites;
	}

	public String getTitre()
		{
			return "Le technicien ";
		}
}

