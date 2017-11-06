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
public class Cone extends Shape3D
{
    public Cone(Point3D center, double height, double radius)
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
