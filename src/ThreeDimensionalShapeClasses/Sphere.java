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
public class Sphere extends Shape3D
{
    Point3D center;
    private double radius;
    
    public Sphere(Point3D center, double radius)
    {
        super(center.getX(), center.getY(), center.getZ());
        this.center= new Point3D (center.getX(), center.getY(), center.getZ());
        this.radius=radius;
    }
    
    
    public double calculateSurfaceArea()
    {
        double area = 4 * Math.PI * radius * radius;
        return area;
    }
    
    public double calculateVolume()
    {
        double volume = (4 * Math.PI * radius * radius * radius) / 3 ;
        return volume;
    }

    @Override
    public String toString()
    {
        return           "Sphere "
                + "\n" + "center: " +center.toString() + 
                   "\n" +"radius: " +radius;
    }
    
   
    
    
}
