package ro.ase.csie.cts.g1094.dp.factory.method;

import ro.ase.csie.cts.g1094.dp.simple.factory.AbstractWeapon;
import ro.ase.csie.cts.g1094.dp.simple.factory.WeaponType;

public abstract class AbstractFactory {
	
	
public abstract AbstractWeapon getWeapon(WeaponType type, String description );



}
