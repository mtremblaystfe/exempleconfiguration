import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double x, y, r;
		System.out.println("Donner l'abscisse du centre: ");
		x = keyboard.nextDouble();
		System.out.println("Donner l'ordonné du centre: ");
		y = keyboard.nextDouble();
		System.out.println("Donner le rayon: ");
		r = keyboard.nextDouble();
			 
		Point centre = new Point(x, y);
		Cercle C = new Cercle(centre, r); //ou Cercle C = new Cercle(new Point(x, y), r);
			 
		System.out.println("\n\n");
		C.Afficher();
		System.out.println("Le périmètre est : "+C.getPerimetre());
		System.out.println("La surface est : " + C.getSurface());
			 
		System.out.println("\nDonner un point: ");
		System.out.println("X:");
		x = keyboard.nextDouble();;
		System.out.println("Y:");
		y = keyboard.nextDouble();
			 
		Point p = new Point(x, y);
		p.Afficher();
		if (C.Appartient(p))
			System.out.println("\nLe point appartient au cercle");
		else
			System.out.println("Le point n'appartient pas au cercle");
			 
		keyboard.nextDouble();	//pause


	}

}
