package za.ac.wsu.s219404232.CircleApp;

import za.ac.wsu.s219404232.Circle.Circle;

public class CircleApp {
	public static void main(String[] args) {

		Circle[] circles = new Circle[] {
				new Circle(13, 1, 3, 1),
				new Circle(5, 6, 2, 2),
				new Circle(4, 11, 0, 3)
		};

		for (Circle circle : circles) {
			System.out.println(Circle.ParseCircle(circle));
		}

	}
}