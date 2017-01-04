package submodule_1.interoperabilite.ldap.entities.imie;

public class Teacher extends User {
	
	public Teacher(int id, String firstname, String lastname, String login, String password, byte[] guid, Promotion promotion) {
		super(id, firstname, lastname, login, password, guid);
	}
}
