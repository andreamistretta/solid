package exercise.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OcpApp {

    public static void main(String[] args) {
        //Rectangle rec = new Rectangle(5.0, 6.0);
        //Rectangle rec2 = new Rectangle(5.0, 6.0);
        AreaCalculator calc = new AreaCalculator();
        Circle circ1 = new Circle(5.0);
        Circle circ2 = new Circle(5.0);
        List<Figures> figList = new ArrayList<>();
        figList.add(circ1);
        figList.add(circ2);
        System.out.println("The sum of the areas of the circles is "+calc.calculateArea(figList));
    }
}
