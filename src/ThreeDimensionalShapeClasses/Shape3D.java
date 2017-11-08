/*
 * File: Shape3D.java
Purpose: An abstract class that simulates a general 3D shape
 */

package ThreeDimensionalShapeClasses;

/**
 * A class that simulates a 3D shape
 * 
 * @author Octavio Avila-Cardet
 */
public abstract class Shape3D implements Comparable
{
    private Point3D center; // the center coordinate of the 3D shape
    
    /**
     * Creates a 3D shape object
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Shape3D(int x, int y, int z)
    {
         this.center = new Point3D(x, y, z);
    }
    
    /**
     * Calculates the distance of the shape from the origin
     * 
     * @return distance from the origin
     */
    public double calculateDistanceFromTheOrigin()
    {
    
        //Obtaining coordinates from center of shape
        int x = this.center.getX();
        int y = this.center.getY();
        int z = this.center.getZ();
        
        //Squaring coordinates
        x=x*x;
        y=y*y;
        z=z*z;
        
        //Adding up squares
        int sumOfSquares = x+y+z;
        
        /*
            The square root of the sum of the squares of the coordinates is 
        the distance from the origin to the center of the shape
        */
        double distance = Math.sqrt(sumOfSquares);
        
        return distance;
    }

    /**
     * Displays the center of the shape
     * 
     * @return the center coordinate of the shape
     */
    @Override
    public String toString()
    {
        return center.toString();
    }
    
    /**
     * An abstract method that calculates the surface area of the shape
     * 
     * @return the surface area of the shape
     */
    public abstract double calculateSurfaceArea();
    
    /**
     * An abstract method that calculates the volume of the shape
     * 
     * @return the volume of the shape
     */
    public abstract double calculateVolume();
        
    /**
     * Compares one shape with another based on their volumes
     * 
     * @param otherObject the other shape
     * @return the order in which the shapes should be ordered
     */
    public int compareTo(Object otherObject)
    {
        Shape3D otherShape = (Shape3D)otherObject;
        
        if (this.calculateVolume()<otherShape.calculateVolume())
        {
          return -1;  
        }
        
        else if (this.calculateVolume()>otherShape.calculateVolume())
        {
            return 1;
        }
        
        else
        {
            return 0;
        }
        
        
    }

}
