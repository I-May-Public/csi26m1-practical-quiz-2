package za.ac.wsu.s219404232.Circle;

import java.lang.Math;

public class Circle {

	private static final float pi = (float) Math.PI;
	private int m_circle_id = 0;
	private float m_radius;
	private int m_x;
	private int m_y;

	public static String ParseCircle(Circle circle) {
		String delimiter = ";\n";
		return ("\nCircle " + circle.GetID() + " :\n"
				+ "Position:"
				+ "(x: " + circle.GetXPosition()
				+ ",y: " + circle.GetYPosition() + ")" + delimiter
				+ "radius: " + circle.GetRadius() + delimiter
				+ "Diameter: " + circle.CalculateDiameter() + delimiter
				+ "Circumference: " + circle.CalculateCircumference() + delimiter
				+ "Area: " + circle.CalculateArea() + delimiter);
	};

	public Circle() {
		SetPosition(0, 0);
		SetRadius(0);
	}

	public Circle(int x, int y, float radius, int id) {
		SetPosition(x, y);
		SetRadius(radius);
		SetID(id);
	};

	private void SetID(int id) {
		this.m_circle_id = id;
	};

	public int GetID() {
		return this.m_circle_id;
	};

	public void SetPosition(int x, int y) {
		this.m_x = x;
		this.m_y = y;
	};

	public void SetRadius(float radius) {
		this.m_radius = radius;
	};

	public int GetXPosition() {
		return this.m_x;
	};

	public int GetYPosition() {
		return this.m_y;
	};

	public float GetRadius() {
		return m_radius;
	};

	public float CalculateArea() {
		return pi * this.m_radius * this.m_radius;
	};

	public float CalculateCircumference() {
		return 2 * pi * this.m_radius;
	};

	public float CalculateDiameter() {
		return 2 * this.m_radius;
	};
}