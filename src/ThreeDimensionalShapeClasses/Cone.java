/*
File: Cone.java
Purpose:
    Simulates a geometric shape cone
 */

package ThreeDimensionalShapeClasses;

/**
 * A class that simulates a three dimensional cone. It has a center, a height, and a radius
 * 
 * @author Octavio Avila-Cardet
 */
public class Cone extends Shape3D
{
    
    private Point3D center; // The xyz coordinate of the center of the cone
    private double height;  // The height of the base of the cone
    private double radius;  // The radius of the cone
    
    /**
     * Creates a 3D cone object
     * 
     * @param center the xyz coordinate of the center of the cone
     * @param radius the radius of the base of the cone
     * @param height the height of the cone
     */
    public Cone(Point3D center, double radius, double height)
    {
        super(center.getX(), center.getY(), center.getZ());
        
         this.center = new Point3D(center.getX(), center.getY(), center.getZ());
         this.height = height;
         this.radius = radius;
    }
    
    /**
     * Calculates the surface area of the cone
     * 
     * @return the surface area
     */
    public double calculateSurfaceArea()
    {
        double slant = Math.sqrt(radius*radius + height*height);
        double area = Math.PI * radius * (radius + slant);
        return area;
    }
    
    /**
     * Calculates the volume of the cone
     * 
     * @return the volume of the cone
     */
    public double calculateVolume()
    {
        double volume = (Math.PI * radius * radius * height) / 3;
        return volume;
    }
    
    /**
     * Displays the properties of the cone
     * 
     * @return the name, center, height, and radius of the cone
     */
    @Override
    public String toString()
    {
        return           "Cone "
                + "\n" + "center: " + center.toString() + 
                     "\n" +"radius: " + radius + 
                   "\n" +"height: " + height;
    }
    
  
}
