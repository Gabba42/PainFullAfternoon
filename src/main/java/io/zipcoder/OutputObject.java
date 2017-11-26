//package io.zipcoder;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class OutputObject {
//
//    private HashMap<Double, Integer> priceAndOccurrenceCount;
//
//    //constructor
//    public OutputObject(Double price, Integer seenCount) {
//        this.priceAndOccurrenceCount = new HashMap<Double, Integer>();
//    }
//
//    public void setPriceAndOccurrenceCount(Double price, Integer seenCount) {
//        this.priceAndOccurrenceCount.put(price, seenCount);
//    }
//
//    //maybe I want to format the output differently....
//    public HashMap<Double, Integer> getPriceAndOccurrenceCount() {
//        return this.priceAndOccurrenceCount;
//    }
//
//    public Integer getSeenCount (Double price) {
//        return this.priceAndOccurrenceCount.get(price);
//    }
//
//    //need a getPrice method given an object?
//
//    //given an OutputObject object, I want to access that object and update the price with the addprice method.
////    public OutputObject updatePriceAndCountOccurrenceGivenAnObject(OutputObject obj) {
////        //update the price and occurrence in its associated HashMap
////        //how can I access the HashMap from the given object?
////        //and return that object
////    }
//
////    private void addPrice(OutputObject obj, Double price) {
////        if(obj.getPriceAndOccurrenceCount().get(price);
////        //if price not in the objects HashMap, add the price and and seenCount is set to 1
////        //if price is in the objects HashMap, access the price and seenCount is incremented by 1
////    }
//}
//
////getPrice(s)BasedOnNameOfObject
//
////I want to get the price based on the name of an object
////I want to get the seen count, based on the price of an object
//
////addPrice
////given an OutputObject object, I want to either add the price if not listed and increment count by 1
////or I want to update the already listed price by incrementing it.

