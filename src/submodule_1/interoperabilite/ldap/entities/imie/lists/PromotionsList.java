package submodule_1.interoperabilite.ldap.entities.imie.lists;

import submodule_1.interoperabilite.json.manager.JsonManager;
import submodule_1.interoperabilite.ldap.entities.imie.Promotion;

import java.util.ArrayList;

public class PromotionsList {
	private ArrayList<Promotion> promotions;

	public ArrayList<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(ArrayList<Promotion> promotions) {
		this.promotions = promotions;
	}

	private PromotionsList(){

	}

	/** Instance unique pr�-initialis�e */
	private static PromotionsList INSTANCE = new PromotionsList();

	/** Point d'acc�s pour l'instance unique du singleton */
	public static synchronized PromotionsList getInstance(){
		if (INSTANCE == null) {
			ArrayList<Promotion> promotions = JsonManager.getInstance().<Promotion>readFromFile("imiepromotions.json",".\\config\\imie\\",Promotion.class);
			INSTANCE = new PromotionsList();
			INSTANCE.setPromotions(promotions);
		}
		return INSTANCE;
	}
}
