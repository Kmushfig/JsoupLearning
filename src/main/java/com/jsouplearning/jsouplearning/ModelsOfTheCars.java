package com.jsouplearning.jsouplearning;

import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ModelsOfTheCars {
    public static void main(String[] args) throws IOException {

//        HashMap<String, String> modelIds = new HashMap<>();

        Document doc = Jsoup.connect("https://turbo.az/").get();

        Elements end = doc.getElementsByClass("main-search__row main-search__row-4 tz-d-grid");
//        Elements options = doc.getElementsByClass("js-search-select-make").select("option");
//        Elements options2 = doc.getElementsByClass("js-search-select-model").select("option");

        for (Element carModel : end) {

            String makeName = carModel.getElementsByClass("js-search-select-make").text();
            String makeId = carModel.getElementsByClass("js-search-select-model").attr("class");
            String modelName = carModel.getElementsByClass("js-search-select-model").text();
            String modelId = carModel.getElementsByClass("js-search-select-model").val();
//            Elements elements = doc.getElementsByClass("select optional form-control js-search-select-make");
//            String makeId = elements.attr("class");
//            String makeName = carModel.text();
//            Elements modelElements = doc.getElementsByClass("js-search-select-model");
//            String modelName = modelElements.text();
//            String modelId = modelElements.val();

            System.out.println(makeName);
            System.out.println(makeId);
            System.out.println(modelName);
            System.out.println(modelId);
        }
    }
}
