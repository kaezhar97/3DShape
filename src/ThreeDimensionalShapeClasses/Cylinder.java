/*
 * File: Cylinder.java
    Purpose: Simulates a geometric three dimensional cylinder
 */

package ThreeDimensionalShapeClasses;

/**
 * A class that simulates a 3D cylinder with a center coordinate, a height, and a radius
 * 
 * @author Octavio Avila-Cardet
 */
public class Cylinder extends Shape3D
{
    
    private Point3D center;  //the center of the cylinder
    private double height; // the height of the cylinder
    private double radius; // the radius of the cylinder
    
    /**
     * Creates a cylinder object
     * 
     * @param center the center coordinate of the cylinder
     * @param radius the height of the cylinder
     * @param height the radius of the cylinder
     */
    public Cylinder(Point3D center, double radius, double height)
    {
        super(center.getX(), center.getY(), center.getZ());
        
         this.center = new Point3D(center.getX(), center.getY(), center.getZ());
         this.height = height;
         this.radius = radius;
    }
    
    /**
     * Calculates the surface area of the cylinder
     * 
     * @return the surface area of the cylinder
     */
    public double calculateSurfaceArea()
    {
        double area = 2 * (Math.PI*radius*radius + Math.PI*radius*height);
        return area;
    }
    
    /**
     * Calculates the volume of the cylinder
     * 
     * @return the volume of the cylinder
     */
    public double calculateVolume()
    {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
    
    /**
     * Displays the properties of the cylinder
     * 
     * @return the name, center, radius, and height of the cylinder
     */
    @Override
    public String toString()
    {
        return           "Cylinder "
                + "\n" + "center: " + center.toString() + 
                   "\n" +"radius: " + radius + 
                   "\n" +"height: " + height;
    }
    
   
}
