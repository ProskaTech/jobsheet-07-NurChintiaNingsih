/*
 *  @Created by: 21343011 - Nur Chintia Ningsih
 */
package JS7;

import java.util.Scanner;

public class Tugas1For {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter nama : ");
			String nama = in.nextLine();

			int i = 0;
			while(i <= 10){
			    System.out.println(i +". "+ nama);
			    i++;
			}
		}
    }
    
}
