package ro.ase.csie.cts.g1094.dp.simple.factory;

public abstract class AbstractWeapon {

	protected String description;
	protected int powerLevel;
	
	

	public void setDescription(String description) {
		this.description = description;
	}
	public abstract void pewPew();
}
