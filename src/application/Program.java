package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Pensionista;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pensionista[] tenant = new Pensionista[10];
		
		System.out.print("How many rooms are rented? ");
		int response = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1;i <= response;i++) {
			
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			tenant[room] = new Pensionista(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i = 0;i < tenant.length;i++) {
			if(tenant[i] != null) {
				System.out.println(i + ":" + tenant[i]);
			}
			
		}
		
			
		
		sc.close();
		
	}
}
