
import ThreeDimensionalShapeClasses.Cone;
import ThreeDimensionalShapeClasses.Cylinder;
import ThreeDimensionalShapeClasses.Parallelepiped;
import ThreeDimensionalShapeClasses.Sphere;
import ThreeDimensionalShapeClasses.Point3D;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Octavio
 */
public class Shape3DTest
{
    
    public static void main (String args[])
    {
        Point3D center = new Point3D (2,-8,5);
        Sphere sphere = new Sphere (center, 17);
    
        center = new Point3D (7,2,9);
        Parallelepiped box = new Parallelepiped(center, 37, 12, 9);
        
        center = new Point3D(3, -4, 5);
        Cylinder cylinder = new Cylinder(center, 10, 13);
        
        center = new Point3D(-5, 2, -1);
        Cone cone = new Cone(center, 11, 14); 
    }
    
   
    
    
}
