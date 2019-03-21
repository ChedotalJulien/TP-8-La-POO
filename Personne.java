
public class Personne {
	public String nom;
	public String prenom;
	public String adresse;
	public int age;
	public Ville villedenaissance;
	
	public static void main(String[] args) {		
		Personne p1 = new Personne();
	}
	
	public Personne() {
		
	}
	
	public Personne(String n, String p, String ad, int age, Ville villedenaissance){
		this.nom = n;
		this.prenom = p;
		this.adresse = ad;
		this.age = 51;
		this.villedenaissance = villedenaissance;
	
	}
	
	public String getNom(){
		return nom;
	}
	public void setNom(String n) {
		this.nom = n;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String p) {
		this.prenom = p;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String ad) {
		this.adresse = ad;
	}

	public Ville getVille() {
		return villedenaissance;
	}
	
	public void setVilledenaissance(String ville) {
		this.villedenaissance = villedenaissance;
	}
}
	
