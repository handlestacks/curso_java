package secao16.application;

import java.util.Locale;

import secao16.model.entities.AbstractShape;
import secao16.model.entities.Circle;
import secao16.model.entities.Rectangle;
import secao16.model.enums.Color;

public class Shapes {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		AbstractShape s1 = new Circle(Color.GREEN, 2.0);
		AbstractShape s2 = new Rectangle(Color.PINK, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
	}

}
