package com.jsouplearning.jsouplearning;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;

public class IdAndModels {
    public static void main(String[] args) throws IOException {


        HashMap<String, String> modelIds = new HashMap<>();

        Document doc = Jsoup.connect("https://turbo.az/").get();
        Elements elementsByClass = doc.getElementsByClass("select optional form-control js-search-select-make");

        Elements options = doc.select("option");
        for (Element carModel : options) {
//            Elements make = carModel.getElementsByClass("value");
//            String id = carModel.attr("data-id");
            String name = carModel.text();
            String value = carModel.val();
            System.out.print(value + "  " + name + "\n");

//            Elements makeAndModel = carModel.getElementsByClass("text");
//            System.out.println(makeAndModel.text());

//                String name = carModel.text();
//                System.out.println("ID: " + id + ", Name: " + name);

        }
    }
}