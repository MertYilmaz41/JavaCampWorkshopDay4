package javaKampDay4.Business.Concrete;

import javaKampDay4.Business.Abstract.ICampaignService;


public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign()
	{
		System.out.println("Kampya sisteme eklendi.");
	}

	@Override
	public void updateCampaign() 
	{
		System.out.println("Kampya güncellendi.");
	}

	@Override
	public void deleteCampaign() 
	{
		System.out.println("Kampanya sistemden silind.i");
	}

}
