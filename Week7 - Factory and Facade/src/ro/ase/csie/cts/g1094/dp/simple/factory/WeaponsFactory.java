package ro.ase.csie.cts.g1094.dp.simple.factory;

public class WeaponsFactory {
	
	public static AbstractWeapon getWeapon(WeaponType type, String descprition ) {
		
		
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL :
			weapon = new Pistol(descprition, 100);
			break;
		case MACHINE_GUN :
			weapon = new MachineGun(500,1000);
			weapon.setDescription(descprition);
			break;
		case BAZOOKA :
			weapon = new Bazooka();
			weapon.setDescription(descprition);
			break;
			default:
				throw new UnsupportedOperationException("Type not covered");
				
		}
			return weapon;
			
	}
}
