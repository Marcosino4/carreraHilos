package main;

import java.util.Random;

public class HiloCoche extends Thread{
	private int id;
	private int vueltas = 0;
	

	public HiloCoche(int id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void run() {
		try {
			while(vueltas<10) {
				long espera = (new Random(3000).nextLong() + 500);
				Thread.sleep(espera);
				vueltas++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
