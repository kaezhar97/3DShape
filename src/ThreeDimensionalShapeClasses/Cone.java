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
        
         center = new Point3D(center.getX(), center.getY(), center.getZ());
         this.height = height;
         this.radius = radius;
    }
    
    public double calculateSurfaceArea()
    {
        return 0.0;
    }
    
    public double calculateVolume()
    {
        return 0.0;
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
