package red;

public class Point {
	private double x, y;

	public Point(double a, double b) {
		x = a;
		y = b;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;
	}

	public double x() {
		return x;
	}

	public double y() {
		return y;
	}

	public boolean equals(Point p) {
		return (x == p.x && y == p.y);
	}

	public double DistanceTo(Point p) {
		return Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
	}

	public void changecoords(float newx, float newy) {
		x = newx;
		y = newy;
	}

	public String toString() {
		return new String("(" + x + "," + y + ")");
	}

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println("p = " + p);
		Point q = new Point(p);
		System.out.println("q = " + q);
		if (q.equals(p))
			System.out.print("q equals p");
		else
			System.out.print("q does not equal p");
		if (q == p)
			System.out.println(", and q == p");
		else
			System.out.println(", but q != p");
		q.changecoords(5, 6);
		System.out.println("q = " + q);
		System.out.println("p = " + p);
		System.out.println("The distance from q to p is " + q.DistanceTo(p)
				+ " units.");

	}
}
