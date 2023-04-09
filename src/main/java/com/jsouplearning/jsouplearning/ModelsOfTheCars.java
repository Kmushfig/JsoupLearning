package com.jsouplearning.jsouplearning;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ModelsOfTheCars {
    public static void main(String[] args) throws IOException {

//        HashMap<String, String> modelIds = new HashMap<>();

        Document doc = Jsoup.connect("https://turbo.az/").get();


//        Elements make = doc.getElementsByClass("js-search-select-make").select("option");
//        for (Element carMake : make) {

//            String makeName = carMake.text();
//            String makeId = carMake.val();

//            System.out.println(makeName + " " + makeId);
//        }

//        Elements model = doc.getElementsByClass("js-search-select-model").select("option");
//        for (Element carModel : model) {
//
//            String modelName = carModel.text();
//            String modelId = carModel.val();
//            System.out.println(modelName + " " + modelId);
//        }


        Elements model = doc.getElementsByClass("js-search-select-model").select("option");
//
        for (Element carModel : model) {
//            String makeName = String.valueOf(carModel.getElementsByClass("select optional form-control js-search-select-make").select("option"));
            String modelName = carModel.text();
            String modelId = carModel.val();
            System.out.println(modelId + "           " + modelName);
        }


    }
}
