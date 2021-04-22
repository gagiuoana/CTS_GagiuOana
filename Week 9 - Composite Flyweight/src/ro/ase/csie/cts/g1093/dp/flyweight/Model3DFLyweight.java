package ro.ase.csie.cts.g1093.dp.flyweight;

import java.util.ArrayList;

public class Model3DFLyweight implements Model3DInterface{
	
	String name;
	ArrayList<Integer> points = new ArrayList<>();

	public Model3DFLyweight(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display (ScreenData screenDetails) {
		
		System.out.println(String.format(
				"Displaying %s at %d,%d,%d with color %s", name,
				screenDetails.x, screenDetails.y, screenDetails.z,
				screenDetails.textureColor));
		
		
	}

}