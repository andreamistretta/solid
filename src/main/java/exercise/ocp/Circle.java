package exercise.ocp;

public class Circle implements Figures {
    private final double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    public double Area(){
        return (this.radius*this.radius)*Math.PI;
    }
}
