package ro.ase.csie.g1093.dp.singleton;

public class PlayerModule {
	
	public PlayerModule() {
		//RESTBackend backend = new RESTBackend ("acs.ase.ro/cts", "get some data");
		RESTBackend backend = RESTBackend.getRESTBackend();
	}

}
