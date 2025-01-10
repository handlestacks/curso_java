package secao17.application;

import java.util.ArrayList;
import java.util.List;

import secao17.entities.Circle;
import secao17.entities.Rectangle;
import secao17.entities.Shape;

public class Shapes {
	
	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
		
	}
	
	public static double totalArea(List<? extends Shape> list) {
		// list.add(new Rectangle(3.0, 4.0)); // não permite, pois pode ser que foi enviado outro tipo de lista, como circle
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
