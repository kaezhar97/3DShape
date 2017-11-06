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
public abstract class Shape3D implements Comparable
{
    private Point3D center;
    
    public Shape3D(int x, int y, int z)
    {
         center = new Point3D(x, y, z);
    }
    
    public double calculateDistanceFromTheOrigin(Point3D centerOfShape)
    {
    
        //Obtaining coordinates from center of shape
        int x = centerOfShape.getX();
        int y = centerOfShape.getY();
        int z = centerOfShape.getZ();
        
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

    @Override
    public String toString()
    {
        return center.toString();
    }
    
    public abstract double calculateSurfaceArea();
    
    public abstract double calculateVolume();
        
    
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
