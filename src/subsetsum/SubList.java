package subsetsum;

import java.util.ArrayList;

class Sublist implements Cloneable
{
    private int sum = 0;
    private ArrayList<Integer> originalObjects;
    private ArrayList<Integer> indices;

    // constructor creates an empty Sublist (no indices)
    public Sublist(ArrayList<Integer> orig)
    {
        sum = 0;
        originalObjects = orig;
        indices = new ArrayList<Integer>();
    }

    int getSum()
    { return sum; }

    // I have done the clone() for you, since you will need clone() inside addItem().
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

    Sublist addItem( int indexOfItemToAdd)
    { /* TBD */ }

    void showSublist()
    { /* TBD */ }
};