
public class Ville {
	private String nom;  
	private String pays; 
	private int nbHabitants;

	public Ville  (){
		nom = "";
		pays = "";
		nbHabitants = 0;
	}

	public Ville (String n, String pays, int nbHabitants){
		this.nom = n;
		this.pays = pays;
		this.nbHabitants = nbHabitants;
	}

			public void setNom(String nouveau){
				this.nom = nouveau;
			}
			public String getNom() {
				return nom;
			}
			public void setpays(String n) {
				this.pays = n;
			}
			public String getpays() {
				return pays;
			}
			public void setnbHabitants(int nbHabitants) {
				this.nbHabitants = 0;
			}
			public int getnbHabitants() {
				return nbHabitants;
			}
				
		}



