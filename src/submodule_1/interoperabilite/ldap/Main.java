package submodule_1.interoperabilite.ldap;

import java.util.ArrayList;

import submodule_1.interoperabilite.json.manager.JsonManager;
import submodule_1.interoperabilite.ldap.entities.LdapItem;
import submodule_1.interoperabilite.ldap.entities.imie.Promotion;
import submodule_1.interoperabilite.ldap.entities.imie.Student;
import submodule_1.interoperabilite.ldap.entities.imie.Teacher;
import submodule_1.interoperabilite.ldap.entities.imie.User;
import submodule_1.interoperabilite.ldap.manager.LdapManager;

public class Main {
	public static void main(String[] args) {
		// LdapManager.getInstance().request("OU=Utilisateurs,OU=Formation,OU=RENNES,OU=Sites");
//		ArrayList<LdapItem> items = LdapManager.getInstance().requestInspector(
//				"OU=CPCSI,OU=Eleves,OU=Utilisateurs,OU=Formation,OU=RENNES,OU=Sites", false);
//	
//		//LdapManager.getInstance().getStudents();
//
//		JsonManager.getInstance().clear();
//
//		System.out.println("/////////////////////////");
//
//		for (LdapItem ldapItem : items) {
//			 JsonManager.getInstance().addItem(ldapItem);
//			System.out.println("Name : " + ldapItem.getName() + "\n" + "ou : "
//					+ ldapItem.getOu() + "\n" + "ouTree : "
//					+ ldapItem.getOuTree());
//			ldapItem.printRecLdapItem("  .");
//		}

//		JsonManager.getInstance().sendToFile("ldap.json");
		/*OU=Eleves,OU=Utilisateurs,OU=Formation,OU=RENNES,OU=Sites
		OU=Formateurs_Externes,OU=Utilisateurs,OU=Formation,OU=RENNES,OU=Sites*/

		//LdapManager.getInstance().requestInspector("OU=Sites", true);
		
//		ArrayList<Promotion> items2 = LdapManager.getInstance().getAllPromotions("RENNES");
//
//		for (Promotion promotion : items2) {
//			System.out.println(promotion.getName() + " : " + promotion.getYears() + " : " + promotion.getOu());
//			LdapManager.getInstance().getStudentsByPromotion(promotion);
//			for (User user : promotion.getUsers()) {
//				System.out.println(user.getFirstname() +" : "+ user.getGuid());
//			}
//		}
//
//
//
//
//		ArrayList<Promotion> promos = LdapManager.getInstance().getAllPromotions("RENNES");
//		ArrayList<Student> users = LdapManager.getInstance().getStudentsByPromotion(promos.get(1));
//		LdapManager.getInstance().getStudentsByPromotion(promos.get(2));
//		LdapManager.getInstance().getStudentsByPromotion(promos.get(3));
//		LdapManager.getInstance().getStudentsByPromotion(promos.get(4));
//		LdapManager.getInstance().getStudentsByPromotion(promos.get(5));
//
//		for (Promotion promotion : promos) {
//			System.out.println(promotion.getName() + " : " + promotion.getYears());
//			for (User user : promotion.getUsers()) {
//				System.out.println("  =>  " + user.getFirstname());
//			}
//		}
		
		ArrayList<Teacher> teachers = LdapManager.getInstance().getAllTeachers("RENNES");
		for(Teacher teacher : teachers){
		    System.out.println("=>"  + teacher.getFirstname() + " " + teacher.getLastname());
		}

		submodule_1.interoperabilite.json.Main.importData(teachers, "Teachers.json", "/json/");

	}

}
