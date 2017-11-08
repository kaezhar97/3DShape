
package ThreeDimensionalShapeClasses;

/*
 * File: Point 3D.java
Purpose: Simulates a 3D coordinate point in an xyz plane
 */

/**
 * A class that simulates a 3D point in space
 * 
 * @author Octavio Avila-Cardet
 */
public class Point3D
{
    private int x; // the x coordinate
    private int y; // the y coordinate
    private int z; // the z coordinate
    
    /**
     * Creates a point in an xyz plane
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Point3D(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    /**
     * Gets the x coordinate
     * 
     * @return the x coordinate
     */
    public int getX()
    {
        return x;
    }

    /**
     * Gets the y coordinate
     * 
     * @return the y coordinate
     */
    public int getY()
    {
        return y;
    }

    /**
     * Gets the z coordinate
     * 
     * @return the z coordinate
     */
    public int getZ()
    {
        return z;
    }

    /**
     * Displays the properties of the point
     * 
     * @return the x,y,z coordinates as a string
     */
    @Override
    public String toString()
    {
        return "("+ x + ", " + y + ", " + z + ")";
    }
    
    
    
}
