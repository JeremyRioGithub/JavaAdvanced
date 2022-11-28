package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class User {
	private String nom;
	private int age;
	private String sexe;
	private int poids;
	private float taille;
	private int page = 1;
	private static double imc;

	public int next() {
		return 0;
	}

	public int calculer() {
		if (User.imc < 18.5) {
			return 2;
		}
		else if (User.imc > 25) {
			return 1;
		}
		else
			return 0;
	}
	public User() {
	}

	public String getNom() {
		return nom;
	}

	public double getImc() {
		return User.imc;
	}

	public void setImc() {
		imc = Math.round(this.poids / (this.taille * this.taille));
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", age=" + age + ", sexe=" + sexe + ", poids=" + poids + ", taille=" + taille
				+ ", page=" + page + ", imc=" + imc + ", User.imc=" + User.imc + "]";
	}

}