package com.jsouplearning.jsouplearning;

import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ModelsOfTheCars {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> modelIds = new HashMap<>();

        Document doc = Jsoup.connect("https://turbo.az/").get();


//        Elements options = doc.getElementsByClass("js-search-select-make").select("option");
        Elements options2 = doc.getElementsByClass("js-search-select-model").select("option");

        for (Element carModel : options2 ) {
            String name = carModel.text();
            String value = carModel.val();
            System.out.println(value + "  " + name + "\n");
        }
    }
}