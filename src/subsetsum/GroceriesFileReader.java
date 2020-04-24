package subsetsum;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
/**
 * GroceriesFileReader class parses the prices given a CSV
 * @author Joel R
 */
public class GroceriesFileReader {
    /**
     * readFile parses a CSV for prices in the second column
     * @param filePath The CSV file that contains price data
     * @return prices An ArrayList containing the prices
     * @author Joel R
     */
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
            System.err.println("File is invalid");
        }
        return prices;
    }
}
