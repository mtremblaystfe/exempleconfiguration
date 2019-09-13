
public class Cercle {
	private Point centre; // Attribut de type Point
	private double rayon;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Cercle(Point p, double r) {
		centre = p;
		rayon = r;
	}

public double getPerimetre()
{
	 return Math.round(2 * Math.PI * rayon);            //Arrondir le résultat à 2 chiffres aprés la virgule.
}

	public double getSurface() {
		return Math.round(Math.PI * rayon * rayon);
	}

	public boolean Appartient(Point p) {
		double dis;
		dis = Math.sqrt(Math.pow(centre.getX() - p.getX(), 2) + Math.pow(centre.getY() - p.getY(), 2));
		// La distance entre le centre du cercle courant et le point passé en paramètre.

		if (dis <= rayon)
			return true;
		else
			return false;
	}

	public void Afficher() {
		System.out.println("CERCLE(" + centre.getX() + "," + centre.getY() + "," + rayon + ")");
	}
}
