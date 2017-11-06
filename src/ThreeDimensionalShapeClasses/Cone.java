/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ThreeDimensionalShapeClasses;

/**
 *
 * @author Octavio
 */
public class Cone extends Shape3D
{
    
    Point3D center;
    double height;
    double radius;
    
    public Cone(Point3D center, double radius, double height)
    {
        super(center.getX(), center.getY(), center.getZ());
        
         this.center = new Point3D(center.getX(), center.getY(), center.getZ());
         this.height = height;
         this.radius = radius;
    }
    
    public double calculateSurfaceArea()
    {
        double slant = Math.sqrt(radius*radius + height*height);
        double area = Math.PI * radius * (radius + slant);
        return area;
    }
    
    public double calculateVolume()
    {
        double volume = (Math.PI * radius * radius * height) / 3;
        return volume;
    }
    
    @Override
    public String toString()
    {
        return           "Cone "
                + "\n" + "center: " + center.toString() + 
                     "\n" +"radius: " + radius + 
                   "\n" +"height: " + height;
    }
    
  
}
