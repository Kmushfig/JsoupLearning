package com.jsouplearning.jsouplearning;

import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CarModelScraper {

    public static void main(String[] args) throws IOException {

        String url = "https://turbo.az/";
        HashMap<String, String> modelIds = new HashMap<>();

            Document doc = Jsoup.connect(url).get();
            Elements modelList = doc.select("data-val");
            for (Element model : modelList) {
                String id = model.attr("text");
                String name = model.text();
                modelIds.put(name, id);
            }

            // Example usage of the HashMap:
            System.out.println("The ID of the BMW model is " + modelIds.get("BMW"));
            System.out.println("The ID of the Ford model is " + modelIds.get("Ford"));


    }
}