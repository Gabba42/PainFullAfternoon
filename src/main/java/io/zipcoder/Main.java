package io.zipcoder;

import org.apache.commons.io.IOUtils;

import javax.xml.bind.SchemaOutputResolver;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Main {

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception {
        int errorCount = 0;

        try {
            String output = (new Main()).readRawDataToString();
            ItemParser itemParser = new ItemParser();
            ArrayList<String> dataToString = itemParser.parseRawDataIntoStringArray(output);

            //create ArrayList of Items
            ArrayList<Item> items = new ArrayList<Item>();
            for (String item : dataToString) {
                items.add(itemParser.parseStringIntoItem(item));
            }

            //create an empty HashSet

            //have a method that iterates through the arrayList and adds unique Items
            //to the HashSet with multiple prices and there occurrence (addPrice method)

            //then loop through the HashSet and display the data for each Item
            //as formatted in output.txt

        } catch(FileNotFoundException e) {
            System.out.println("file not found.");
        } catch (ItemParseException e) {
            System.out.println("could not parse");
            errorCount++;
        }
    }
}