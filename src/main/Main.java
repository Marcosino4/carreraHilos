package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int nCoches = 10;
		ArrayList<HiloCoche> listaCoches = new ArrayList();

		try {
			for (int i = 0; i < nCoches; i++) {
				listaCoches.add(new HiloCoche("c" + i));
				
			}

			for (HiloCoche coche : listaCoches) {
				coche.start();
				coche.join();
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
