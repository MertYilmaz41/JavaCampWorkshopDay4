package javaKampDay4.Business.Concrete;

import javaKampDay4.Business.Abstract.ICampaignService;
import javaKampDay4.Business.Abstract.ISellService;
import javaKampDay4.Entities.Concrete.Gamer;

public class GameSellManager implements ISellService{

	private ICampaignService campaignService;
	
	public GameSellManager(ICampaignService campaignService) 
	{
		this.campaignService = campaignService;
	}
	
	@Override
	public void sell(Gamer gamer) 
	{
		campaignService.addCampaign();
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName()  + "  : " + "Oyun satýþý gerçekleþtirildi.");
	}

}
