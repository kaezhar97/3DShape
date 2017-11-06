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
public class Parallelepiped extends Shape3D
{
    public Parallelepiped(Point3D center, double length, double width, double height)
    {
        super(center.getX(), center.getY(), center.getZ());
    }
    
    public double calculateSurfaceArea()
    {
        return 0.0;
    }
    
    public double calculateVolume()
    {
        return 0.0;
    }
}
