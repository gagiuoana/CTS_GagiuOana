package ro.ase.csie.cts.g1094.dp.factory.method;

import ro.ase.csie.cts.g1094.dp.simple.factory.AbstractWeapon;
import ro.ase.csie.cts.g1094.dp.simple.factory.Bazooka;
import ro.ase.csie.cts.g1094.dp.simple.factory.MachineGun;
import ro.ase.csie.cts.g1094.dp.simple.factory.Pistol;
import ro.ase.csie.cts.g1094.dp.simple.factory.WeaponType;



	public class RealWeaponsFactory extends AbstractFactory{
	    @Override
	    public AbstractWeapon getWeapon(WeaponType type, String desc) {
	        AbstractWeapon weapon = null;
	        switch (type) {
	            case PISTOL:
	                weapon = new Pistol(desc, 100);
	                break;
	            case MACHINE_GUN:
	                weapon = new MachineGun(100, 1000);
	                weapon.setDescription(desc);
	                break;
	            case BAZOOKA:
	                weapon = new Bazooka();
	                weapon.setDescription(desc);
	            default:
	                throw new UnsupportedOperationException("Type not covered");
	        }
	        return  weapon;
	    }
	}
