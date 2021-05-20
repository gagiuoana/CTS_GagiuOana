package ro.ase.csie.cts.g1093.dp.observer;

public class BackupModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		// TODO Auto-generated method stub
		System.out.println("Display restore points");
	}

	@Override
	public void connectionDown() {
		// TODO Auto-generated method stub
		System.out.println("Create a restore point");
	}
	

}
