package main;

import java.util.Random;

public class HiloCoche extends Thread{
	private String id;
	private int vueltas = 0;
	private boolean finish = false;
	

	public HiloCoche(String id) {
		this.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public void run() {
		try {
			while(vueltas<10) {
				long espera = (new Random(3000).nextLong() + 500);
				Thread.sleep(espera);
				vueltas++;
			}
			finish = true;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
