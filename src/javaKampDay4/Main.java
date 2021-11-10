package javaKampDay4;

import javaKampDay4.Business.Concrete.CampaignManager;
import javaKampDay4.Business.Concrete.GameSellManager;
import javaKampDay4.Business.Concrete.GamerManager;
import javaKampDay4.Core.GamerValidatorAdapter;
import javaKampDay4.Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Mert");
		gamer1.setLastName("Yýlmaz");
		gamer1.setNationalityId("54070251374");
		gamer1.setYearOfBirth(2001);
		
		GamerManager gamerManager = new GamerManager(new GamerValidatorAdapter());
		gamerManager.signUp(gamer1);
		
		GameSellManager gameSellManager = new GameSellManager(new CampaignManager());
		//gameSellManager.sell(gamer1);

	}

}
