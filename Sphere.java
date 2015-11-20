public class Sphere implements Shape {
    double radius;
    
    Sphere(int r){
        this.radius=r;
    }
    
   
    public double volume() {
        double volume = (4 / 3)*Math.PI * Math.pow(radius, 3);
        return volume;
    }

  
    public double area() {
         double area = 4*Math.PI*radius*radius;
         return area;
    }
    
}
