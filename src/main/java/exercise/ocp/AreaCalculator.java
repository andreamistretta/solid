package exercise.ocp;

import java.util.List;

public class AreaCalculator {

    public AreaCalculator(){
    }

    public double calculateArea(List<Figures> list){
        double area = 0;
        for(Figures fig: list){
            area += (fig.Area());
        }
        return area;
    }


}
