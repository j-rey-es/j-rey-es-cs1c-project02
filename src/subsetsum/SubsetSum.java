package subsetsum;

import java.util.ArrayList;

public class SubsetSum {
    public static ArrayList<Double> findSubset(ArrayList<Double> set, double limit)
    {
        ArrayList<Sublist> col = new ArrayList<Sublist>();
        ArrayList<Double> purchases = new ArrayList<Double>();
        Sublist listAdd = new Sublist(set);
        Sublist lPrime = new Sublist(set);
        double largest = 0 ;
        int largestIndex = 0;
        /*ArrayList<Double> lAdd = new ArrayList<Double>(); */
        col.add(listAdd);
        for (int i = 0; i < set.size(); i++)
        {
            for (int j = 0; j < col.size(); j++)
            {
                if(col.get(j).addItem(i).getSum() < limit)
                {
                    lPrime = (col.get(j).addItem(i));
                }
                if(listAdd.addItem(i).getSum() == limit)
                {
                    lPrime = col.get(j).addItem(i);
                    break;
                }

            }
            col.add(lPrime);
        }
        for (int k = 0; k<col.size(); k++)
        {
            if (col.get(k).getSum() > largest)
            {
                largest = col.get(k).getSum();
                largestIndex = k;
            }
        }
        for (int l = 0; l <col.get(largestIndex).indices.size(); l++)
            purchases.add(set.get(col.get(largestIndex).indices.get(l)));
        return purchases;
    }
}

