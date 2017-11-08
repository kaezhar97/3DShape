/*
 * File: Parallelepiped.java
 * Purpose: Simulates a geometric three dimensional parallelepiped
 */

package ThreeDimensionalShapeClasses;

/**
 * A class that simulates a parallelepiped with a center, length, width, and height
 * @author Octavio Avila-Cardet
 */
public class Parallelepiped extends Shape3D
{
    private Point3D center; // the center coordinate of the parallelepiped 
    private double length; // the length of the parallelepiped
    private double width; // the width of the parallelepiped
    private double height;// the height of the parallelepiped
    
    /**
     * Creates a parallelepiped object
     * 
     * @param center the center coordinate of the parallelepiped
     * @param length the length of the parallelepiped
     * @param width the width of the parallelepiped
     * @param height the height of the parallelepiped
     */
    public Parallelepiped(Point3D center, double length, double width, double height)
    {
        super(center.getX(), center.getY(), center.getZ());
        
        this.center = new Point3D(center.getX(), center.getY(), center.getZ());
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Calculates the surface area of the parallelepiped
     * 
     * @return the surface area of the parallelepiped
     */
    public double calculateSurfaceArea()
    {
        double area = 2 * (length*height + height*width + width*length);
        return area;
    }
    
    /**
     * Calculates the volume of the parallelepiped
     * 
     * @return the volume of the parallelepiped
     */
    public double calculateVolume()
    {
        double volume = length * height * width;
        return volume;
    }
    
    /**
     * Displays the properties of the parallelepiped
     * 
     * @return the name, center, length, width, and height of the parallelepiped
     */
    @Override
    public String toString()
    {
        return           "Parallelepiped "
                + "\n" + "center: " + center.toString() + 
                   "\n" +"length: " + length + 
                   "\n" +"width: "  + width + 
                   "\n" +"height: " + height;
    }
    
    
}
