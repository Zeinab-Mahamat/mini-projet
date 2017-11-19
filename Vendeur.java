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
public class Vendeur extends Commercial {
	private final static double POURCENT_VENDEUR = 0.2;
	private final static int BONUS_VENDEUR = 100;
	public Vendeur(String prenom, String nom, int age, String date,
			double chiffreAffaire) {
		super(prenom, nom, age, date, chiffreAffaire);
	}

	public double calculerSalaire() {
		return (POURCENT_VENDEUR * getChiffreAffaire()) + BONUS_VENDEUR;
	}

	public String getTitre()
		{
			return "Le vendeur ";
		}

}