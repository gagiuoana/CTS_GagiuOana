package ro.ase.csie.cts.g1093.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		// TODO Auto-generated method stub
		System.out.println("PopUp: Connections is active");
	}

	@Override
	public void connectionDown() {
		// TODO Auto-generated method stub
		System.out.println("PopUp: Connection to the server is lost");
		
	}
	
	

}
