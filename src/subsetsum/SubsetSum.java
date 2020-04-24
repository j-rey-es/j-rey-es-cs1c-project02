package subsetsum;

import java.util.ArrayList;

public class SubsetSum {
    public static ArrayList<Double> findSubset(ArrayList<Double> set, double limit)
    {
        ArrayList<ArrayList<Double>> col = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> empty = new ArrayList<Double>();
        ArrayList<Double> lAdd = new ArrayList<Double>();
        ArrayList<Double> lPrime = new ArrayList<Double>();
        double largest = 0 ;
        int largestIndex = 0;
        col.add(empty);
        for (int i = 0; i < set.size(); i++)
        {
         for (int j = 0; j < col.size(); j++)
         {
             if(sumArrayList(col.get(j)) +set.get(i) < limit)
             {
                 lAdd = col.get(j);
                 lAdd.add(set.get(i));

             }
             if(sumArrayList(col.get(j)) +set.get(i) == limit)
             {
                 lAdd = col.get(j);
                 lAdd.add(set.get(i));
                 lPrime =lAdd;
                 break;
             }
         }
            col.add(lAdd);
        }
        for (int k = 0; k<col.size(); k++)
        {
            if (sumArrayList(col.get(k)) > largest)
            {
                largest = sumArrayList(col.get(k));
                largestIndex = k;
            }
        }
        return col.get(largestIndex);
    }
    public static double sumArrayList(ArrayList<Double> set)
    {
        double sum = 0;
        for (int i = 0; i > set.size(); i++)
            sum =+set.get(i);
        return sum;
    }
}
