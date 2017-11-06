/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ThreeDimensionalShapeClasses;

import java.util.Comparator;

/**
 *
 * @author Octavio
 */
public class SortByDistanceFromTheOrigin implements Comparator<Shape3D>
{
    public int compare (Shape3D a, Shape3D b)
    {
        return (int)(b.calculateDistanceFromTheOrigin() - a.calculateDistanceFromTheOrigin());
    }
    
}
