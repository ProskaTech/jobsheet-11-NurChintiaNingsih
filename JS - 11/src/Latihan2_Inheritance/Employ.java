/*
 * 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan2_Inheritance;

public class Employ extends Person{
	private String noKaryawan;
	
	//konstruktor
	public Employ (String noKaryawan, String name, int age) {
		super(name, age);
		this.noKaryawan = noKaryawan;
	}
	//metode
	public void info() {
		System.out.println("No. karyawan : "+ this.noKaryawan);
		super.info();

	

	}

}
