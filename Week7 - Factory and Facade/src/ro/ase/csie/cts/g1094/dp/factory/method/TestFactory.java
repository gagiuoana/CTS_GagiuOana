package ro.ase.csie.cts.g1094.dp.factory.method;

import ro.ase.csie.cts.g1094.dp.simple.factory.SuperHero;
import ro.ase.csie.cts.g1094.dp.simple.factory.WeaponType;
import ro.ase.csie.cts.g1094.dp.simple.factory.WeaponsFactory;

public class TestFactory {
	
	public static void main(String[] args)
	{
		boolean kidsMode = true;
		SuperHero superman= null;
		
		if (kidsMode)
		{
		 superman = new SuperHero("Superman", new WaterPistol());
			
		}
		else
		{
		superman = new SuperHero("Superhero", WeaponsFactory.getWeapon(WeaponType.PISTOL,""));
			
		}
			AbstractFactory weaponFactory = 
					(kidsMode == true ) ? new WaterWeaponsFactory() : new RealWeaponsFactory();
			superman= new SuperHero ("Superman", weaponFactory.getWeapon(WeaponType.PISTOL, ""));
			superman.setWeapon(weaponFactory.getWeapon(WeaponType.BAZOOKA, ""));
	}

}
