/*
 * 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan6_Encapsulation;

public class Bus2 {
	private int penumpang;
	private int maxPenumpang;
	
	//konstruktor
	public Bus2(int maxPenumpang) {
		this.maxPenumpang = maxPenumpang;
		penumpang = 0;
	}
	
	public void addPenumpang(int penumpang) {
		int temp;
		temp = this.penumpang + penumpang;
		if (temp > maxPenumpang) {
			System.out.println("Penumpang melebihi kuota");
		}
		else {
			this.penumpang = temp;
		}
	}

	public void cetak() {
		
		
	}

}


