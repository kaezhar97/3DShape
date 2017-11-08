/*
 * File: Sphere.java
Purpose: A class that simulates a 3D sphere
 */

package ThreeDimensionalShapeClasses;

/**
 * A class that simulates a 3D sphere with a center coordinate and a radius
 * 
 * @author Octavio Avila-Cardet
 */
public class Sphere extends Shape3D
{
    private Point3D center; // the center coordinate of the sphere
    private double radius; // the radius of the sphere
    
    /**
     * Creates a 3D sphere
     * 
     * @param center the xyz coordinate of the sphere
     * @param radius the radius of the sphere
     */
    public Sphere(Point3D center, double radius)
    {
        super(center.getX(), center.getY(), center.getZ());
        this.center= new Point3D (center.getX(), center.getY(), center.getZ());
        this.radius=radius;
    }
    
    /**
     * Calculates the surface area of the sphere
     * 
     * @return the surface area of the sphere
     */
    public double calculateSurfaceArea()
    {
        double area = 4 * Math.PI * radius * radius;
        return area;
    }
    
    /**
     * Calculates the volume of the sphere
     * 
     * @return the volume of the sphere
     */
    public double calculateVolume()
    {
        double volume = (4 * Math.PI * radius * radius * radius) / 3 ;
        return volume;
    }

    /**
     * Displays the properties of the sphere
     * 
     * @return the name, center, and radius of the sphere
     */
    @Override
    public String toString()
    {
        return           "Sphere "
                + "\n" + "center: " +center.toString() + 
                   "\n" +"radius: " +radius;
    }
    
   
    
    
}
