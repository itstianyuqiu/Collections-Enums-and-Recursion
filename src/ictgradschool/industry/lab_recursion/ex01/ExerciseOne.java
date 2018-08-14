package ictgradschool.industry.lab_recursion.ex01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 * Questions for Lab 10 Exercise One, involving sorting a bunch of shapes.
 */
public class ExerciseOne {

    /**
     * This method should take the given array of Shapes, and add each one to a TreeSet.
     * <p>
     * Since we're adding to a TreeSet, there should be no duplicates.
     * <p>
     * When we print out the shapes, we should see that they are ordered by perimeter, in ascending order.
     *
     * @param shapes the shapes to sort using a TreeSet.
     */
    private void sortedSetExample(Shape[] shapes) {

        Set<Shape> shapeSet = new TreeSet<>();

        for (int i = 0; i < shapes.length; i++) {

            Shape s = shapes[i];
            shapeSet.add(s);
        }


        // Print out the result. Do not edit below this line.
        NumberFormat formatter = new DecimalFormat("#.##");
        System.out.println("Number of shapes in set: " + shapeSet.size());
        for (Shape s : shapeSet) {

            System.out.println(" - " + s + " has a perimeter of: " + formatter.format(s.getPerimeter()) + "cm");

        }
    }

    /**
     * This method should take the given array of Shapes, and add each one to an ArrayList.
     * <p>
     * We should then sort the ArrayList using the Collections.sort method, supplying a Comparator which sorts by
     * the number of sides (ascending) then by area (descending).
     *
     * @param shapes
     */
    private void comparatorExample(Shape[] shapes) {

        List<Shape> shapeList = new ArrayList<>();

        for (int i = 0; i < shapes.length; i++) {
            Shape s = shapes[i];
            shapeList.add(s);
        }

        // TODO Complete this Comparator, which should order shapes by their number of sides (ascending order),
        // TODO THEN by area (descending order).
        Comparator<Shape> shapeComparator = new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                if (o1.getNumSides() > o2.getNumSides()) {
                    return 1;
                } else if (o1.getNumSides() == o2.getNumSides()) {
                    if (o1.getArea() < o2.getArea()) {
                        return 1;
                    } else if (o1.getArea() == o2.getArea()) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
//                int result;
//                int sideDiff = o1.getNumSides() - o2.getNumSides();
//                int areaDiff = (int) (o1.getArea() - o2.getArea());
//                if (sideDiff != 0) {
//                    result = (sideDiff > 0) ? 1 : -1;
//                } else {
//                    if (areaDiff != 0) {
//                        result = (areaDiff > 0) ? 1 : -1;
//                    } else {
//                        result = 0;
//                    }
//
//                }
//                return result;
            }
        };

        // TODO Sort shapeList using the Collections.sort method and shapeComparator
        Collections.sort(shapeList, shapeComparator);

        // Print out the result. Do not edit below this line.
        NumberFormat formatter = new DecimalFormat("#.##");
        System.out.println("Number of shapes in list: " + shapeList.size());
        for (Shape s : shapeList) {

            System.out.println(" - " + s + " has " + s.getNumSides() + " sides and an area of: " + formatter.format(s.getArea()) + "cm^2");

        }
    }

    /**
     * Main program flow. Do not edit.
     */
    private void start() {

        Shape[] shapes = new Shape[10];

        shapes[0] = new RegularPolygon(4, 5);
        shapes[1] = new Circle(4);
        shapes[2] = new Rectangle(4, 5);
        shapes[3] = new Circle(3);
        shapes[4] = new Rectangle(3, 10);
        shapes[5] = new RegularPolygon(6, 2);
        shapes[6] = new Rectangle(4, 5);
        shapes[7] = new Circle(4);
        shapes[8] = new RegularPolygon(8, 2);
        shapes[9] = new Rectangle(10, 9);

        sortedSetExample(shapes);
        System.out.println();
        comparatorExample(shapes);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        new ExerciseOne().start();
    }
}
