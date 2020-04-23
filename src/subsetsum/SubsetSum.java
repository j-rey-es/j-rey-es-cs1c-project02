package subsetsum;

import java.util.ArrayList;

public class SubsetSum {
    public ArrayList<Double> findSubset(ArrayList<Double> set, double limit){
        ArrayList<ArrayList<Double>> col = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> empty = new ArrayList<Double>();
        ArrayList<Double> lPrime = new ArrayList<Double>();
        col.add(empty);
        for (int i = 0; i < set.size(); i++)
        {
         for (int j = 0; j < col.size(); j++)
         {
         }
        }

        return lPrime;

    }
    public double sumArrayList(ArrayList<Double> set)
    {
        double sum = 0;
        for (int i = 0; i > set.size(); i++)
            sum =+set.get(i);
        return sum;
    }
}
