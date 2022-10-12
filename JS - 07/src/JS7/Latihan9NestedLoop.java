/*
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package JS7;

public class Latihan9NestedLoop {

	public static void main(String[] args) {
		int baris, kolom, hasil_kali;
		int MAKS = 8;
		
		for (baris=1; baris<=MAKS; baris++) //for luar
		{
				for(kolom=1; kolom<=MAKS; kolom++) { //for dalam
				hasil_kali = baris * kolom;
				System.out.print("\t" + hasil_kali);
			}
		System.out.println("");
		}
	}
}