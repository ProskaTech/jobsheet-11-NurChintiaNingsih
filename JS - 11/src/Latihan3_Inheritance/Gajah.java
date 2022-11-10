/*
 * 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan3_Inheritance;

public class Gajah extends Hewan{
	
	//meng-overwrite method pada clasas Hewan
	public static void testClassMethod() {
		System.out.println("The class Method in Hewan");
	}
	
	public void testInstanceMethod() {
		System.out.println("The Instance Method in Gajah");
	}
	
	public static void main(String args[]) {
		Gajah myGajah = new Gajah();
		Hewan myHewan = new Hewan();
		Hewan.testClassMethod();
		myHewan.testInstanceMethod();
	}
}
	
	