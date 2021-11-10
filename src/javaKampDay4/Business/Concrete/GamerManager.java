package javaKampDay4.Business.Concrete;

import javaKampDay4.Business.Abstract.IGamerService;
import javaKampDay4.Core.IValidatorService;
import javaKampDay4.Entities.Concrete.Gamer;


public class GamerManager implements IGamerService{
	private IValidatorService validatorService;
	
	public GamerManager(IValidatorService validatorService) 
	{
		this.validatorService = validatorService;
	}

	
	@Override
	public void signUp(Gamer gamer) 
	{	
		validatorService.Validate("Kullan�c� do�ruland�.");
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "  : " + "oyuncu sisteme kay�t oldu.");
	}

	@Override
	public void update(Gamer gamer) 
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "  : " + "oyuncu hesab�n� g�ncelledi.");
	}

	@Override
	public void delete(Gamer gamer) 
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "  : " + "oyuncu hesab�n� sildi.");
	}

}
