package subsetsum;

import java.util.ArrayList;

/**
 * SubList provides a data structure and algorithm for SubsetSum and stores values as Doubles
 *
 * @author Joel R
 */

class Sublist implements Cloneable
{
    private double sum = 0.0;
    private ArrayList<Double> originalObjects;
    public ArrayList<Integer> indices;

    /**
     * Parameterized constructor for an object of class Sublist.
     * Provides a data structure with supporting algorithms to calculate SubsetSum problem
     * @param orig	The original data set
     */
    public Sublist(ArrayList<Double> orig)
    {
        sum = 0;
        originalObjects = orig;
        indices = new ArrayList<Integer>();
    }

    /**
     * An Accessor for the sum of the Sublist
     * @return sum The sum of the Sublist
     */
    double getSum()
    { return sum; }
    /**
     * Clone method for index copy
     * @return A deep copy of the cloned object
     */
    public Object clone() throws CloneNotSupportedException
    {
        // shallow copy
        Sublist newObject = (Sublist)super.clone();

        // deep copy due to indices in ArrayList storing wrapper for a primitive type
        // Note: See Javadocs for class ArrayList clone() method
        //       If ArrayList is storing non-Immutables then calling
        //       ArrayList clone() will not be sufficient
        newObject.indices = (ArrayList<Integer>)indices.clone();

        return newObject;
    }
    /**
     * Adds an item to the sublist given an index from the original data set
     * Also recalculates sum of SubList
     * @param indexOfItemToAdd	Index of item to be added from original data set
     * @return addItem The Sublist that contains the new index and sum
     */
    Sublist addItem( int indexOfItemToAdd)
    {
        Sublist subAdd = new Sublist(this.originalObjects);
        try{
            subAdd = (Sublist)this.clone();
            subAdd.indices.add(indexOfItemToAdd); //adding new index to ArrayList
            subAdd.sum += originalObjects.get(indexOfItemToAdd); //modifying the sum directly
            return subAdd;
        }
        catch(CloneNotSupportedException ex){
            System.err.println("Error cannot copy");
        }
        return subAdd;

    }
    /**
     * Outputs the sublist as the original objects
     *
     */
    void showSublist()
    {
        for (int i = 0; i< indices.size(); i++)
        {
            System.out.println(originalObjects.get(indices.get(i)));
        }
    }
};