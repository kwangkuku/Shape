public class Cube implements Shape {
    double length;
    
    Cube(int s){
        this.length=s;
    }
    
    
    public double volume() {
        double volume = Math.pow(length, 3);
        return volume;
    }

    
    public double area() {
        double arae = Math.pow(length, 2)*6;
        return arae;
    }
    
}
