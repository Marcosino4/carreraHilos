package main;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		int nCoches = 20;
		ArrayList<HiloCoche> listaCoches = new ArrayList();
		Podio podio = new Podio(new ArrayList<>());
		boolean exit = false;
		for (int i = 0; i <= nCoches; i++) {
			listaCoches.add(new HiloCoche("c" + (i+1), podio));
			listaCoches.get(i).start();
		}
		
		for (HiloCoche coche : listaCoches) {
			while (coche.isAlive()){
				for (int tiempo = 1; tiempo <= 10; tiempo++) {
			        try {
			            Thread.sleep(1000);
			        } catch (InterruptedException e) {
			            Thread.currentThread().interrupt();
			        }
			    int cont = 0;
				for (HiloCoche coche1 : listaCoches) {
					if (coche1.getVueltasTotales() == 10) {
						cont++;
					}
				}
				if (cont == 10) {
					exit = true;
				}
				sort(podio.getPodio());
				for (int i = 0; i < podio.getPodio().size(); i++) {
					System.out.println(
							(i + 1) + " " + podio.getPodio().get(i).getIde() + " " + podio.getPodio().get(i).getVueltasTotales());
				}
				System.out.println("\n");
				}
				

			}
		}
	}
	

	public static void sort(ArrayList<HiloCoche> podio) {
		podio.sort((c2, c1) -> c1.getVueltasTotales().compareTo(c2.getVueltasTotales()));

	}

}
