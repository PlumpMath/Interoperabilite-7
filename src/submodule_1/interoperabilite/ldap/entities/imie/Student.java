package submodule_1.interoperabilite.ldap.entities.imie;

public class Student extends User {
	private Promotion promotion;

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	
	public Student(int id, String firstname, String lastname, String login, String password, byte[] guid, Promotion promotion) {
		super(id, firstname, lastname, login, password, guid);
		this.promotion = promotion;
	}
}
