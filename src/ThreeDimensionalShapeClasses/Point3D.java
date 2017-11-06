
package ThreeDimensionalShapeClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Octavio
 */
public class Point3D
{
    private int x;
    private int y;
    private int z;
    
    public Point3D()
    {
        
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getZ()
    {
        return z;
    }

    @Override
    public String toString()
    {
        return "coord(" + "x=" + x + ", y=" + y + ", z=" + z + ")";
    }
    
    
    
}
