package main;

import java.util.ArrayList;

public class Podio {
	public ArrayList<HiloCoche> podio;

	public Podio(ArrayList<HiloCoche> podio) {
		this.podio = podio;
	}

	public ArrayList<HiloCoche> getPodio() {
		return podio;
	}

	public void setPodio(ArrayList<HiloCoche> podio) {
		this.podio = podio;
	}
	
	public synchronized boolean contains(HiloCoche coche) {
		return podio.contains(coche);
	}
	
	public synchronized void add(HiloCoche coche) {
		podio.add(coche);
	}
	
	public synchronized void update(HiloCoche coche) {
		podio.set(podio.indexOf(coche), coche);
	}
	
	public synchronized void imprimirPodio() {
		System.out.println("Position |  Car  | Laps");
		System.out.println("-----------------------");
		for (int i = 0; i < podio.size(); i++) {
			if(i<9) {
				if(podio.get(i).getIde().length() > 2) {
					System.out.println((i + 1) + "        |  " + podio.get(i).getIde() + "  | " + podio.get(i).getVueltasTotales());
				}else {
					System.out.println((i + 1) + "        |  " + podio.get(i).getIde() + "   | " + podio.get(i).getVueltasTotales());
				}
			}else if(i>=9) {
				if(podio.get(i).getIde().length() > 2) {
					System.out.println((i + 1) + "       |  " + podio.get(i).getIde() + "  | " + podio.get(i).getVueltasTotales());

				}else {
					System.out.println((i + 1) + "       |  " + podio.get(i).getIde() + "   | " + podio.get(i).getVueltasTotales());
				}
			}
			}
			
		System.out.println("\n");
	}
}
