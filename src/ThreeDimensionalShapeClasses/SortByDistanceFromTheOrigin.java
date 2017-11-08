/*
 * File: SortByDistanceFromTheOrigin.java
 * Purpose: A class that implements Comparator to compare 3D shapes
 */

package ThreeDimensionalShapeClasses;

import java.util.Comparator;

/**
 * This class is used to compare 3D shapes by their distance from the origin in descending order
 * 
 * @author Octavio Avila-Cardet
 */
public class SortByDistanceFromTheOrigin implements Comparator<Shape3D>
{
    /**
     * Compares two shapes and returns which one should go first and which should go last
     * 
     * @param a the first shape
     * @param b the second shape
     * @return the order in which the shapes should be ordered
     */
    public int compare (Shape3D a, Shape3D b)
    {
        return (int)(b.calculateDistanceFromTheOrigin() - a.calculateDistanceFromTheOrigin());
    }
    
}
