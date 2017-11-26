package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {
  
    public ArrayList<String> parseRawDataIntoStringArray(String rawData){
        String stringPattern = "##";
        ArrayList<String> response = splitStringWithRegexPattern(stringPattern , rawData);
        return response;
    }

    //parse whole Item
    public Item parseStringIntoItem(String rawItem) throws ItemParseException {
        String parsedName = parseName(rawItem);
        Double parsedPrice = parsePrice(rawItem);
        String parsedType = parseType(rawItem);
        String parsedExpDate = parseExpDate(rawItem);
        return new Item(parsedName, parsedPrice, parsedType, parsedExpDate);
    }

    //parse name
    public String parseName (String rawItemName) throws ItemParseException {
        String nameRegex = "(?<=name:)\\w+";
        Pattern namePattern = Pattern.compile(nameRegex, Pattern.CASE_INSENSITIVE);
        Matcher nameMatcher = namePattern.matcher(rawItemName);
        String name = "";
        while (nameMatcher.find()) {
            name = nameMatcher.group().toLowerCase();
        }
        if (name == null) {
            throw new ItemParseException("Could not parse name");
        }
        return name;
     }

    //parse price
    public Double parsePrice (String rawItemPrice) throws ItemParseException {
        String priceRegex = "(?<=price:)\\d+[.]\\d+";
        Pattern pricePattern = Pattern.compile(priceRegex, Pattern.CASE_INSENSITIVE);
        Matcher nameMatcher = pricePattern.matcher(rawItemPrice);
        Double price = 0.0;
        while (nameMatcher.find()) {
            price = Double.valueOf(nameMatcher.group());
        }
        if (price == 0.0) {
            throw new ItemParseException("Could not parse price");
        }
        return price;
    }

    //parse type
    public String parseType (String rawItemType) throws ItemParseException {
        String typeRegex = "(?<=type:)\\w+";
        Pattern typePattern = Pattern.compile(typeRegex, Pattern.CASE_INSENSITIVE);
        Matcher typeMatcher = typePattern.matcher(rawItemType);
        String type = "";
        while (typeMatcher.find()) {
            type = typeMatcher.group().toLowerCase();
        }
        if (type == null) {
            throw new ItemParseException("Could not parse type");
        }
        return type;
    }

    //parse expiration date
    public String parseExpDate (String rawItemExpDate) throws ItemParseException {
        String expDateRegex = "(?<=expiration:)\\d+/\\d+/\\d+";
        Pattern expDatePattern = Pattern.compile(expDateRegex, Pattern.CASE_INSENSITIVE);
        Matcher expDateMatcher = expDatePattern.matcher(rawItemExpDate);
        String expDate = "";
        while (expDateMatcher.find()) {
            expDate = expDateMatcher.group();
        }
        if (expDate == null) {
            throw new ItemParseException("Could not parse expiration date");
        }
        return expDate;
    }

    public ArrayList<String> findKeyValuePairsInRawItemData(String rawItem){
        String stringPattern = "[;|^|%|*|!|@| |,]";
        ArrayList<String> response = splitStringWithRegexPattern(stringPattern , rawItem);
        return response;
    }

    private ArrayList<String> splitStringWithRegexPattern(String stringPattern, String inputString){
        return new ArrayList<String>(Arrays.asList(inputString.split(stringPattern)));
    }
}

