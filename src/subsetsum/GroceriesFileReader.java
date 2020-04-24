package subsetsum;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class GroceriesFileReader {
    public ArrayList<Double> readFile(String filePath)
    {
        ArrayList<Double> prices = new ArrayList<Double>();
        try {
            BufferedReader myFileIn = new BufferedReader(new FileReader(filePath));
            String line;

            //read each line in the csv file
            while ((line = myFileIn.readLine()) != null) {

                //split line on comma
                String[] fields = line.split(",");

                //put the first and second fields into the map
                prices.add(Double.parseDouble(fields[1]));
            }
            myFileIn.close();
        } catch (IOException e) {
            //do nothing;
        }
        return prices;
    }
}
